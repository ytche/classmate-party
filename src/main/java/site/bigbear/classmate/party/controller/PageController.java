package site.bigbear.classmate.party.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转controller
 * @author cheyantao
 */
@Controller
public class PageController {

    @RequestMapping("/jsp/home")
    public String home() {
        return "home";
    }
}
