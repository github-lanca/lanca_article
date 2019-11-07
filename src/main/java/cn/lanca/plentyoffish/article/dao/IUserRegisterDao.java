package cn.lanca.plentyoffish.article.dao;

import cn.lanca.plentyoffish.article.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Description: 表 lanca_users 的crud /以及一些特殊操作
 * 与数据库直接连接/交互dao层
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/5 15:54
 */
@Repository
public interface IUserRegisterDao {
    /**
     * 注册/添加/新增用户
     *
     * @param user 用户/使用者
     * @return int 返回添加成功的个数
     */
    @Insert("INSERT INTO lanca_users (user_id,user_ip,user_name,user_password,user_email,user_profile_photo,"
            + "user_registration_time,user_birthday,user_age,user_telphone_number,user_nickname)"
            + "VALUES (#{user.userId},#{user.userIp},#{user.userName},#{user.userPassword},#{user.userEmail},"
            + "#{user.userProfilePhoto},#{user.userRegistrationTime},#{user.userBirthday},#{user.userAge},"
            + "#{user.userTelphoneNumber},#{user.userNickname})")
    int insertUser(@Param("user") User user);

    /**
     * 通过电话号码查电话号码
     * select ifnull(字段名,0) from 表名;
     *
     * @param userTelphoneNumber 电话号码
     * @return Long
     */
    @Select("select ifnull(user_telphone_number,0) from lanca_users where user_telphone_number = #{userTelphoneNumber}")
    Long getUserTelphoneNumber(@Param("userTelphoneNumber") long userTelphoneNumber);

    /**
     * 根据电话号码查出用户个人信息
     *
     * @param phoneNumber 电话号码
     * @return User
     */
    @Results(
            id = "user",
            value = {
                    @Result(column = "user_id", property = "userId"),
                    @Result(column = "user_ip", property = "userIp"),
                    @Result(column = "user_name", property = "userName"),
                    @Result(column = "user_password", property = "userPassword"),
                    @Result(column = "user_email", property = "userEmail"),
                    @Result(column = "user_profile_photo", property = "userProfilePhoto"),
                    @Result(column = "user_registration_time", property = "userRegistrationTime"),
                    @Result(column = "user_birthday", property = "userBirthday"),
                    @Result(column = "user_age", property = "userAge"),
                    @Result(column = "user_telphone_number", property = "userTelphoneNumber"),
                    @Result(column = "user_nickname", property = "userNickname")
            }
    )
    @Select("select user_id,user_ip,user_name,user_password,user_email,user_profile_photo,user_registration_time,"
            + "user_birthday,user_age,user_telphone_number,user_nickname from lanca_users where user_telphone_number = #{phoneNumber}")
    User getUserInfo(@Param("phoneNumber") Long phoneNumber);
}
