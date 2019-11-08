package cn.lanca.plentyoffish.article.dao;

import cn.lanca.plentyoffish.article.model.ArticleSort;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.springframework.stereotype.Repository;

/**
 * Description:lanca_sort表
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/8 15:38
 */
@Repository
public interface ISortDao {
    /**
     * @param articleSort 分类对象
     * @return
     */
    @Results(id = "articleSort", value = {
            @Result(column = "sort_id", property = "sortId"),
            @Result(column = "sort_name", property = "sortName"),
            @Result(column = "sort_alias", property = "sortAlias"),
            @Result(column = "sort_description", property = "sortDescription"),
            @Result(column = "parent_sort_id", property = "parentSortId"),
    })
    @Insert("insert into lanca_sort(sort_id,sort_name,sort_alias,sort_description,parent_sort_id) "
            + " values(#{articleSort.sortId},#{articleSort.sortName},#{articleSort.sortAlias},#{articleSort.sortDescription},#{articleSort.parentSortId})")
    Long insertSort(@Param("articleSort") ArticleSort articleSort);
}
