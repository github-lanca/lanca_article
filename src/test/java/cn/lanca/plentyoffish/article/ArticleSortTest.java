package cn.lanca.plentyoffish.article;

import cn.lanca.plentyoffish.article.dao.ISortDao;
import cn.lanca.plentyoffish.article.model.ArticleSort;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description:
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/8 15:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleSortTest {
    /**
     * inject sortDao
     */
    @Autowired
    private ISortDao sortDao;

    @Test
    public void articleSortTest() {
        ArticleSort articleSort = new ArticleSort();
        articleSort.setSortId(2000000004L);
        articleSort.setSortName("处女座");
        articleSort.setSortAlias("十二星座之一");
        articleSort.setSortDescription("运势/12生肖/冲动/暴脾气");
        // 父分类id
        articleSort.setParentSortId(2000000001L);
        Long aLong = sortDao.insertSort(articleSort);
        System.out.println("along: " + aLong);
    }
}
