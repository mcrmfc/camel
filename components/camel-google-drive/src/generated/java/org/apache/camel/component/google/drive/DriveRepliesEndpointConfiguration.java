
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.google.api.services.drive.Drive$Replies
 */
@UriParams
@Configurer
public final class DriveRepliesEndpointConfiguration extends GoogleDriveConfiguration {

    @UriParam
    private String commentId;

    @UriParam
    private com.google.api.services.drive.model.CommentReply content;

    @UriParam
    private String fileId;

    @UriParam
    private String replyId;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public com.google.api.services.drive.model.CommentReply getContent() {
        return content;
    }

    public void setContent(com.google.api.services.drive.model.CommentReply content) {
        this.content = content;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId;
    }
}
