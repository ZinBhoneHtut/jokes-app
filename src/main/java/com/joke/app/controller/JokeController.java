package com.joke.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joke.app.service.JokeService;

@Controller
@RequestMapping({"/",""})
public class JokeController {
	
	private JokeService jokeService;

	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@GetMapping
	public String viewJokeQuotes(Model model) {
		model.addAttribute("joke", jokeService.getRadomJokes());
		return "chucknorris";
	}
	
}
