package com.rodrigo.sga.controller;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rodrigo.sga.model.Aeronave;
import com.rodrigo.sga.repository.AeronaveRepository;

@RestController
@Controller
@CrossOrigin
public class AeronavesController {
	@Autowired
	private AeronaveRepository ar;

	@GetMapping("/aeronaves")
	public Iterable<Aeronave> listaAeronaves() {
		Iterable<Aeronave> aeronaves = ar.findAll();
		return aeronaves;
	}
	
	@GetMapping("/aeronaves/find")
	@CrossOrigin
	public Iterable<Object> findAeronaves(@RequestParam String parametro) {
		switch (parametro) {
		case "naoVendidos": {
			Iterable<Object> count = ar.findByVendido(false);
			return count;
		}
		case "aeronavesSemana": {
			Calendar semanaPassada = Calendar.getInstance();
			semanaPassada.add(Calendar.DAY_OF_MONTH, -1);
			Iterable<Object> aeronaves = ar.findByCreatedAfter(semanaPassada.getTime());
			return aeronaves;
		}
		case "countMarcas": {
			Iterable<Object> marcas = ar.findByMarca();
			return marcas;
		}
		case "countDecadas": {
			Iterable<Object> marcas = ar.findByAno();
			return marcas;
		}
		}
		return null;
	}
	
	@GetMapping("/aeronaves/{id}")
	@CrossOrigin
	public Aeronave buscaAeronave(@PathVariable long id) {
		Aeronave aeronave = ar.findByid(id);
		return aeronave;
	}

	@PostMapping("/aeronaves")
	@CrossOrigin
	public Aeronave criarAeronave(@RequestBody Aeronave aeronave, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return aeronave;
		}
		aeronave.setCreated(new Date());
		ar.save(aeronave);
		attributes.addFlashAttribute("mensagem", "Aeronave cadastrada com sucesso!");
		return new Aeronave();
	}

	@PutMapping("/aeronaves/{id}")
	@CrossOrigin
	public Aeronave atualizaAeronave(@RequestBody Aeronave aeronave) {
		aeronave.setUpdated(new Date());
		ar.save(aeronave);
		return aeronave;
	}	
	
	@DeleteMapping("/aeronaves/{id}")
	@CrossOrigin
	public void deletaAeroanve(@PathVariable long id) {
		Aeronave aeronave = ar.findByid(id);
		ar.delete(aeronave);
	}	
}