package com.asaininfo.demo1.controller;

import com.asaininfo.demo1.services.NormalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 程然 on 2017/8/22.
 */
@Controller
public class InitController {
    @Autowired
    private NormalService normalService;
    @RequestMapping(value="/init.do")
    public String init(HttpServletRequest request){
        request.setAttribute("pb",normalService.findAll());
        System.out.println(normalService.findAll());
        return "index";
    }
}
