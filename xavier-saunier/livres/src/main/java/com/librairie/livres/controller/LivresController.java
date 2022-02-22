package com.librairie.livres.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.librairie.livres.model.Livre;

@Controller
public class LivresController {

    @RequestMapping({ "/", "/livreForm" })
    public String afficherForm(Model model) {
	model.addAttribute("livre", new Livre());
	return "livres-form";

    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("livre") Livre unLivre) {
	return "livre-vue";
    }

}
