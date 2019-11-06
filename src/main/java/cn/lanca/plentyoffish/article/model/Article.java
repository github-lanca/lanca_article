package cn.lanca.plentyoffish.article.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Description: 博文/博客 内容的实体类 Article
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/5 18:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    /**
     * article_id
     * 文章唯一标识id
     */
    private Long articleId;
    /**
     * user_id
     * 用户id/文章发表者id
     */
    private Long userId;
    /**
     * article_title)
     * 文章题目
     */
    private String articleTitle;
    /**
     * article_content
     * 文章内容
     */
    private String articleContent;
    /**
     * article_views
     * 文章浏览量
     */
    private Long articleViews;
    /**
     * article_comment_count
     * 文章评论数
     */
    private Long articleCommentCount;
    /**
     * article_createtime
     * 文章创建时间
     */
    private Date articleCreateTime;
    /**
     * aeticle_updatetime
     * 文章最后一次更新时间
     */
    private Date aeticleUpdateTime;
    /**
     * article_like_count
     * 文章点赞数
     */
    private Long articleLikeCount;
}
