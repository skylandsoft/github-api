package org.kohsuke.github;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/**
 * The Copilot seat information and settings of an organization.
 *
 * @see GHOrganization#getCopilotBilling()
 * @see <a href=
 *      "https://docs.github.com/en/rest/copilot/copilot-user-management?apiVersion=2022-11-28#get-copilot-seat-information-and-settings-for-an-organization">documentation</a>
 */
@SuppressFBWarnings(value = { "UWF_UNWRITTEN_FIELD", "NP_UNWRITTEN_FIELD" }, justification = "JSON API")
public class GHCopilotBilling {

    /**
     * The breakdown of Copilot seats for an organization.
     */
    @SuppressFBWarnings(value = { "UWF_UNWRITTEN_FIELD", "NP_UNWRITTEN_FIELD" }, justification = "JSON API")
    public static class SeatBreakdown {

        private int activeThisCycle;

        private int addedThisCycle;

        private int inactiveThisCycle;

        private int pendingCancellation;

        private int pendingInvitation;

        private int total;

        /**
         * Create default SeatBreakdown instance
         */
        public SeatBreakdown() {
        }

        /**
         * Gets the number of seats that used Copilot during the current billing cycle.
         *
         * @return the active seats this cycle
         */
        public int getActiveThisCycle() {
            return activeThisCycle;
        }

        /**
         * Gets the number of seats added during the current billing cycle.
         *
         * @return the added seats this cycle
         */
        public int getAddedThisCycle() {
            return addedThisCycle;
        }

        /**
         * Gets the number of seats that did not use Copilot during the current billing cycle.
         *
         * @return the inactive seats this cycle
         */
        public int getInactiveThisCycle() {
            return inactiveThisCycle;
        }

        /**
         * Gets the number of seats pending cancellation at the end of the current billing cycle.
         *
         * @return the seats pending cancellation
         */
        public int getPendingCancellation() {
            return pendingCancellation;
        }

        /**
         * Gets the number of seats pending an accepted invitation.
         *
         * @return the seats pending invitation
         */
        public int getPendingInvitation() {
            return pendingInvitation;
        }

        /**
         * Gets the total number of billed seats.
         *
         * @return the total
         */
        public int getTotal() {
            return total;
        }
    }

    private String cli;

    private String ideChat;

    private String planType;

    private String platformChat;

    private String publicCodeSuggestions;

    private SeatBreakdown seatBreakdown;

    private String seatManagementSetting;

    /**
     * Create default GHCopilotBilling instance
     */
    public GHCopilotBilling() {
    }

    /**
     * Gets the Copilot in the CLI setting ({@code enabled}, {@code disabled} or {@code unconfigured}).
     *
     * @return the CLI setting
     */
    public String getCli() {
        return cli;
    }

    /**
     * Gets the Copilot Chat in the IDE setting ({@code enabled}, {@code disabled} or {@code unconfigured}).
     *
     * @return the IDE chat setting
     */
    public String getIdeChat() {
        return ideChat;
    }

    /**
     * Gets the Copilot plan type ({@code business} or {@code enterprise}).
     *
     * @return the plan type
     */
    public String getPlanType() {
        return planType;
    }

    /**
     * Gets the Copilot Chat in GitHub.com setting ({@code enabled}, {@code disabled} or {@code unconfigured}).
     *
     * @return the platform chat setting
     */
    public String getPlatformChat() {
        return platformChat;
    }

    /**
     * Gets the public code suggestions setting ({@code allow}, {@code block} or {@code unconfigured}).
     *
     * @return the public code suggestions setting
     */
    public String getPublicCodeSuggestions() {
        return publicCodeSuggestions;
    }

    /**
     * Gets the seat breakdown.
     *
     * @return the seat breakdown
     */
    @SuppressFBWarnings(value = { "EI_EXPOSE_REP" }, justification = "Expected behavior")
    public SeatBreakdown getSeatBreakdown() {
        return seatBreakdown;
    }

    /**
     * Gets the seat management setting ({@code assign_all}, {@code assign_selected}, {@code disabled} or
     * {@code unconfigured}).
     *
     * @return the seat management setting
     */
    public String getSeatManagementSetting() {
        return seatManagementSetting;
    }
}
