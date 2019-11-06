package cn.lanca.plentyoffish.article.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Description:User实体类  对应表:lanca_users
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/5 15:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * 用户唯一标识ID(user_id)
     */
    private Long userId;
    /**
     * 用户ip(user_ip)
     */
    private String userIp;
    /**
     * 用户名(user_name)
     */
    private String userName;
    /**
     * 用户密码(user_password)
     */
    private String userPassword;
    /**
     * 用户邮箱(user_email)
     */
    private String userEmail;
    /**
     * 用户头像(user_profile_photo)
     */
    private String userProfilePhoto;
    /**
     * 用户注册时间(user_registration_time)
     */
    private Date userRegistrationTime;
    /**
     * 用户生日(user_birthday)
     */
    private Date userBirthday;
    /**
     * 用户年龄(user_age)
     */
    private Long userAge;
    /**
     * 用户手机号(user_telphone_number)
     */
    private Long userTelphoneNumber;
    /**
     * 用户昵称(user_nickname)
     */
    private String userNickname;
}
