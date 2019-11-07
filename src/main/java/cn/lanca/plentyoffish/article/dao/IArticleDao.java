package cn.lanca.plentyoffish.article.dao;

import cn.lanca.plentyoffish.article.model.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description: Article实体类的数据库操作层(Dao层)
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/5 18:15
 */
@Repository
public interface IArticleDao {
    /**
     * article_id,user_id,article_title,acrticle_content,article_views,article_comment_count,article_createtime,aeticle_updatetime,article_like_count
     */
    /**
     * @param article 文章对象
     * @return
     */
    @Insert("INSERT INTO lanca_article (article_id,user_id,article_title,article_content,article_views,"
            + " article_comment_count,article_createtime,article_updatetime,article_like_count)"
            + " VALUES (#{article.articleId},#{article.userId},#{article.articleTitle},#{article.articleContent},#{article.articleViews},#{article.articleCommentCount},"
            + " #{article.articleCreateTime},#{article.articleUpdateTime},#{article.articleLikeCount})")
    Integer insertArticle(@Param("article") Article article);

    /**
     * 查询所有列表
     *
     * @return List<Article>
     */
    @Results(id = "article",
            value = {
                    @Result(column = "article_id", property = "articleId"),
                    @Result(column = "user_id", property = "userId"),
                    @Result(column = "article_title", property = "articleTitle"),
                    @Result(column = "article_content", property = "articleContent"),
                    @Result(column = "article_views", property = "articleViews"),
                    @Result(column = "article_comment_count", property = "articleCommentCount"),
                    @Result(column = "article_createtime", property = "articleCreateTime"),
                    @Result(column = "article_updatetime", property = "articleUpdateTime"),
                    @Result(column = "article_like_count", property = "articleLikeCount")
            })
    @Select("select article_id,user_id,article_title,article_content,article_views,article_comment_count,"
            + "article_createtime,article_updatetime,article_like_count from lanca_article")
    List<Article> getAllArticleInfo();
}
