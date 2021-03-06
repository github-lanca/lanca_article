package cn.lanca.plentyoffish.article.controller;

import cn.lanca.plentyoffish.article.model.User;
import cn.lanca.plentyoffish.article.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * 登陆控制:提供两个/三个登陆方式
 * 1.通过电话登陆
 * 2.通过email登陆
 * 3.通过第三方二维码登陆
 * 4.退出
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/6 15:33
 */
@RestController
public class LoginController {
    /**
     * z注入 loginServer
     */
    @Autowired
    private ILoginService loginService;

    /**
     * #1.电话号码校验
     * #2.电话号码查询失败sql修改
     * 1.通过电话登陆
     *
     * @param phoneNumber long类型电话号码
     * @param password    String类型密码
     * @return
     */
    @PostMapping("/login/phone")
    public String longiByPhone(@RequestParam Long phoneNumber,
                               @RequestParam String password) {
        boolean b = loginService.loginByPhone(phoneNumber, password);
        if (b) {
            return "验证通过,允许登陆";
        }
        return "验证失败,不允许登陆";
    }

    /**
     * 2.通过email登陆
     *
     * @param userEmail String类型的email
     * @param password  String类型的密码
     * @return
     */
    @PostMapping("/login/email")
    public String loginByEmail(@RequestParam String userEmail,
                               @RequestParam String password) {
        boolean b = loginService.loginByEmail(userEmail, password);
        if (b) {
            return "验证通过,允许登陆";
        }
        return "验证失败,不允许登陆";
    }

    /**
     * 3.通过第三方二维码登陆
     * (目前思考通过手机扫描二维码登陆)
     *
     * @param userEmail String类型的email
     * @param password  String类型的密码
     * @return
     */
    @GetMapping("/login/other")
    public String loginByOher(String userEmail, String password) {
        return "";
    }


    /**
     * 4.退出登陆
     *
     * @param user 用户对象
     * @return
     */
    @GetMapping("/logout")
    public String logout(User user) {
        return "退出成功";
    }
}
