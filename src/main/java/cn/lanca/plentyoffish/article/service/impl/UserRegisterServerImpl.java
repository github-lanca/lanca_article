package cn.lanca.plentyoffish.article.service.impl;

import cn.lanca.plentyoffish.article.dao.IUserRegisterDao;
import cn.lanca.plentyoffish.article.model.User;
import cn.lanca.plentyoffish.article.service.IUserRegisterServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:用户注册业务层
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/5 15:52
 */
@Service
public class UserRegisterServerImpl implements IUserRegisterServer {

    /**
     * 注入 userRegisterDao
     */
    @Autowired
    private IUserRegisterDao userRegisterDao;

    /**
     * @param user 用户对象
     * @return
     */
    @Override
    public int insertUser(User user) {
        return userRegisterDao.insertUser(user);
    }

    /**
     * 比较是否和其他用户电话号码重复
     *
     * @param userTelphoneNumber 电话号码
     * @return true 表示重复 false表示不重复
     */
    @Override
    public boolean isDuplicatePhone(Long userTelphoneNumber) {
        Long telphoneNumber = userRegisterDao.getUserTelphoneNumber(userTelphoneNumber);
        System.out.println("--> " + telphoneNumber);
        if (telphoneNumber != null && telphoneNumber == userTelphoneNumber) {
            return true;
        }
        return false;
    }
}
