package org.launchcode.beatinbetes.controllers;

import org.launchcode.beatinbetes.models.Meal;
import org.launchcode.beatinbetes.models.data.MealDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/carbs")
public class Carbs {

    @Autowired
    private MealDao mealDao;

    @RequestMapping(value="")
    public String index(Model model){
        model.addAttribute("title", "Beatin Betes");
        return "carbs/index";
    }
//@TODO #2    Fix database issue for meals/carbs.
    @RequestMapping(value =  "add", method = RequestMethod.GET)
    public String displayMealForm(Model model){
        model.addAttribute("title", "Add a meal");
        model.addAttribute(new Meal());
        return "carbs/add";
    }
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processMealForm(@ModelAttribute  Meal newMeal, Model model){
        model.addAttribute("tile", "Beatin Betes");
        mealDao.save(newMeal);

        return "carbs/index" ;
    }
}
