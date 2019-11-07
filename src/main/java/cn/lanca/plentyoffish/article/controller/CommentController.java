package cn.lanca.plentyoffish.article.controller;

import cn.lanca.plentyoffish.article.model.Comment;
import cn.lanca.plentyoffish.article.service.ICommentServer;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/7 16:40
 */
@RestController
public class CommentController {
    /**
     * 注入 commentServer
     */
    @Autowired
    private ICommentServer commentServer;

    /**
     * 新增/添加 评论
     *
     * @param comment 评论对象
     * @return Long
     */
    @ApiOperation("新增/添加 评论")
    @GetMapping("/comment/add")
    public String insertNewComment(@RequestParam Comment comment) {
        Long aLong = commentServer.insertNewComment(comment);
        if (aLong != null && aLong > 0) {
            return "评论成功";
        }
        return "评论失败";
    }
}
