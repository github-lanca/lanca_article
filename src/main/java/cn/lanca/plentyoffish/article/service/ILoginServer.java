package cn.lanca.plentyoffish.article.service;

/**
 * Description:
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/6 15:41
 */
public interface ILoginServer {
    /**
     * 1.通过电话登陆
     *
     * @param phoneNumber long类型电话号码
     * @param password    String类型密码
     * @return
     */
    boolean loginByPhone(Long phoneNumber, String password);


    /**
     *
     * @param userEmail string类型的email
     * @param password string类型的密码
     * @return true:匹配成功  false:匹配失败
     */
    boolean loginByEmail(String userEmail, String password);
}
