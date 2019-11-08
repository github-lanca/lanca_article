package cn.lanca.plentyoffish.article.service;

import cn.lanca.plentyoffish.article.model.ArticleSort;

/**
 * Description:
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/8 15:44
 */
public interface ISortService {
    /**
     * 新增文章分类
     *
     * @param articleSort 文章分类
     * @return string
     */
    String insertArticleSort(ArticleSort articleSort);
}
