package com.example.crudfootballer.controller;

import com.example.crudfootballer.entity.Footballer;
import com.example.crudfootballer.service.FootballerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FootballerController {

    @Autowired
    private FootballerService footballerService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/register")
    public String register() {
        return "registerFootballer";
    }

    @GetMapping("/available_footballers")
    public ModelAndView getAllFootballers() {
        List<Footballer> list = footballerService.getallFootballers();
        return new ModelAndView("footballerList","footballer",list);
        // vo htmlot objekti od listava kje zimam so footballer
    }

    @PostMapping("/save")
    public String addFootballer(@ModelAttribute Footballer f) {
        footballerService.save(f);
        return "redirect:/available_footballers";
    }

    @RequestMapping("/editFootballer/{id}")
    public String editFootballer(@PathVariable("id") int id, Model model) {
        Footballer f = footballerService.getFootballerById(id);
        model.addAttribute("footballer",f);
        return "edit";
    }

    @RequestMapping("/deleteFootballer/{id}")
    public String deleteFootballer(@PathVariable("id") int id) {
        footballerService.deleteById(id);
        return "redirect:/available_footballers";
    }

}
