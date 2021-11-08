package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Computers;
import dmacc.repository.ComputersRepository;

/**
 * @author Cody Hale - chale CIS175 - Fall 2021 Oct 29, 2021
 */

@Controller
public class WebController {

	@Autowired
	ComputersRepository repo;

	@GetMapping({"/","viewAll"})
	public String viewAllComputers(Model model) {
		if (repo.findAll().isEmpty()) {
			return addNewComputers(model);
		}
		model.addAttribute("computers", repo.findAll());
		return "results";
	}

	@GetMapping("/inputComputers")
	public String addNewComputers(Model model) {
		Computers c = new Computers();
		model.addAttribute("newComputers", c);
		return "input";
	}

	@PostMapping("/inputComputers")
	public String addNewComputers(@ModelAttribute Computers c, Model model) {
		repo.save(c);
		return viewAllComputers(model);
	}

	@GetMapping("/edit/{id}")
	public String showUpdateComputers(@PathVariable("id") long id, Model model) {
		Computers c = repo.findById(id).orElse(null);
		model.addAttribute("newComputers", c);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseComputers(Computers c, Model model) {
		repo.save(c);
		return viewAllComputers(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteComputers(@PathVariable("id")long id, Model model) {
		Computers c = repo.findById(id).orElse(null);
		repo.delete(c);
		return viewAllComputers(model);
	}

}
