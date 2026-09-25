package org.kohsuke.github;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/**
 * Represents the one page of Copilot seats result when listing Copilot seats.
 */
@SuppressFBWarnings(value = { "UWF_UNWRITTEN_PUBLIC_OR_PROTECTED_FIELD", "UWF_UNWRITTEN_FIELD", "NP_UNWRITTEN_FIELD" },
        justification = "JSON API")
class GHCopilotSeatsPage {
    private GHCopilotSeat[] seats;
    private int totalSeats;

    /**
     * Gets the total number of seats.
     *
     * @return the total seats
     */
    public int getTotalSeats() {
        return totalSeats;
    }

    /**
     * Gets the seats.
     *
     * @param owner
     *            the owner
     * @return the seats
     */
    GHCopilotSeat[] getSeats(GHOrganization owner) {
        for (GHCopilotSeat seat : seats) {
            seat.wrapUp(owner);
        }
        return seats;
    }
}
