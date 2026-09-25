package org.kohsuke.github;

import java.util.Iterator;

import javax.annotation.Nonnull;

/**
 * Iterable for Copilot seats listing.
 */
class GHCopilotSeatsIterable extends PagedIterable<GHCopilotSeat> {
    private final transient GHOrganization owner;
    private final GitHubRequest request;

    private GHCopilotSeatsPage result;

    /**
     * Instantiates a new GH copilot seats iterable.
     *
     * @param owner
     *            the owner
     * @param requestBuilder
     *            the request builder
     */
    public GHCopilotSeatsIterable(GHOrganization owner, GitHubRequest.Builder<?> requestBuilder) {
        this.owner = owner;
        this.request = requestBuilder.build();
    }

    /**
     * Iterator.
     *
     * @param pageSize
     *            the page size
     * @return the paged iterator
     */
    @Nonnull
    @Override
    public PagedIterator<GHCopilotSeat> _iterator(int pageSize) {
        return new PagedIterator<>(
                adapt(GitHubPageIterator.create(owner.root().getClient(), GHCopilotSeatsPage.class, request, pageSize)),
                null);
    }

    /**
     * Adapt.
     *
     * @param base
     *            the base
     * @return the iterator
     */
    protected Iterator<GHCopilotSeat[]> adapt(final Iterator<GHCopilotSeatsPage> base) {
        return new Iterator<GHCopilotSeat[]>() {
            public boolean hasNext() {
                return base.hasNext();
            }

            public GHCopilotSeat[] next() {
                GHCopilotSeatsPage v = base.next();
                if (result == null) {
                    result = v;
                }
                return v.getSeats(owner);
            }
        };
    }
}
