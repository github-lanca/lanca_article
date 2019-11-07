package cn.lanca.plentyoffish.article.service.impl;

import cn.lanca.plentyoffish.article.dao.ILoginDao;
import cn.lanca.plentyoffish.article.model.User;
import cn.lanca.plentyoffish.article.service.ILoginServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/6 15:41
 */
@Service
public class LoginServerImpl implements ILoginServer {
    /**
     * 注入 loginDao
     */
    @Autowired
    private ILoginDao loginDao;

    /**
     * true允许登陆 false不允许通过
     *
     * @param phoneNumber long类型电话号码
     * @param password    String类型密码
     * @return true允许登陆 false不允许通过
     */
    @Override
    public boolean loginByPhone(Long phoneNumber, String password) {
        User userInfoByPhone = loginDao.getUserInfoByPhone(phoneNumber);
        System.out.println("userInfoByPhone: " + userInfoByPhone);
        if (userInfoByPhone != null && userInfoByPhone.getUserPassword().equals(password)) {
            return true;
        }
        return false;
    }

    /**
     * true允许通过登陆 false不允许通过
     *
     * @param userEmail string类型的email
     * @param password  string类型的密码
     * @return boolean
     */
    @Override
    public boolean loginByEmail(String userEmail, String password) {
        User userInfoByEmail = loginDao.getUserInfoByEmail(userEmail);
        System.out.println("userInfoByEmail: " + userInfoByEmail);
        if (userInfoByEmail != null && userInfoByEmail.getUserPassword().equals(password)) {
            return true;
        }
        return false;
    }
}
