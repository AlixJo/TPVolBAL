package vol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sopra.promo404.vol.model.Login;
import tpVolBAL.repository.IRepoLogin;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private IRepoLogin loginRepo;

	@GetMapping("")
	public String add(Model model) {
		model.addAttribute("monLogin", new Login());

		return "login/mire";
	}

	@PostMapping(value = { "/connect" })
	public String connect(@RequestParam String identifiant, @RequestParam String motDePasse) {
		Login login = loginRepo.findByIdentifiant(identifiant);
		if (login != null) {
			String mdp = login.getMotDePasse();
			Boolean admin = login.getAdmin();

			if (mdp == motDePasse) {
				if (admin == true) {
					return ("redirect:/particulier");
				} else {
					return ("redirect:/home");
				}
			} else {
				return ("redirect:/login");
			}
		} else {
			return "";
		}
	}
}
