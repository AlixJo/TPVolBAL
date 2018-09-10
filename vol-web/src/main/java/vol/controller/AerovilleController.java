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

import sopra.promo404.vol.model.AeroVille;
import sopra.promo404.vol.model.Ville;
import tpVolBAL.repository.IRepoAeroVille;
import tpVolBAL.repository.IRepoAeroport;
import tpVolBAL.repository.IRepoVille;

@Controller
@RequestMapping("/aeroville")
public class AerovilleController {

	@Autowired
	private IRepoAeroVille aerovilleRepo;
	
	@Autowired
	private IRepoVille villeRepo;
	
	
	@Autowired
	private IRepoAeroport aeroportRepo;

	@GetMapping(value = { "", "/list" })
	public String list(Model model) {
		List<AeroVille> aerovilles = aerovilleRepo.findAll();

		model.addAttribute("mesAerovilles", aerovilles);

		return "aeroville/aerovilles";
	}

	@GetMapping("/add")
	public String add(Model model) {

		model.addAttribute("monAeroville", new AeroVille());
		model.addAttribute("aeroports", aeroportRepo.findAll());
		model.addAttribute("villes", villeRepo.findAll());
		return "aeroville/aerovilleForm";
	}

	
	
	@PostMapping("/save")
	public String save(@ModelAttribute("monAeroville") AeroVille aeroville) {
		
		aerovilleRepo.save(aeroville);

		return "redirect:list";
	}
	

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable(value="id", required=true) Long id, Model model) {
		
		aerovilleRepo.deleteById(id);

		return "forward:../list";
	}
}