package com.shenyb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @version : v2.0
 * @Written by :shenyb
 * @Creation Date : ${date} ${time}
 * @Description :
 */
@Controller
@RequestMapping(value = "user")
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView login(){
        return new ModelAndView("user/login");
    }
}
