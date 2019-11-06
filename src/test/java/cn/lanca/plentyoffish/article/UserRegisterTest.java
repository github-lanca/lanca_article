package cn.lanca.plentyoffish.article;

import cn.lanca.plentyoffish.article.dao.IUserRegisterDao;
import cn.lanca.plentyoffish.article.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description:
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/5 14:45
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRegisterTest {
    /**
     * 注入 IUserRegisterDao
     */
    @Autowired
    private IUserRegisterDao userRegisterDao;

    @Test
    public void UserRegisterTest() throws ParseException {
        User user = new User();
        user.setUserId(201911051003L);
        user.setUserIp("127.168.17.1");
        user.setUserName("王五");
        user.setUserNickname("小五五");
        user.setUserPassword("123456");
        user.setUserProfilePhoto("/url/user/photo");
        user.setUserRegistrationTime(new Date());
        user.setUserTelphoneNumber(18985251364L);
        user.setUserAge(27L);
        user.setUserBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1992-09-01"));
        user.setUserEmail("kaisa@cncommdata.cn");
        int i = -1;
        try {
            i = userRegisterDao.insertUser(user);
        } catch (Exception e) {
            System.out.println("--->");
            e.printStackTrace();
            System.out.println("<---");
        }
        System.out.println("-- " + i);
        String string = i > 0 ? "注册成功" : "注册失败";
        System.out.println(string);
    }
}
