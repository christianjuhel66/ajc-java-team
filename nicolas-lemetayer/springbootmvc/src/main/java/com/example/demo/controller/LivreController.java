package com.example.demo.controller;

import com.example.demo.entities.Livre;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LivreController {

    @RequestMapping("/afficheLivreForm")
    public String afficheSalutationForm(Model model){
        model.addAttribute("livre", new Livre());
        return "form-livre";
    }

    @RequestMapping("/traitementForm")
    public String traiteSalutationForm(@ModelAttribute("livre")Livre unLivre){
        return "affiche-livre-form";
    }
}
