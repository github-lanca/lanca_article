package cn.lanca.plentyoffish.article.controller;

import cn.lanca.plentyoffish.article.model.Article;
import cn.lanca.plentyoffish.article.model.User;
import cn.lanca.plentyoffish.article.service.IArticleServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:博客/博文 的发布,删除,编辑/修改的Controller层
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/5 18:15
 */
@RestController
public class ArticleController {

    /**
     * 注入 articleServer
     */
    @Autowired
    private IArticleServer articleServer;

    /**
     * 新增 文章内容 接口,需保存文章相关信息
     *
     * @param user    操作用户对象
     * @param article 文章内容
     * @return 保存结果信息 success/failure  成功/失败
     */
    @PostMapping("/article/add")
    public String addNewArticle(@RequestParam User user, @RequestParam Article article) {
        // User and Article Object need to structure(构造)
        return articleServer.addArticleInfo(user, article);
    }
}
