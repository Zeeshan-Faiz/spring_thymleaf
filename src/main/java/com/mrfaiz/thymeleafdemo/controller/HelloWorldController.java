package com.mrfaiz.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processFormV2")
    public String upperName(HttpServletRequest request, Model model){

        String theName = request.getParameter("studentName");

        theName = theName.toUpperCase();

        model.addAttribute("message",theName);

        return "helloworld";
    }

    @RequestMapping("/processFormV3")
    public String upperName2(@RequestParam("studentName") String theName,
                                                                 Model model){

        theName = theName.toUpperCase()+"V3";

        model.addAttribute("message",theName);

        return "helloworld";
    }

}
