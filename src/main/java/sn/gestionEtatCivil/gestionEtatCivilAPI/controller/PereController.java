package sn.gestionEtatCivil.gestionEtatCivilAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.gestionEtatCivil.gestionEtatCivilAPI.model.Pere;
import sn.gestionEtatCivil.gestionEtatCivilAPI.repository.PereRepository;

@RestController
@RequestMapping("/api/pere")
public class PereController {
	@Autowired
	PereRepository pereRepository;
	
	@GetMapping("/peres")
	public List<Pere> getAll() {
		return pereRepository.findAll();
	}
}
