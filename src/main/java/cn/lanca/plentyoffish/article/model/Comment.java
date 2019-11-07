package cn.lanca.plentyoffish.article.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Description:评论Domain
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/7 15:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    /**
     * 评论表id
     * comment_id
     */
    private Long commentId;
    /**
     * 用户id
     * user_id
     */
    private Long userId;
    /**
     * 评论文章的id
     * article_id
     */
    private Long articleId;
    /**
     * 点赞数
     * comment_like_count
     */
    private Long commentLikeCount;
    /**
     * 评论日期
     * comment_date
     */
    private Date commentDate;
    /**
     * 评论内容
     * comment_content
     */
    private String commentContent;
    /**
     * 父评论id
     * parent_comment_id
     */
    private Long parentCommentId;
}
