package com.cloudaware.cloudmine.appengine.model.cloudtasks;

/**
 * Pull task target.
 * <p>
 * This proto can only be used for tasks in a queue which has Queue.pull_queue_config set.
 * <p>
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PullTaskTarget {

    /**
     * The maximum number of attempts for a task.
     * <p>
     * Cloud Tasks will attempt the task `max_attempts` times. If the first attempt fails, then there
     * will be `max_attempts - 1` retries). Must be > 0.
     * The value may be {@code null}.
     */

    private Integer maxAttempts;

    /**
     * A data payload consumed by the task worker to execute the task.
     * The value may be {@code null}.
     */
    private String payload;

    /**
     * A meta-data tag for this task.
     * <p>
     * This value is used by CloudTasks.PullTasks calls when PullTasksRequest.filter is `tag=`.
     * <p>
     * The tag must be less than 500 bytes.
     * The value may be {@code null}.
     */
    private String tag;

    /**
     * If true, then the number of attempts is unlimited. If false, then by default Cloud Tasks will
     * retry the task 100 times.
     * The value may be {@code null}.
     */
    private Boolean unlimitedAttempts;

    /**
     * The maximum number of attempts for a task.
     * <p>
     * Cloud Tasks will attempt the task `max_attempts` times. If the first attempt fails, then there
     * will be `max_attempts - 1` retries). Must be > 0.
     *
     * @return value or {@code null} for none
     */
    public Integer getMaxAttempts() {
        return maxAttempts;
    }

    /**
     * The maximum number of attempts for a task.
     * <p>
     * Cloud Tasks will attempt the task `max_attempts` times. If the first attempt fails, then there
     * will be `max_attempts - 1` retries). Must be > 0.
     *
     * @param maxAttempts maxAttempts or {@code null} for none
     */
    public PullTaskTarget setMaxAttempts(final Integer maxAttempts) {
        this.maxAttempts = maxAttempts;
        return this;
    }

    /**
     * A data payload consumed by the task worker to execute the task.
     *
     * @return value or {@code null} for none
     * @see #decodePayload()
     */
    public String getPayload() {
        return payload;
    }

    /**
     * A data payload consumed by the task worker to execute the task.
     *
     * @return Base64 decoded value or {@code null} for none
     * @see #getPayload()
     * @since 1.14
     */
    public byte[] decodePayload() {
        return com.google.api.client.util.Base64.decodeBase64(payload);
    }

    /**
     * A data payload consumed by the task worker to execute the task.
     *
     * @param payload payload or {@code null} for none
     * @see #encodePayload()
     */
    public PullTaskTarget setPayload(final String payload) {
        this.payload = payload;
        return this;
    }

    /**
     * A data payload consumed by the task worker to execute the task.
     *
     * @see #setPayload()
     * <p>
     * <p>
     * The value is encoded Base64 or {@code null} for none.
     * </p>
     * @since 1.14
     */
    public PullTaskTarget encodePayload(final byte[] payloadArg) {
        this.payload = com.google.api.client.util.Base64.encodeBase64URLSafeString(payloadArg);
        return this;
    }

    /**
     * A meta-data tag for this task.
     * <p>
     * This value is used by CloudTasks.PullTasks calls when PullTasksRequest.filter is `tag=`.
     * <p>
     * The tag must be less than 500 bytes.
     *
     * @return value or {@code null} for none
     * @see #decodeTag()
     */
    public String getTag() {
        return tag;
    }

    /**
     * A meta-data tag for this task.
     * <p>
     * This value is used by CloudTasks.PullTasks calls when PullTasksRequest.filter is `tag=`.
     * <p>
     * The tag must be less than 500 bytes.
     *
     * @return Base64 decoded value or {@code null} for none
     * @see #getTag()
     * @since 1.14
     */
    public byte[] decodeTag() {
        return com.google.api.client.util.Base64.decodeBase64(tag);
    }

    /**
     * A meta-data tag for this task.
     * <p>
     * This value is used by CloudTasks.PullTasks calls when PullTasksRequest.filter is `tag=`.
     * <p>
     * The tag must be less than 500 bytes.
     *
     * @param tag tag or {@code null} for none
     * @see #encodeTag()
     */
    public PullTaskTarget setTag(final String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * A meta-data tag for this task.
     * <p>
     * This value is used by CloudTasks.PullTasks calls when PullTasksRequest.filter is `tag=`.
     * <p>
     * The tag must be less than 500 bytes.
     *
     * @see #setTag()
     * <p>
     * <p>
     * The value is encoded Base64 or {@code null} for none.
     * </p>
     * @since 1.14
     */
    public PullTaskTarget encodeTag(final byte[] tagArg) {
        this.tag = com.google.api.client.util.Base64.encodeBase64URLSafeString(tagArg);
        return this;
    }

    /**
     * If true, then the number of attempts is unlimited. If false, then by default Cloud Tasks will
     * retry the task 100 times.
     *
     * @return value or {@code null} for none
     */
    public Boolean getUnlimitedAttempts() {
        return unlimitedAttempts;
    }

    /**
     * If true, then the number of attempts is unlimited. If false, then by default Cloud Tasks will
     * retry the task 100 times.
     *
     * @param unlimitedAttempts unlimitedAttempts or {@code null} for none
     */
    public PullTaskTarget setUnlimitedAttempts(final Boolean unlimitedAttempts) {
        this.unlimitedAttempts = unlimitedAttempts;
        return this;
    }

}
