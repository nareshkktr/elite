package com.elite.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelocmeController {
	
	@GetMapping("/welcome")
	public String getWelocmeMessage() {
		return "Welocome to Elite systems";
	}

}
