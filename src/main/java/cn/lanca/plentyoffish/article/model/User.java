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
     * user_id
     * bigint
     * 用户ID
     * user_id
     */
    private Long userId;

    /**
     * user_ip
     * varchar
     * 用户ip
     */
    private String userIp;

    /**
     * user_name
     * varchar
     * 用户名
     */
    private String userName;
    /**
     * user_password
     * varchar
     * 用户密码
     */
    private String userPassword;

    /**
     * user_email
     * varchar
     * 用户邮箱
     */
    private String userEmail;
    /**
     * user_profile_photo
     * varchar
     * 用户头像
     */
    private String userProfilePhoto;
    /**
     * user_registration_time
     * datetime
     * 用户注册时间
     */
    private Date userRegistrationTime;
    /**
     * user_birthday
     * date
     * 用户生日
     */
    private Date userBirthday;
    /**
     * user_age
     * tinyint
     * 用户年龄
     */
    private Long userAge;
    /**
     * user_telphone_number
     * int
     * 用户手机号
     */
    private Long userTelphoneNumber;
    /**
     * user_nickname
     * varchar
     * 用户昵称
     */
    private String userNickname;
}
