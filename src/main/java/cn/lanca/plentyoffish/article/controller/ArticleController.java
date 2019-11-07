package cn.lanca.plentyoffish.article.controller;

import cn.lanca.plentyoffish.article.model.Article;
import cn.lanca.plentyoffish.article.model.User;
import cn.lanca.plentyoffish.article.service.IArticleService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    private IArticleService articleService;

    /**
     * 新增 文章内容 接口,需保存文章相关信息
     *
     * @param user    操作用户对象
     * @param article 文章内容
     * @return 保存结果信息 success/failure  成功/失败
     */
    @ApiOperation("新增 文章内容 接口,需保存文章相关信息")
    @PostMapping("/article/add")
    public String addNewArticle(@RequestParam User user, @RequestParam Article article) {
        // User and Article Object need to structure(构造)
        return articleService.addArticleInfo(user, article);
    }

    /**
     * 文章展示列表,做成 分页查询
     *
     * @param currentPage 当前页
     * @param pageSize    每页显示条数
     * @return
     */
    @ApiOperation("文章展示列表,做成 分页查询")
    @GetMapping("/article/list")
    public PageInfo<Article> getArticleInfoList(
            @ApiParam(value = "当前页")
            @RequestParam(value = "current_page", defaultValue = "1", required = false) Integer currentPage,
            @ApiParam(value = "每页条数，查询全部请传0")
            @RequestParam(value = "page_size", defaultValue = "10", required = false) Integer pageSize) {
        PageInfo<Article> allArticleListInfo = articleService.getAllArticleListInfo(currentPage, pageSize);
        return allArticleListInfo;
    }

}
