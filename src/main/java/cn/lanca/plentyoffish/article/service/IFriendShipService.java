package cn.lanca.plentyoffish.article.service;

import cn.lanca.plentyoffish.article.model.FriendShip;
import cn.lanca.plentyoffish.article.model.User;

/**
 * Description:
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/7 17:07
 */
public interface IFriendShipService {
    /**
     * 建立关系
     * Establish relationship
     * insert 新增朋友关系表
     *
     * @param operator   建立关系的user/operator/操作者
     * @param friendShip 朋友关系表
     * @param friendUser 朋友/对象/或者朋友UserId
     */
    String establishRelationShip(User operator, FriendShip friendShip, User friendUser);
}
