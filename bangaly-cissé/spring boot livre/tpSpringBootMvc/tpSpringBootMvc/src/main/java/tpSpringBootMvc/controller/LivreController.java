package tpSpringBootMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tpSpringBootMvc.entity.Livre;

@Controller
public class LivreController {
	
	@GetMapping("/afficheLivreForm")
	public String afficheLivreForm(Model model) {
		model.addAttribute("livre", new Livre());
		return "livreForm";
	}
	
	@PostMapping("/traitementForm")
	public String traiterFormulaire(@ModelAttribute("livre")
	Livre livre){
		return "livreConfirmation";
	}
}
