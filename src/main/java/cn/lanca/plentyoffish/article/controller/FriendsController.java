package cn.lanca.plentyoffish.article.controller;

import cn.lanca.plentyoffish.article.model.FriendShip;
import cn.lanca.plentyoffish.article.model.User;
import cn.lanca.plentyoffish.article.service.IFriendShipService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:  relationship controller
 * <p>
 * Author: Hongliang.mei
 * Date: 2019/11/7 17:14
 */
@RestController
public class FriendsController {
    /**
     * inject friendsService
     */
    @Autowired
    private IFriendShipService friendShipService;


    /**
     * 建立关系
     * Establish relationship
     * insert 新增朋友关系表
     *
     * @param operator   建立关系的user/operator/操作者
     * @param friendShip 朋友关系表
     * @param friendUser 朋友/对象/或者朋友UserId
     */
    @ApiOperation("和...建立朋友关系")
    @GetMapping("/friends/establish")
    public String establishRelationShip(@RequestParam User operator, @RequestParam FriendShip friendShip, @RequestParam User friendUser) {
        String s = friendShipService.establishRelationShip(operator, friendShip, friendUser);
        return s;
    }
}
