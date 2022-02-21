package com.ajc.demo.bibliotheque.controller;


import com.ajc.demo.bibliotheque.model.Livre;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerLivre {
    @GetMapping({"/", "/livreform"})
    public String displayLivreForm(Model model) {
        model.addAttribute("livre", new Livre());
        return "livre-form";
    }

    @PostMapping("/traitementForm")
    public String livreMessageFromForm(@ModelAttribute("livre")Livre livre){
        return "livre-message";
    }
}
