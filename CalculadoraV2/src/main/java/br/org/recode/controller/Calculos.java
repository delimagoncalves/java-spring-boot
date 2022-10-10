package br.org.recode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.org.recode.model.Calculadora;

@Controller
public class Calculos {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/soma")
	public String somar(final Model model) 
	{
		model.addAttribute("calculadora", new Calculadora());
		return "soma";
		
	}
	
	@PostMapping("/somar")
	public String resultadoSoma(@ModelAttribute Calculadora calculadora) {
		calculadora.somar();
		return "result";
	}
	
	@GetMapping("/divisao")
	public String dividir(final Model model) {
		model.addAttribute("calculadora", new Calculadora());
		return "divisao";
	}
	
	@PostMapping("/dividir")
	public String resultadoDivisao(@ModelAttribute Calculadora calculadora) {
		calculadora.dividir();
		return "result";
	}
	
	@GetMapping("/subtracao")
	public String subtracao(final Model model) {
		model.addAttribute("calculadora", new Calculadora());
		return "subtracao";
	}
	
	@PostMapping("/subtrair")
	public String subtrair(@ModelAttribute Calculadora calculadora) {
		calculadora.subtrair();
		return "result";
	}
	
	@GetMapping("/multiplicacao")
	public String multiplicacao(final Model model) {
		model.addAttribute("calculadora", new Calculadora());
		return "multiplicacao";
	}
	
	@PostMapping("/multiplicar")
	public String multiplicar(@ModelAttribute Calculadora calculadora) {
		calculadora.multiplicar();
		return "result";
	}

}
