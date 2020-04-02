package com.geosura.geosuratest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class IndexController {
    String appName="GeoSURA Test App v0.1";
    
    /** Home controller */ 
	@GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }
	
	
	@GetMapping("/new")
    public String showNewForm(Model model) {
        return "add-vehicle";
    }
	
	
}
