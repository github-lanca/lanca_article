package cn.lanca.plentyoffish.article.service;

import cn.lanca.plentyoffish.article.model.Comment;

/**
 * Description: 文章评论业务接口层
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/7 15:38
 */
public interface ICommentServer {


    /**
     * 新增/添加评论
     *
     * @param comment 评论对象
     * @return Long
     */
    Long insertNewComment(Comment comment);
}
