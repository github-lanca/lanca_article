package cn.lanca.plentyoffish.article.service.impl;

import cn.lanca.plentyoffish.article.dao.IFriendShipDao;
import cn.lanca.plentyoffish.article.model.FriendShip;
import cn.lanca.plentyoffish.article.model.User;
import cn.lanca.plentyoffish.article.service.IFriendShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/7 17:14
 */
@Service
public class FriendShipServiceImpl implements IFriendShipService {
    /**
     * inject friendDao
     */
    @Autowired
    private IFriendShipDao friendShipDao;

    /**
     * insert 新增朋友关系表
     *
     * @param operator   建立关系的user/operator/操作者
     * @param friendShip 朋友关系表
     * @param friendUser 朋友/对象/或者朋友UserId
     */
    @Override
    public String establishRelationShip(User operator, FriendShip friendShip, User friendUser) {
        Long aLong = friendShipDao.createFriendsShip(operator, friendShip, friendUser);
        if (aLong != null && aLong > 0) {
            return "Establish Relationship Successful";
        }
        return "Establish Relationship Failure";
    }
}
