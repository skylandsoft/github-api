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

// TODO: Auto-generated Javadoc
/**
 * The enum GHIssueType.
 *
 */
public enum GHIssueType {
    ADDED_TO_PROJECT("added_to_project"),
    ASSIGNED("assigned"),
    AUTOMATIC_BASE_CHANGE_FAILED("automatic_base_change_failed"),
    AUTOMATIC_BASE_CHANGE_SUCCEEDED("automatic_base_change_succeeded"),
    BASE_REF_CHANGED("base_ref_changed"),
    CLOSED("closed"),
    COMMENTED("commented"),
    COMMITTED("committed"),
    CONNECTED("connected"),
    CONVERT_TO_DRAFT("convert_to_draft"),
    CONVERTED_NOTE_TO_ISSUE("converted_note_to_issue"),
    CONVERTED_TO_DISCUSSION("converted_to_discussion"),
    CROSS_REFERENCED("cross-referenced"),
    DEMILESTONED("demilestoned"),
    DEPLOYED("deployed"),
    DEPLOYMENT_ENVIRONMENT_CHANGED("deployment_environment_changed"),
    DISCONNECTED("disconnected"),
    HEAD_REF_DELETED("head_ref_deleted"),
    HEAD_REF_RESTORED("head_ref_restored"),
    HEAD_REF_FORCE_PUSHED("head_ref_force_pushed"),
    LABELED("labeled"),
    LOCKED("locked"),
    MENTIONED("mentioned"),
    MARKED_AS_DUPLICATE("marked_as_duplicate"),
    MERGED("merged"),
    MILESTONED("milestoned"),
    MOVED_COLUMNS_IN_PROJECT("moved_columns_in_project"),
    PINNED("pinned"),
    READY_FOR_REVIEW("ready_for_review"),
    REFERENCED("referenced"),
    REMOVED_FROM_PROJECT("removed_from_project"),
    RENAMED("renamed"),
    REOPENED("reopened"),
    REVIEW_DISMISSED("review_dismissed"),
    REVIEW_REQUESTED("review_requested"),
    REVIEW_REQUEST_REMOVED("review_request_removed"),
    REVIEWED("reviewed"),
    SUBSCRIBED("subscribed"),
    TRANSFERRED("transferred"),
    UNASSIGNED("unassigned"),
    UNLABELED("unlabeled"),
    UNLOCKED("unlocked"),
    UNMARKED_AS_DUPLICATE("unmarked_as_duplicate"),
    UNPINNED("unpinned"),
    UNSUBSCRIBED("unsubscribed"),
    USER_BLOCKED("user_blocked");

    final String key;
    GHIssueType(final String key) {
        this.key = key;
    }
}
