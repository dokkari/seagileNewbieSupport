package seagile.newbie.support.newbiesupport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {
    @RequestMapping("")
    public String index() {
        return "index";
    }

}
