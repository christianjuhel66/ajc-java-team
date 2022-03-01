package cursusRestController.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cursusRestController.entites.Cursus;
import cursusRestController.exception.CursusNotFoundException;
import cursusRestController.service.ICursusRestControllerService;

@RestController
public class CursusRestController {

	@Autowired
	private ICursusRestControllerService cursusService;
	//private long idCursusAmodifier;

	@GetMapping({"/", "/cursus/lister"})
	public List<Cursus> afficher(){
		return cursusService.lister();

	}

	@PostMapping("/cursus/ajouter")
	public void ajouter(@RequestBody Cursus cursus) {
		cursusService.ajouterCursus(cursus);
	}

	@DeleteMapping("/cursus/supprimer/{id}")
	public void supprimerCursus(@PathVariable("id") Integer id) {
		cursusService.supprimerCursusId(id);
	}

	@PutMapping("/cursus/modifier/{id}")
	public void modifierCursus(
			@RequestBody Cursus cursusAjour,
			@PathVariable("id") Integer idCursusAmodifier) {
		
		cursusService.miseAjourCursus(cursusAjour, idCursusAmodifier);
		

	}
	
	
}
