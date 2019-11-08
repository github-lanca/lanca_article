package cn.lanca.plentyoffish.article.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: 文章分类 对应数据库 lanca_sort表
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/8 15:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleSort {
    /**
     * 分类表单id
     * sort_id
     */
    private Long sortId;
    /**
     * 分类名称
     */
    private String sortName;
    /**
     *分类别名
     */
    private String sortAlias;
    /**
     *分类描述
     */
    private String sortDescription;
    /**
     * 父类id
     */
    private Long parentSortId;

}
