package com.redhat.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController 
{
    
    @GetMapping("/sample")
    public String showForm() {
        return "sample";
    }
     

     @GetMapping("/test")
     @ResponseBody
     public ModelAndView test(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
         
        ModelAndView mv = new ModelAndView("sample");
        mv.addObject("msg", "hello world");
        request.getSession().setAttribute("TEST", "SESSION-TEST");
        return mv;
     }

}