package cn.lanca.plentyoffish.article.dao;

import cn.lanca.plentyoffish.article.model.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Description:
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/5 18:15
 */
@Repository
public interface IArticleDao {
    /**
     * article_id
     * user_id
     * article_title
     * acrticle_content
     * article_views
     * article_comment_count
     * article_createtime
     * aeticle_updatetime
     * article_like_count
     * <p>
     * article_id,user_id,article_title,acrticle_content,article_views,article_comment_count,article_createtime,aeticle_updatetime,article_like_count
     */
    /**
     *
     * @param article
     * @return
     */
    @Insert("INSERT INTO lanca_article (article_id,user_id,article_title,acrticle_content,article_views,"
            + " article_comment_count,article_createtime,aeticle_updatetime,article_like_count)"
            + " VALUES (#{article.articleId},#{article.userId},#{article.articleTitle},#{article.acrticleContent},#{article.articleViews},#{article.articleCommentCount},"
            + " #{article.articleCreatetime},#{article.aeticleUpdatetime},#{article.articleLikeCount})")
    Integer insertArticle(@Param("article") Article article);
}
