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


import sopra.promo404.vol.model.Reservation;
import tpVolBAL.repository.IRepoReservation;

@Controller
@RequestMapping("/reservation")
public class ReservationController {


		@Autowired
		private IRepoReservation reservationRepo;
		
		
		@GetMapping(value = { "", "/list" })
		public String list(Model model) {
			List<Reservation> reservation = reservationRepo.findAll();

			model.addAttribute("reservations", reservation);

			return "reservation/reservation";
		}
		
		
		@GetMapping("/add")
		public String add(Model model) {
			model.addAttribute("maReservation", new Reservation());
			
			

			return "reservation/reservationForm";
		}
		
		@GetMapping("/edit/{id}")
		public String edit(@PathVariable Long id, Model model) {
			Optional<Reservation> reservation = reservationRepo.findById(id);

			if (reservation.isPresent()) {
				model.addAttribute("maReservation", reservation.get());
			} else {
				model.addAttribute("maReservation", new Reservation());
			}
			
			

			return "reservation/reservationForm";
		}
		
		@PostMapping("/save")
		public String save(@ModelAttribute("maReservation") Reservation reservation) {
			
			
			
			reservationRepo.save(reservation);

			return "redirect:list";
		}

		@GetMapping("/delete/{id}")
		public String delete(@PathVariable Long id, Model model) {
			reservationRepo.deleteById(id);

			return "forward:../list";
		}
	}

