package com.librairie.livres.controller;

import javax.servlet.http.HttpServlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LivresController {

    @GetMapping({ "/", "/formulaire" })
    public String afficheLivreForm() {

	System.out.println("Passe par HelloController");
	return "livre-form";

    }

    @RequestMapping("/postLivreForm")
    public String traiteLivreForm(HttpServlet request, Model model) {

	return "livre-vue";

    }
}
