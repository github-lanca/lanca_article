package cn.lanca.plentyoffish.article.service.impl;

import cn.lanca.plentyoffish.article.dao.ISortDao;
import cn.lanca.plentyoffish.article.model.ArticleSort;
import cn.lanca.plentyoffish.article.service.ISortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/8 15:44
 */
@Service
public class SortServiceImpl implements ISortService {
    /**
     * inject sortDao
     */
    @Autowired
    private ISortDao sortDao;

    /**
     * 新增文章分类
     *
     * @param articleSort 文章分类
     * @return string
     */
    @Override
    public String insertArticleSort(ArticleSort articleSort) {
        Long aLong = sortDao.insertSort(articleSort);
        if (aLong != null && aLong > 0) {
            return "分类保存成功";
        }
        return "分类保存失败";
    }
}
