package com.wangdl.spring.control;

import com.wangdl.spring.model.User;
import com.wangdl.spring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Description: //TODO(简略描述这个类的作用)
 * Author: WangDL
 * Date: 2018-08-12 17:57
 * Copyright (c) 2018, ewell.com All Rights Reserved.
 */
@Controller
@RequestMapping("demoControl")
public class DemoControl {

    @Autowired
    IUserService service;

    @RequestMapping("welcome")
    @ResponseBody
    public String welcome(String name) {
        User userById = service.getUserById(1);
        return "欢迎您," + name + "-----" + userById.toString();
    }

    @RequestMapping("showInfo")
    public ModelAndView showInfo(String name) {
        ModelAndView        mv       = new ModelAndView();
        Map<String, Object> model    = mv.getModel();
        User                userById = service.getUserById(1);
        String              obj      = "欢迎您," + name + "-----" + userById.toString();
        model.put("info", obj);
        mv.setViewName("userinfo");
        mv.addObject("info2", obj);
        return mv;
    }

    @RequestMapping("showInfo2")
    public ModelAndView showInfo2(String name) {
        ModelAndView        mv       = new ModelAndView();
        Map<String, Object> model    = mv.getModel();
        User                userById = service.getUserById(1);
        String              obj      = "欢迎您," + name + "-----" + userById.toString();
        model.put("info", obj);
        mv.setViewName("userinfo");
        mv.addObject("info2", obj);
        return mv;
    }

    @RequestMapping("showInfo3")
    public ModelAndView showInfo3(String name) {
        ModelAndView        mv       = new ModelAndView();
        Map<String, Object> model    = mv.getModel();
        User                userById = service.getUserById(1);
        String              obj      = "欢迎您," + name + "-----" + userById.toString();
        model.put("info", obj);
        mv.setViewName("userinfo");
        mv.addObject("info2", obj);
        return mv;
    }


}
