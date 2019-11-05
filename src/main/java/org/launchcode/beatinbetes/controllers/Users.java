package org.launchcode.beatinbetes.controllers;

import org.launchcode.beatinbetes.models.User;
import org.launchcode.beatinbetes.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@RequestMapping("user")
public class Users {
    @Autowired
    private UserDao userDao;

    @RequestMapping(value="", method = RequestMethod.GET)
    public String displayLoginForm(Model model) {
        model.addAttribute("title", "Beatin' 'Betes");
        return "user/login";
    }
    @RequestMapping(value="", method = RequestMethod.POST)
    public String processLoginForm(Model model, User user, @RequestParam String name, @RequestParam String password, Errors errors){
//  @TODO #1  Fix user login. access user from database etc.
//        user = user.getPassword();
//        if(user.getPassword().equals(password));
//        return "user/index";

        model.addAttribute("title", "Beatin' 'Betes");
        model.addAttribute("errorMsg", "Please try again!");
        return "user/login";

    }

    @RequestMapping(value="/register", method = RequestMethod.GET)
    public String displayRegisterForm(Model model){
        model.addAttribute("title", "Beatin' 'Betes");
        model.addAttribute("user", new User());
        return "user/register";
    }
    @RequestMapping(value="/register", method= RequestMethod.POST)
    public String processRegisterForm(@ModelAttribute User newUser, Errors errors, Model model, @RequestParam String name, @RequestParam String password, @RequestParam String verify){
//        if (errors.hasErrors()){
//            model.addAttribute("title", "Beatin' 'Betes");
//            return "user/register";
//        }
//


            userDao.save(newUser);
            return "user/index";



    }


}