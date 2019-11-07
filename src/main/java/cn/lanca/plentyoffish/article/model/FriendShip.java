package cn.lanca.plentyoffish.article.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Description: lanca_user_friends
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/7 16:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FriendShip {
    /**
     * id 朋友表
     */
    private Long id;
    /**
     * user_id 用户id
     */
    private Long userId;
    /**
     * 用户的朋友id,也是用户id
     * user_friends_id
     */
    private Long userFriendsId;
    /**
     * 好友备注
     * user_friends_note
     */
    private String userFriendsNote;
    /**
     * 好友状态
     * user_friends_status
     */
    private String userFriendsStatus;
    /**
     * 创建朋友关系的日期
     * user_friends_createtime
     */
    private Date friendshipCreateTime;
    /**
     * 取消朋友关系的日期
     * user_friends_canceltime
     */
    private Date friendshipCancelTime;
    /**
     * 关系描述 朋友/恋人/夫妻
     * user_friends_description
     */
    private String userFriendsDesc;
}
