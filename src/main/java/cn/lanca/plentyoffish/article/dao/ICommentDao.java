package cn.lanca.plentyoffish.article.dao;

import cn.lanca.plentyoffish.article.model.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Description:评论表数据库操作(Dao层)
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/7 15:37
 */
@Repository
public interface ICommentDao {

    /**
     * 新增/添加 评论
     *
     * @param comment 评论对象
     * @return Long
     */
    @Insert("insert into lanca_comments(comment_id,user_id,article_id,comment_like_count,comment_date,comment_content,parent_comment_id)"
            + "VALUES(#{comment.commentId},#{comment.userId},#{comment.articleId},#{comment.commentLikeCount},#{comment.commentDate},#{comment.commentContent},#{comment.parentCommentId})")
    Long insertNewComment(@Param("comment") Comment comment);
}
