package cn.lanca.plentyoffish.article;

import cn.lanca.plentyoffish.article.dao.IFriendShipDao;
import cn.lanca.plentyoffish.article.dao.IUserRegisterDao;
import cn.lanca.plentyoffish.article.model.FriendShip;
import cn.lanca.plentyoffish.article.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * Description:
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/7 17:47
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FriendShipTest {
    /**
     * inject friendShipDao
     */
    @Autowired
    private IFriendShipDao friendShipDao;
    /**
     * inject userRegisterDao
     */
    @Autowired
    private IUserRegisterDao userRegisterDao;

    @Test
    public void FriendsShipTest() {

        User operator = userRegisterDao.getUserInfo(13752935158L);
        FriendShip friendShip = new FriendShip();
        friendShip.setFriendshipCreateTime(new Date());
        friendShip.setFriendshipCancelTime(new Date());
        friendShip.setId(201000000000001L);
        friendShip.setUserFriendsDesc("仇人");
        friendShip.setUserFriendsNote("备注豆豆");
        friendShip.setUserFriendsStatus("隐身/离婚");
        User userInfo = userRegisterDao.getUserInfo(13451531649L);
        Long friendsShip = friendShipDao.createFriendsShip(operator, friendShip, userInfo);
        System.out.println("-->" + friendsShip);
    }
}
