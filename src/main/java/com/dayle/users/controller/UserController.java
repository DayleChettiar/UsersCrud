package com.dayle.users.controller;

import com.dayle.users.domain.User;
import com.dayle.users.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String index(Model model){
        System.out.println(userService.findAll());
        model.addAttribute("users", userService.findAll());
        return "user/index";
    }

//    @RequestMapping(value = "/create")
//    public String create(){
//        return "user/create";
//    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(User user){
    	userService.save(user);
        return "redirect:index";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUser(@PathVariable Long id, Model model){
        model.addAttribute("user",userService.findById(id));
        return "user/edit";
    }


    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    public String update(User user){
    	userService.save(user);
        return "redirect:index";
    }

}
