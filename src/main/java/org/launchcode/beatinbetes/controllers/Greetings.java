package org.launchcode.beatinbetes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("betes")
public class Greetings {
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "Beatin Betes");
        return "betes/index";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("title", "Beatin' 'Betes");
        return "betes/login";
    }

    @RequestMapping("/register")
    public String register(Model model){
        model.addAttribute("title", "Beatin' 'Betes");
        return "betes/register";
    }
}
