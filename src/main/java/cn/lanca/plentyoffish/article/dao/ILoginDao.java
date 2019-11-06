package cn.lanca.plentyoffish.article.dao;

import cn.lanca.plentyoffish.article.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Description:
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/6 15:42
 */
@Repository
public interface ILoginDao {
    /*@Results(
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
    )*/

    /**
     * @param phoneNumber 电话号码
     * @return User
     */
    @Results(
            id = "user_phone",
            value = {
                    @Result(column = "user_password", property = "userPassword"),
                    @Result(column = "user_telphone_number", property = "userTelphoneNumber"),
            }
    )
    @Select("select user_password,user_telphone_number from lanca_users where user_telphone_number = #{phoneNumber}")
    User getUserInfoByPhone(@Param("phoneNumber") Long phoneNumber);

    /**
     * @param userEmail you邮件
     * @return User
     */
    @Results(
            id = "user_email",
            value = {
                    @Result(column = "user_password", property = "userPassword"),
                    @Result(column = "user_email", property = "userEmail")
            }
    )
    @Select("select user_email,user_password from lanca_users where user_email = #{userEmail}")
    User getUserInfoByEmail(@Param("userEmail") String userEmail);
}
