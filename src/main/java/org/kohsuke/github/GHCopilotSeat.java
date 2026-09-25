package org.kohsuke.github;

import com.infradna.tool.bridge_method_injector.WithBridgeMethods;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

/**
 * A Copilot seat assigned to a user of an organization.
 *
 * @see GHOrganization#listCopilotSeats()
 * @see <a href=
 *      "https://docs.github.com/en/rest/copilot/copilot-user-management?apiVersion=2022-11-28#list-all-copilot-seat-assignments-for-an-organization">documentation</a>
 */
@SuppressFBWarnings(value = { "UWF_UNWRITTEN_FIELD", "NP_UNWRITTEN_FIELD" }, justification = "JSON API")
public class GHCopilotSeat extends GitHubBridgeAdapterObject {

    private GHUser assignee;

    private GHTeam assigningTeam;

    private String createdAt;

    private String lastActivityAt;

    private String lastActivityEditor;

    private String pendingCancellationDate;

    private String planType;

    private String updatedAt;

    /**
     * Create default GHCopilotSeat instance
     */
    public GHCopilotSeat() {
    }

    /**
     * Gets the user the seat is assigned to.
     *
     * @return the assignee
     */
    @SuppressFBWarnings(value = { "EI_EXPOSE_REP" }, justification = "Expected behavior")
    public GHUser getAssignee() {
        return assignee;
    }

    /**
     * Gets the team through which the seat was assigned.
     *
     * @return the assigning team, or null when the seat was assigned directly
     */
    @SuppressFBWarnings(value = { "EI_EXPOSE_REP" }, justification = "Expected behavior")
    public GHTeam getAssigningTeam() {
        return assigningTeam;
    }

    /**
     * Gets the date the seat was created.
     *
     * @return the created date
     */
    @WithBridgeMethods(value = Date.class, adapterMethod = "instantToDate")
    public Instant getCreatedAt() {
        return GitHubClient.parseInstant(createdAt);
    }

    /**
     * Gets the date of the assignee's last Copilot activity.
     *
     * @return the last activity date, or null when there has been no activity
     */
    @WithBridgeMethods(value = Date.class, adapterMethod = "instantToDate")
    public Instant getLastActivityAt() {
        return GitHubClient.parseInstant(lastActivityAt);
    }

    /**
     * Gets the editor of the assignee's last Copilot activity.
     *
     * @return the last activity editor, or null when there has been no activity
     */
    public String getLastActivityEditor() {
        return lastActivityEditor;
    }

    /**
     * Gets the date the seat will be cancelled, at the start of that day in UTC.
     *
     * @return the pending cancellation date, or null when no cancellation is pending
     */
    @WithBridgeMethods(value = Date.class, adapterMethod = "instantToDate")
    public Instant getPendingCancellationDate() {
        // A calendar date (yyyy-MM-dd), not a timestamp.
        return pendingCancellationDate == null
                ? null
                : LocalDate.parse(pendingCancellationDate).atStartOfDay(ZoneOffset.UTC).toInstant();
    }

    /**
     * Gets the Copilot plan type of the seat ({@code business}, {@code enterprise} or {@code unknown}).
     *
     * @return the plan type
     */
    public String getPlanType() {
        return planType;
    }

    /**
     * Gets the date the seat was last updated.
     *
     * @return the updated date
     */
    @WithBridgeMethods(value = Date.class, adapterMethod = "instantToDate")
    public Instant getUpdatedAt() {
        return GitHubClient.parseInstant(updatedAt);
    }

    /**
     * Wrap up.
     *
     * @param owner
     *            the organization the seat belongs to
     * @return the GH copilot seat
     */
    GHCopilotSeat wrapUp(GHOrganization owner) {
        if (assigningTeam != null) {
            assigningTeam.wrapUp(owner);
        }
        return this;
    }
}
