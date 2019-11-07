package cn.lanca.plentyoffish.article;

import cn.lanca.plentyoffish.article.dao.IArticleDao;
import cn.lanca.plentyoffish.article.dao.IUserRegisterDao;
import cn.lanca.plentyoffish.article.model.Article;
import cn.lanca.plentyoffish.article.model.User;
import com.mysql.jdbc.Clob;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ExceptionInterceptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Description:
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/6 16:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleDaoTest {
    /**
     * 注入 IUserRegisterDao
     */
    @Autowired
    private IUserRegisterDao userRegisterDao;

    @Autowired
    private IArticleDao articleDao;


    @Test
    public void articleDaoTest() throws Exception {
        User userInfo = userRegisterDao.getUserInfo(13451531649L);
        Long userId = userInfo.getUserId();
        Article article = new Article();
        article.setUserId(userId);
        article.setArticleTitle("三体");
        article.setArticleId(2019110672001L);
        article.setArticleCreateTime(new Date());
        //文章评论数量
        article.setArticleCommentCount(20L);
        article.setArticleLikeCount(10L);
        article.setArticleViews(1000L);
        article.setArticleUpdateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2015-09-01"));
        article.setArticleContent(new String("\n" +
                "mysql中replace函数\n" +
                "百度首页消息设置邵逸言\n" +
                "网页资讯视频图片知道文库贴吧采购地图更多»\n" +
                "换一换 搜索热点\n" +
                "15G驾驶亮相进博会新\t543万\n" +
                "2王思聪成被执行人\t525万\n" +
                "3乒乓球团体开门红\t507万\n" +
                "4台风娜基莉生成\t494万\n" +
                "5河南商丘女生遇害\t327万\n" +
                "6罗马仕充电宝起火\t318万\n" +
                "7警告全球气候危机\t280万\n" +
                "8日本螃蟹500万新\t255万\n" +
                "9北京房山饭馆爆燃\t243万\n" +
                "10遇害女童仍未火化\t200万\n" +
                "11宜宾3.2级地震新\t170万\n" +
                "12台湾黑帮帮主庆生\t158万\n" +
                "13河北爱心妈妈服刑\t149万\n" +
                "14英国议会正式解散\t145万\n" +
                "15雷军发布会爆粗口\t144万\n" +
                "查看更多>>\n" +
                "收起工具时间不限所有网页和文件站点内检索\n" +
                "搜索工具百度为您找到相关结果约6,180,000个\n" +
                "mysql :SQL语句中的替换函数replace - 佳佳嘉佳佳 - 博客园\n" +
                "2018年10月25日 - mysql :SQL语句中的替换函数replace replace() 用第三个表达式替换第一个字符串表达式中出现的所有第二个给定字符串表达式。 语法 REPLACE ( 'string_...\n" +
                "https://www.cnblogs.com/finala...  - 百度快照\n" +
                "mySQL中replace的用法 - Wei_java - 博客园\n" +
                "2017年03月07日-Mysql有什么办法批量去掉某个字段字符中的空格?不仅是字符串前后...\n" +
                "MySQL的replace方法 - 戈博折刀 - 博客园\n" +
                "2019年02月23日-mysql中replace函数直接替换mysql数据库中某字段中的特定字符串,...\n" +
                "更多同站结果>>\n" +
                "熟练使用mysql的replace替换函数 - myarche的博客 - CSDN博客\n" +
                "2018年11月21日 - 转载自  MySQLReplace()函数MySQLREPLACE字符串函数简介MySQL为您提供了一个有用的字符串函数REPLACE(),它允许您用新的字符串替换表的列中的字符串...\n" +
                "CSDN技术社区 - 百度快照\n" +
                "mysql的replace函数替换字符串 - Yu's Notes - CSDN博客\n" +
                "2019年6月25日 - 介绍下mysql的REPLACE()函数 语法: REPLACE()函数的语法如下: REPLACE(str,old_string,new_string); 参数: REPLACE()函数有三个参数,它将string中的ol...\n" +
                "CSDN技术社区 - 百度快照\n" +
                "Mysql中replace与replace into的用法讲解_Mysql_脚本之家\n" +
                "2019年3月20日 - 今天小编就为大家分享一篇关于Mysql中replace与replace into的用法讲解,小编觉得内容挺不错的,现在分享给大家,具有很好的参考价值,需要的朋友一起跟随...\n" +
                "脚本之家 - 百度快照\n" +
                "为您推荐：replace数据库用法replace短语用法mysql中replace的用法replace用法replace怎么用replace with用法数组的replace方法\n" +
                "MySQL REPLACE函数:字符串替换\n" +
                "MySQL 中替换函数 REPLACE(s,s1,s2) 使用字符串 s2 替换字符串 s 中所有的字符串 s1。 【实例】使用 REPLACE 函数进行字符串替换操作,输入的 SQL 语句和执行...\n" +
                "c.biancheng.net/mysql/...  - 百度快照\n" +
                "mySQL中replace的用法 - 站长网_站长创业_站长主页_站长之家_易采..."));

        Integer integer = articleDao.insertArticle(article);
        System.out.println("-->" + integer);
    }

}
