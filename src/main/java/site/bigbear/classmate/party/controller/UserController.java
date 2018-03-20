package site.bigbear.classmate.party.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import site.bigbear.classmate.party.common.Message;
import site.bigbear.classmate.party.pojo.User;
import site.bigbear.classmate.party.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

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


}
