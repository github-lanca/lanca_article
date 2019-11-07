package cn.lanca.plentyoffish.article.service.impl;

import cn.lanca.plentyoffish.article.dao.IArticleDao;
import cn.lanca.plentyoffish.article.model.Article;
import cn.lanca.plentyoffish.article.model.User;
import cn.lanca.plentyoffish.article.service.IArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/5 18:16
 */
@Service
public class ArticleServiceImpl implements IArticleService {
    /**
     * 注入 articleDao
     */
    @Autowired
    private IArticleDao articleDao;

    /**
     * @param user    操作用户对象
     * @param article 文章内容
     * @return
     */
    @Override
    public String addArticleInfo(User user, Article article) {

        // 在这儿构造数据对象

        Integer integer = articleDao.insertArticle(article);
        if (integer != null && integer > 0) {
            return "Insert Article Success";
        }
        return "Insert Article Failure";
    }

    /**
     * 文章展示列表,做成 分页查询,列表展示
     *
     * @param currentPage 当前页
     * @param pageSize    每页显示条数
     * @return PageInfo<Article>
     */
    @Override
    public PageInfo<Article> getAllArticleListInfo(Integer currentPage, Integer pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Article> allArticleInfo = articleDao.getAllArticleInfo();
        PageInfo<Article> pageInfo = new PageInfo<>(allArticleInfo);
        return pageInfo;
    }
}
