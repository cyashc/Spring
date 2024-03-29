package co.nz.yash.ocp.release.ocprelease.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class WelcomeController {
//    @RequestMapping("/welcome")
//    public String loginMessage(){
//        return "jsp/welcome";
//    }
//
//    @RequestMapping("/")
//    public String loginMessageRoot(){
//        return "welcome";
//    }
private String appMode;

    @Autowired
    public WelcomeController(Environment environment){
        appMode = environment.getProperty("app-mode");
    }

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("datetime", new Date());
        model.addAttribute("username", "@omeryazir");
        model.addAttribute("projectname", "WebApp");

        model.addAttribute("mode", appMode);

        return "index";
    }
}
