package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Hotel;
import dmacc.repository.HotelRepository;

/**
 * @author Carson Allbee callbee
 *CIS175 - Fall 2021
 * Apr 12, 2022
 */
@Controller
public class HotelController {
	
	@Autowired
	HotelRepository repo;
	
	@GetMapping("/inputHotel")
	public String addNewHotel(Model model) {
		Hotel h = new Hotel();
		model.addAttribute("newHotel", h);
		return "input";
	}
	
	//@PostMapping("/inputHotel")
	//public String addNewHotel(@ModelAttribute Hotel h, Model model) {
		//repo.save(h);
		//return 
	//}
	
}
