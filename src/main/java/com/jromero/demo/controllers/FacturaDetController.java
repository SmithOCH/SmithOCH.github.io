package com.jromero.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/facturadetalle")
public class FacturaDetController {

	@RequestMapping("/")
	 public String inicio() {
		 return "facturadetalle/index";
	 }
}
