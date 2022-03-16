package edu.school.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.school.interfaces.IRepoUser;
import edu.school.models.User;

@Controller
@RequestMapping("/users")
public class HtmlUserController {
	@Autowired
	@Qualifier("mapUserRepo")
	private IRepoUser repo;
	
	@GetMapping("/home")
	public String home(Model model) 
	{
		boolean alwaysTrue=true;
		model.addAttribute("usersList", repo.getAll());
		model.addAttribute("alwaysTrue", alwaysTrue);
		model.addAttribute("simpleText","Hello thymeleaf!");
		model.addAttribute("mainUser",repo.getById(1L));
		return "home";
	}
	
	@GetMapping("/users/{id}")
	public String currentUser(@PathVariable Long id, Model model) 
	{
		User u = repo.getById(id);
		model.addAttribute("user",u);
		return "currentUser";
		
	}
	@GetMapping("/add")
	public String addUser(Model model) 
	{
		model.addAttribute("toAdd",new User());
		return "addUser";
	}
	
	

}
