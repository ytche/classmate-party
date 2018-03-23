package site.bigbear.classmate.party.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import site.bigbear.classmate.party.common.Message;
import site.bigbear.classmate.party.pojo.User;
import site.bigbear.classmate.party.service.UserService;

import java.util.List;

/**
 * 用户Controller
 * @author cheyantao
 */
@RequestMapping(value = "/api/v1/users")
@ResponseBody
@Controller
public class UserController extends BaseController<User>{
    @Autowired
    private UserService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAll(){
        return this.service.findAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable(value = "id") Long id){
        return this.service.findById(id);
    }
    @RequestMapping(method = {RequestMethod.POST,RequestMethod.PUT})
    public Message save(@RequestBody User user){
        return super.sendSuccess(this.service.save(user));
    }
    @RequestMapping(method = RequestMethod.DELETE)
    public Message delete(@RequestParam(value = "id")Long id){
        return super.sendMessage(this.service.delete(id));
    }
}
