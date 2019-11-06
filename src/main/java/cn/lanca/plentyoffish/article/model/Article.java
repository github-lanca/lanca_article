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
     * article_id	bigint
     * 文章id
     */
    private Long articleId;

    /**
     * user_id	bigint
     * 用户id/文章发表者id
     */
    private Long userId;
    /**
     * article_title	text
     * 文章题目
     * 一般用String就可以了，
     * 如果文本过大的话，
     * 可以使用 java.sql 包下的Clob类。
     */
    private String articleTitle;
    /**
     * acrticle_content	longtext
     * 文章内容
     */
    private String acrticleContent;
    /**
     * article_views	bigint
     * 文章浏览量
     */
    private Long articleViews;
    /**
     * article_comment_count	bigint
     * 文章评论数
     */
    private Long articleCommentCount;
    /**
     * article_createtime	datetime
     * 文章创建时间
     */
    private Date articleCreatetime;
    /**
     * aeticle_updatetime	datetime
     * 文章最后一次更新时间
     */
    private Date aeticleUpdatetime;
    /**
     * article_like_count	bigint
     * 文章点赞数
     */
    private Long articleLikeCount;
}
