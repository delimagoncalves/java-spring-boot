package br.org.recode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculos {
	
	@GetMapping("/")
	public String Home() {
		return "home";
	}
	
	@GetMapping("/soma")
	public String soma(Model model) {
		int valor1=20;
		int valor2=10;
		int resultado = valor1+valor2;
		model.addAttribute("resultado",resultado);
		return "soma";
	}
	
	@GetMapping("/subtracao")
	public String subtratir(ModelMap map) {
		int valor1 = 44;
		int valor2 = 21;
		int resultado = valor1-valor2;
		map.addAttribute("resultado", resultado);
		return "subtracao";
	}
	
	@GetMapping("/divisao")
	public ModelAndView dividir() {
		ModelAndView modelAndView = new ModelAndView();
		int valor1 = 44;
		int valor2 = 4;
		int resultado = valor1/valor2;
		modelAndView.setViewName("divisao");
		modelAndView.addObject("resultado", resultado);
		return modelAndView; 
	}
	
	@GetMapping("/multiplicacao")
	public ModelAndView multiplicar() {
		ModelAndView modelAndView = new ModelAndView();
		int valor1 = 44;
		int valor2 = 4;
		int resultado = valor1*valor2;
		modelAndView.setViewName("multiplicacao");
		modelAndView.addObject("resultado", resultado);
		return modelAndView;
	}
	
	
}
