package cn.lanca.plentyoffish.article.dao;

import cn.lanca.plentyoffish.article.model.FriendShip;
import cn.lanca.plentyoffish.article.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Description: Friends dao
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/7 17:06
 */
@Repository
public interface IFriendShipDao {
    /**
     * insert 新增朋友关系表
     *
     * @param operator    建立关系的user/operator/操作者
     * @param friendShip  朋友关系表
     * @param friendsUser 朋友/对象/或者朋友UserId
     */
    @Insert("insert into lanca_user_friends(id,user_id,user_friends_id,user_friends_note,user_friends_status,"
            + "user_friends_createtime,user_friends_canceltime,user_friends_description) "
            + "values(#{friendShip.id},#{operator.userId},#{friendsUser.userId},#{friendShip.userFriendsNote},#{friendShip.userFriendsStatus},#{friendShip.friendshipCreateTime},#{friendShip.friendshipCancelTime},#{friendShip.userFriendsDesc}) ")
    Long createFriendsShip(@Param("operator") User operator, @Param("friendShip") FriendShip friendShip, @Param("friendsUser") User friendsUser);
}
