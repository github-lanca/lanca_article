package cn.lanca.plentyoffish.article.service.impl;

import cn.lanca.plentyoffish.article.dao.IArticleDao;
import cn.lanca.plentyoffish.article.model.Article;
import cn.lanca.plentyoffish.article.model.User;
import cn.lanca.plentyoffish.article.service.IArticleServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/5 18:16
 */
@Service
public class ArticleServerImpl implements IArticleServer {
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

        Integer integer = articleDao.insertArticle(article);
        if (integer != null && integer > 0) {
            return "Insert Article Success";
        }
        return "Insert Article Failure";
    }
}
