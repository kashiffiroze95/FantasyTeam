package com.fantasy.team.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FantasyTeamController {

	@GetMapping("/get")
	public String getMessage() {
		return "Bye";
	}
}
