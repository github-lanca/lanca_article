package cn.lanca.plentyoffish.article.controller;

import cn.lanca.plentyoffish.article.model.ArticleSort;
import cn.lanca.plentyoffish.article.service.ISortService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:ArticleSort文章分类
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/8 15:45
 */
@RestController
public class ArticleSortController {
    /**
     * inject sortService
     */
    @Autowired
    private ISortService sortService;

    @ApiOperation("新增文章分类")
    @GetMapping("/sort/insert")
    public String insertArticleSort(ArticleSort articleSort) {
        return sortService.insertArticleSort(articleSort);
    }
}
