package cn.lanca.plentyoffish.article.service.impl;

import cn.lanca.plentyoffish.article.dao.ICommentDao;
import cn.lanca.plentyoffish.article.model.Comment;
import cn.lanca.plentyoffish.article.service.ICommentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:文章评论业务实现层
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/7 15:38
 */
@Service
public class CommentServerImpl implements ICommentServer {
    /**
     * 注入commentDao
     */
    @Autowired
    private ICommentDao commentDao;

    /**
     * 新增/添加评论
     *
     * @param comment 评论对象
     * @return Long
     */
    @Override
    public Long insertNewComment(Comment comment) {
        return commentDao.insertNewComment(comment);
    }
}
