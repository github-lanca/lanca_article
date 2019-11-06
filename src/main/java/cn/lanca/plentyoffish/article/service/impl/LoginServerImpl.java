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

    @Override
    public boolean loginByPhone(Long phoneNumber, String password) {
        User userInfoByPhone = loginDao.getUserInfoByPhone(phoneNumber);
        System.out.println("loginByPhone: " + userInfoByPhone);
        if (userInfoByPhone != null && userInfoByPhone.getUserPassword().equals(password)) {
            System.out.println("loginByPhone: " + userInfoByPhone);
            return true;
        }
        return false;
    }

    @Override
    public boolean loginByEmail(String userEmail, String password) {
        User userInfoByEmail = loginDao.getUserInfoByEmail(userEmail);
        System.out.println("loginByEmail: " + userInfoByEmail);
        if (userInfoByEmail != null && userInfoByEmail.getUserPassword().equals(password)) {
            System.out.println("loginByEmail: " + userInfoByEmail);
            return true;
        }
        return false;
    }
}
