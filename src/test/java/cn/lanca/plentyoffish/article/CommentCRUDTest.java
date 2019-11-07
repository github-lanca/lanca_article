package cn.lanca.plentyoffish.article;

import cn.lanca.plentyoffish.article.dao.ICommentDao;
import cn.lanca.plentyoffish.article.model.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * Description:
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/7 16:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentCRUDTest {
    /**
     * inject commmentDao
     */
    @Autowired
    private ICommentDao commentDao;


    /**
     * 新增评论测试
     */
    @Test
    public void insertNewCommentTest() {
        Comment comment = new Comment();
        // 三体
        comment.setArticleId(2019110672001L);
        // 评论内容
        comment.setCommentContent("wen文章不错哟");
        //评论日期
        comment.setCommentDate(new Date());
        //评论id 自己生成一个
        comment.setCommentId(201910001L);
        // 该条评论点赞数
        comment.setCommentLikeCount(10L);
        //此评论的父评论id commentId
        comment.setParentCommentId(0L);
        comment.setUserId(201911051001L);
        Long aLong = commentDao.insertNewComment(comment);
        System.out.println("-->" + aLong);
    }
}
