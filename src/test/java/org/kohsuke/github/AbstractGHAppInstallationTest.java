package org.kohsuke.github;

import io.jsonwebtoken.Jwts;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;

public class AbstractGHAppInstallationTest extends AbstractGitHubWireMockTest {

    private static String TEST_APP_ID_1 = "82994";
    private static String TEST_APP_ID_2 = "83009";
    private static String TEST_APP_ID_3 = "89368";
    private static String PRIVATE_KEY_FILE_APP_1 = "/ghapi-test-app-1.private-key.pem";
    private static String PRIVATE_KEY_FILE_APP_2 = "/ghapi-test-app-2.private-key.pem";
    private static String PRIVATE_KEY_FILE_APP_3 = "/ghapi-test-app-3.private-key.pem";

    private String createJwtToken(String keyFileResouceName, String appId) {
        try {
            String keyPEM = IOUtils.toString(this.getClass().getResource(keyFileResouceName), "US-ASCII")
                    .replaceAll("(?m)^--.*", "") // remove comments from PEM to allow decoding
                    .replaceAll("\\s", "");

            PKCS8EncodedKeySpec keySpecPKCS8 = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(keyPEM));
            PrivateKey privateKey = KeyFactory.getInstance("RSA").generatePrivate(keySpecPKCS8);

            return Jwts.builder()
                    .setIssuedAt(Date.from(Instant.now()))
                    .setExpiration(Date.from(Instant.now().plus(5, ChronoUnit.MINUTES)))
                    .setIssuer(appId)
                    .signWith(privateKey)
                    .compact();
        } catch (Exception e) {
            throw new RuntimeException("Error creating JWT token.", e);
        }
    }

    private GHAppInstallation getAppInstallationWithToken(String jwtToken) throws IOException {
        GitHub gitHub = getGitHubBuilder().withJwtToken(jwtToken)
                .withEndpoint(mockGitHub.apiServer().baseUrl())
                .build();

        GHAppInstallation appInstallation = gitHub.getApp()
                .listInstallations()
                .toList()
                .stream()
                .filter(it -> it.getAccount().login.equals("hub4j-test-org"))
                .findFirst()
                .get();

        appInstallation
                .setRoot(getGitHubBuilder().withAppInstallationToken(appInstallation.createToken().create().getToken())
                        .withEndpoint(mockGitHub.apiServer().baseUrl())
                        .build());

        return appInstallation;
    }

    protected GHAppInstallation getAppInstallationWithTokenApp1() throws IOException {
        return getAppInstallationWithToken(createJwtToken(PRIVATE_KEY_FILE_APP_1, TEST_APP_ID_1));
    }

    protected GHAppInstallation getAppInstallationWithTokenApp2() throws IOException {
        return getAppInstallationWithToken(createJwtToken(PRIVATE_KEY_FILE_APP_2, TEST_APP_ID_2));
    }

    protected GHAppInstallation getAppInstallationWithTokenApp3() throws IOException {
        return getAppInstallationWithToken(createJwtToken(PRIVATE_KEY_FILE_APP_3, TEST_APP_ID_3));
    }

}
