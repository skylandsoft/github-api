package org.kohsuke.github;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.Collections;
import java.util.List;

/**
 * The billing usage report of an organization.
 *
 * @see GHOrganization#getBillingUsage(int, int)
 * @see <a href=
 *      "https://docs.github.com/en/rest/billing/usage?apiVersion=2022-11-28#get-billing-usage-report-for-an-organization">documentation</a>
 */
@SuppressFBWarnings(value = { "UWF_UNWRITTEN_FIELD", "NP_UNWRITTEN_FIELD" }, justification = "JSON API")
public class GHBillingUsageReport {

    // The billing usage API uses camelCase property names, unlike the rest of the API.
    @JsonProperty("usageItems")
    private List<GHBillingUsageItem> usageItems;

    /**
     * Create default GHBillingUsageReport instance
     */
    public GHBillingUsageReport() {
    }

    /**
     * Gets the usage items.
     *
     * @return the usage items
     */
    public List<GHBillingUsageItem> getUsageItems() {
        return usageItems == null ? Collections.emptyList() : Collections.unmodifiableList(usageItems);
    }
}
