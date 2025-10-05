/*
 * The MIT License
 *
 * Copyright (c) 2011, Eric Maupin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.kohsuke.github;

/**
 * The enum GHIssueType.
 */
public class GHIssueType {
    public static final String ADDED_TO_PROJECT = "added_to_project";
    public static final String ASSIGNED = "assigned";
    public static final String AUTOMATIC_BASE_CHANGE_FAILED = "automatic_base_change_failed";
    public static final String AUTOMATIC_BASE_CHANGE_SUCCEEDED = "automatic_base_change_succeeded";
    public static final String BASE_REF_CHANGED = "base_ref_changed";
    public static final String CLOSED = "closed";
    public static final String COMMENTED = "commented";
    public static final String COMMITTED = "committed";
    public static final String CONNECTED = "connected";
    public static final String CONVERTED_NOTE_TO_ISSUE = "converted_note_to_issue";
    public static final String CONVERTED_TO_DISCUSSION = "converted_to_discussion";
    public static final String CONVERT_TO_DRAFT = "convert_to_draft";
    public static final String CROSS_REFERENCED = "cross-referenced";
    public static final String DEMILESTONED = "demilestoned";
    public static final String DEPLOYED = "deployed";
    public static final String DEPLOYMENT_ENVIRONMENT_CHANGED = "deployment_environment_changed";
    public static final String DISCONNECTED = "disconnected";
    public static final String HEAD_REF_DELETED = "head_ref_deleted";
    public static final String HEAD_REF_FORCE_PUSHED = "head_ref_force_pushed";
    public static final String HEAD_REF_RESTORED = "head_ref_restored";
    public static final String LABELED = "labeled";
    public static final String LOCKED = "locked";
    public static final String MARKED_AS_DUPLICATE = "marked_as_duplicate";
    public static final String MENTIONED = "mentioned";
    public static final String MERGED = "merged";
    public static final String MILESTONED = "milestoned";
    public static final String MOVED_COLUMNS_IN_PROJECT = "moved_columns_in_project";
    public static final String PINNED = "pinned";
    public static final String READY_FOR_REVIEW = "ready_for_review";
    public static final String REFERENCED = "referenced";
    public static final String REMOVED_FROM_PROJECT = "removed_from_project";
    public static final String RENAMED = "renamed";
    public static final String REOPENED = "reopened";
    public static final String REVIEWED = "reviewed";
    public static final String REVIEW_DISMISSED = "review_dismissed";
    public static final String REVIEW_REQUESTED = "review_requested";
    public static final String REVIEW_REQUEST_REMOVED = "review_request_removed";
    public static final String SUBSCRIBED = "subscribed";
    public static final String TRANSFERRED = "transferred";
    public static final String UNASSIGNED = "unassigned";
    public static final String UNLABELED = "unlabeled";
    public static final String UNLOCKED = "unlocked";
    public static final String UNMARKED_AS_DUPLICATE = "unmarked_as_duplicate";
    public static final String UNPINNED = "unpinned";
    public static final String UNSUBSCRIBED = "unsubscribed";
    public static final String USER_BLOCKED = "user_blocked";

    private GHIssueType() {
    }
}
