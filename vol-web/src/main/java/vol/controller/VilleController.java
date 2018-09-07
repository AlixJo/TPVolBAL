package vol.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sopra.promo404.vol.model.Ville;
import tpVolBAL.repository.IRepoVille;


@Controller
@RequestMapping("/ville")
public class VilleController {

	@Autowired
	private IRepoVille villeRepo;

	@GetMapping(value = { "", "/list" })
	public String list(Model model) {
		List<Ville> villes = villeRepo.findAll();

		model.addAttribute("mesVilles", villes);

		return "ville/villes";
	}

	@GetMapping("/add")
	public String add(Model model) {

		model.addAttribute("maVille", new Ville());

		return "ville/villeForm";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable(value = "id", required = true) Long id, Model model) {
		Optional<Ville> ville = villeRepo.findById(id);

		if (ville.isPresent()) {
			model.addAttribute("maVille", ville.get());
		} else {
			model.addAttribute("maVille", new Ville());
		}
		return "ville/villeForm";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("maVille") Ville ville) {
		
		villeRepo.save(ville);

		return "redirect:list";
	}
	

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable(value="id", required=true) Long id, Model model) {
		
		villeRepo.deleteById(id);

		return "forward:../list";
	}
}
