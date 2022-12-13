package com.dataload.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/first")
	public String first(String name) {
		return "THis is ur string " + name;
	}
}
