package com.jing.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jing.entity.User;
import com.jing.service.UserService;
@Controller
public class SysIndexController {
	
	@Autowired
	private UserService userService;

    @RequestMapping("/sysindex.html")
    public String index(Model model,HttpServletRequest request, HttpServletResponse response) {
        User user = userService.getUser();
        model.addAttribute("user", user);
        System.out.println(user);
        return "sysindex";
    }
    

}
