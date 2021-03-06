package org.kohsuke.github;

/**
 * Hook event type.
 *
 * See http://developer.github.com/v3/events/types/
 *
 * @author Kohsuke Kawaguchi
 */
public enum GHEvent {
    COMMIT_COMMENT,
    CREATE,
    DELETE,
    DOWNLOAD,
    FOLLOW,
    FORK,
    FORK_APPLY,
    GIST,
    GOLLUM,
    ISSUE_COMMENT,
    ISSUES,
    MEMBER,
    PUBLIC,
    PULL_REQUEST,
    PUSH,
    TEAM_ADD,
    WATCH
}
