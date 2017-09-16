package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by AufaHR on 9/16/2017.
 */
@Controller
public class PageController {
    @RequestMapping("/perkalian")
    public String index(@RequestParam(value = "a", required = false, defaultValue = "0") Integer a,
                        @RequestParam(value = "b", required = false, defaultValue = "0") Integer b,
                        Model model) {

        int result =  a * b;
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("result", result);
        return "calc";
    }
}
