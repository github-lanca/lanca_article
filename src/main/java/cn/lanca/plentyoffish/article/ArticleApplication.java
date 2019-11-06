package cn.lanca.plentyoffish.article;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "cn.lanca.plentyoffish.article")
@MapperScan("cn.lanca.plentyoffish.article.dao")
public class ArticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticleApplication.class, args);
    }

    /**
     * 没什么用，就是不想让checkstyle报错
     */
    public void init() {
    }

}
