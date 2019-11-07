package cn.lanca.plentyoffish.article.controller;

import cn.lanca.plentyoffish.article.model.User;
import cn.lanca.plentyoffish.article.service.IUserRegisterService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 注册用户
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/5 15:51
 */
@RestController
public class UserRegisterController {
    /**
     * 注入 userRegisterServer 用户注册server
     */
    @Autowired
    private IUserRegisterService userRegisterService;

    /**
     * 注册用户,肯定需要数据库查询比较是否重复,比如电话号码师傅重复,
     *
     * @param user user对象
     * @return String
     */
    @ApiOperation("用户注册接口")
    @GetMapping("/user/register")
    public String registerUser(User user) {
        int i = userRegisterService.insertUser(user);
        if (i > 0) {
            return "注册成功";
        }
        return "注册失败";
    }

    /**
     * 比较是否和其他用户电话号码重复
     * true 表示重复 false表示不重复
     *
     * @param userTelphoneNumber 电话号码
     * @return true 表示重复 false表示不重复
     */
    @ApiOperation("比较是否和其他用户电话号码重复 true 表示重复 false表示不重复 ")
    @GetMapping("/user/phone/repeat")
    public boolean idDuplicateUserPhoneNumber(Long userTelphoneNumber) {
        return userRegisterService.isDuplicatePhone(userTelphoneNumber);
    }
}
