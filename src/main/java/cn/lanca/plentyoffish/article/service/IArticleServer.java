package cn.lanca.plentyoffish.article.service;

import cn.lanca.plentyoffish.article.model.Article;
import cn.lanca.plentyoffish.article.model.User;

/**
 * Description:
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/5 18:16
 */
public interface IArticleServer {
    /**
     * 新增 文章内容 接口,需保存文章相关信息
     *
     * @param user    操作用户对象
     * @param article 文章内容
     * @return 保存结果信息 success/failure  成功/失败
     */
    String addArticleInfo(User user, Article article);
}
