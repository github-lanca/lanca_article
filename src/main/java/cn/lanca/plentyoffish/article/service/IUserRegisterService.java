package cn.lanca.plentyoffish.article.service;

import cn.lanca.plentyoffish.article.model.User;

/**
 * Description:用户注册server接口
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/5 15:52
 */
public interface IUserRegisterService {
    /**
     * @param user 用户对象
     */
    int insertUser(User user);

    /**
     * 比较是否和其他用户电话号码重复
     *
     * @param userTelphoneNumber 电话号码
     * @return boolean
     */
    boolean isDuplicatePhone(Long userTelphoneNumber);
}
