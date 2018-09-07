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

import sopra.promo404.vol.model.Civilite;
import sopra.promo404.vol.model.Client;
import sopra.promo404.vol.model.Particulier;
import tpVolBAL.repository.IRepoClient;



@Controller
@RequestMapping("/particulier")
public class ParticulierController {
=======
public class ParticulierController   {
>>>>>>> Stashed changes

	@Autowired
	private IRepoClient clientRepo;
	
	@GetMapping(value = { "", "/list" })
	public String list(Model model) {
		List<Particulier> particuliers = clientRepo.findAllParticulier();

		model.addAttribute("particuliers", particuliers);

		return "particulier/particuliers";
	}

	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("monParticulier", new Particulier());
		model.addAttribute("civilites", Civilite.values());

		return "particulier/particulierForm";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		Optional<Client> particulier = clientRepo.findById(id);

		if (particulier.isPresent()) {
			model.addAttribute("monParticulier", particulier.get());
		} else {
			model.addAttribute("monParticulier", new Particulier());
		}
		model.addAttribute("civilites", Civilite.values());

		return "particulier/particulierForm";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute("monParticulier") Particulier particulier) {
		
		clientRepo.save(particulier);

		return "redirect:list";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		clientRepo.deleteById(id);

		return "forward:../list";
	}
}
