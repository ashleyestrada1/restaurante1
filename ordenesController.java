package edu.uspg.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.uspg.exception.ModeloNotFoundException;
import edu.uspg.model.Ordenes;
import edu.uspg.service.IordenesService;

@RestController
@RequestMapping("/ordenes")
public class ordenesController {

	@Autowired
	private IordenesService service;
	
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Ordenes>> listar(){
		return new ResponseEntity<List<Ordenes>>(service.listar(), HttpStatus.OK);
	}
	
	
	@GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Ordenes> listarPodId(@PathVariable("id") Integer id){
	
		Optional<Ordenes> ordenes = service.listarPorId(id);
		if(!ordenes.isPresent()) {
			throw new ModeloNotFoundException("id no encontrado:" + id);
		}
		return new ResponseEntity<ordenes>(Ordenes.get(),HttpStatus.OK);
	}
	

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> registrar(@RequestBody Ordenes Orden) {
		Ordenes Ordenes = new Ordenes();
		Ordenes = service.registrar(Orden);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(Ordenes.getIdOrdenes()).toUri();
		return ResponseEntity.created(location).build();
	}
	

	@PutMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> modificar(@RequestBody Ordenes Orden){
		service.modificar(Orden);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		Optional<Ordenes> Ordenes = service.listarPorId(id);
		if(!Ordenes.isPresent()) {
			throw new ModeloNotFoundException("id no encontrado: " + id);
		} else {
			service.eliminar(id);
		}
	}
}