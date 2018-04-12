package site.bigbear.classmate.party.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import site.bigbear.classmate.party.common.Message;
import site.bigbear.classmate.party.pojo.UserInfo;
import site.bigbear.classmate.party.service.UserInfoService;

/**
 * @author cheyantao
 */
@Controller
@RequestMapping(value = "/api/v1/user-info")
@ResponseBody
public class UserInfoController extends BaseController<UserInfo>{
    @Autowired
    private UserInfoService service;

    @RequestMapping(value = "/{userId}",method = RequestMethod.GET)
    public UserInfo findById(@PathVariable(value = "userId") Long userId){
        return this.service.findByUserId(userId);
    }
    @RequestMapping(method = {RequestMethod.POST,RequestMethod.PUT})
    public Message save(@RequestBody UserInfo userInfo){
        return super.sendSuccess(this.service.save(userInfo));
    }
    @RequestMapping(method = RequestMethod.DELETE)
    public Message delete(@RequestParam(value = "id")Long id){
        return super.sendMessage(this.service.delete(id));
    }

}
