package org.launchcode.beatinbetes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.launchcode.beatinbetes.models.*;

import javax.validation.Valid;

@Controller
public class Main {
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "Beatin Betes");
        return "betes/index";
    }



}
