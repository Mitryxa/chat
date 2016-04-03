package com.mitrofanov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController{
    @RequestMapping(value="/")
    public String velcome(Model model){
        return "index";
    }
    @RequestMapping(value="test")
    public String goToTest(Model model){

        return "test";
    }


}