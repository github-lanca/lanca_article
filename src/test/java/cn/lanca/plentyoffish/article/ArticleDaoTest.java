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
        User userInfo = userRegisterDao.getUserInfo();
        Long userId = userInfo.getUserId();
        Article article = new Article();
        article.setUserId(userId);
        article.setArticleTitle("百度查询结果");
        article.setArticleId(2019110672000L);
        article.setArticleCreateTime(new Date());
        //文章评论数量
        article.setArticleCommentCount(520L);
        article.setArticleLikeCount(100L);
        article.setArticleViews(10000L);
        article.setAeticleUpdateTime(new SimpleDateFormat("yyyy-MM-dd").parse("1992-09-01"));
        article.setArticleContent(new String("百度为您找到相关结果约34,200,000个\n" +
                "Java中String字符串的存储大小?也就是容量是多少呢?能存多少字符。\n" +
                "2个回答 - 回答时间: 2017年11月21日 - 48人觉得有用\n" +
                "\n" +
                "最佳答案: String str=\"abc...\";这样定义的字符串是存在字符串池中的 String str=new String(\"abc...\")这样定义的字符串是在堆内存中的,然后被栈内存的对象...\n" +
                "百度知道 - 百度快照\n" +
                "java中String类型的数据分配多少字节\n" +
                "4个回答2015年04月08日\n" +
                "最佳答案：Java中无论是汉字还是英文字母都是用Unicode编码来表示的,一个Unicode...\n" +
                "java中String类型有没有限制,最大限制是多少?\n" +
                "8个回答2018年07月09日\n" +
                "最佳答案：严格来说,String确实有长度限制。 String内部使用一个char[]数组来存...\n" +
                "2014年1月10日 - String能存的文本取决于Jvm中的堆栈设置,那么除此之外还有吗? String是基于char...String类型最大可以存储多少数据 12-26 - 论坛 java中数组的最大...\n" +
                "CSDN技术社区 - 百度快照\n" +
                "String类型最大可以存储多少数据-CSDN论坛\n" +
                "6条回复 - 发帖时间: 2000年12月26日\n" +
                "2000年12月26日 - java.lang.String最多能存储多长的字符串?kingofwang 本版专家分:306 ansistring是BCB里对应delphi里的string的,可以找到它的源码查查看。 0 2000-...\n" +
                "CSDN技术社区 - 百度快照\n" +
                "Java的String 长度最大为多少?-CSDN论坛\n" +
                "2019年10月25日-java的string 长度最大为多少? [问题点数:50分,结...char value[]...\n" +
                "java.lang.String最多能存储多长的字符串?-CSDN论坛\n" +
                "2006年11月16日-面试题[2]Java之String最大能存多少M文本 题目: Java中String能存...\n" +
                "更多同站结果>>\n" +
                "Java中String接受的最大字符串的长度是多少 - CSDN博客\n" +
                "2017年11月20日 - 用string接字符串,结果出现string 接不住,数据过多,超出长度了.原来string是有...string最大能存多少m文本 01-10 阅读数 625 题目:java中string能存的...\n" +
                "CSDN技术社区 - 百度快照\n" +
                "java中关于String 类型数据 的存储方式 - 你明哥 - 博客园\n" +
                "2016年8月31日 - java中关于String 类型数据 的存储方式 Constant Pool常量池的概念: 在讲到...* 由于s1是个变量,在编译期不能确定它的值是多少,所以 * 会在执行的时...\n" +
                "https://www.cnblogs.com/lihuid...  - 百度快照\n" +
                "java中string究竟占多少字节 - tongqu的个人空间 - OSCHINA"));

        Integer integer = articleDao.insertArticle(article);
        System.out.println("-->" + integer);
    }

}
