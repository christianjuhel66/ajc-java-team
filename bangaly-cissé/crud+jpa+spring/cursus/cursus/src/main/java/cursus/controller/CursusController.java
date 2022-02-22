package cursus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cursus.entites.Cursus;
import cursus.service.ICursusService;

@Controller
//@RequestMapping({"/", "/cursus"})
public class CursusController {
	
	@Autowired
	private ICursusService cursusService;
	private long idCursusAmodifier;
	
	@GetMapping({"/", "/cursus/lister"})
	public String afficher(Model model){
		model.addAttribute("cursus", cursusService.lister());
		return "index";
		
	}
	
	@GetMapping("/cursus/supprimer/{id}")
    public ModelAndView supprimerCursus(@PathVariable("id") Integer id) {
		cursusService.supprimerCursusId(id);
        return new ModelAndView("redirect:/");
    }
	
	@GetMapping("/cursus/formulaireAjouter")
	public String formulaireAjouter(Model model) {
		model.addAttribute("cursus", new Cursus());
		return "formulaireAjouterCursus";
	}
	
	@PostMapping("/cursus/ajouter")
    public ModelAndView ajouter(@ModelAttribute("cursus") Cursus cursus) {
		cursusService.ajouterCursus(cursus);
		return new ModelAndView("redirect:/");
    }
	
	@GetMapping("/cursus/modifier/{id}")
    public String formulaireModifier(@PathVariable("id") Integer id, Model model) {
		this.idCursusAmodifier = id;
		Cursus cursus = cursusService.rechercherParId(id);
		model.addAttribute("cursus", cursus);
		//cursusService.supprimerCursusId(cursus.getId());
        return "formulaireModifierCursus";
    }
	
	@PostMapping("/cursus/modifier")
    public ModelAndView modifier(@ModelAttribute("cursus") Cursus cursus) {
		Cursus cursusAjour = cursus;
		cursusService.miseAjourCursus(cursusAjour, this.idCursusAmodifier);
		return new ModelAndView("redirect:/");
    }
	

}
