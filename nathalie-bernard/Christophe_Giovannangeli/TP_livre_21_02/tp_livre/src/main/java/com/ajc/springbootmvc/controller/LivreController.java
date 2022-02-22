package com.ajc.springbootmvc.controller;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ajc.springbootmvc.entity.Livre;


@Controller
public class LivreController {

	private List<String> editeurListe = new LinkedList<String>() {{
        push("Hachette");
        push("Editis");
        push("Gallimard");
        push("Albin Michel");
        push("Actes Sud");
    }};
    
    private List<String> typeEdition = new LinkedList<String>() {{
    	push("Normal");
        push("Poche");
    }};
    
	@RequestMapping("/afficheLivreForm")
    public String afficheLivreForm(Model model){
		model.addAttribute("livre", new Livre());
        model.addAttribute("laListeDesEditeurs", editeurListe);
        model.addAttribute("typeEdition", typeEdition);
        return "livre-form";
    }


	@RequestMapping(value = "/traitementForm")
    public String traiteArticleForm(@ModelAttribute("livre") Livre livre) {	
  
    	return "livre-affichage";
    }
}
