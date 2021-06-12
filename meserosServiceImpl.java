package edu.uspg.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uspg.dao.ImeserosDAO;
import edu.uspg.model.meseros;
import edu.uspg.service.ImeserosService;

@Service
public class meserosServiceImpl implements ImeserosService {

	@Autowired
	private ImeserosDAO dao;
	
	@Override
	public meseros registrar(meseros t) {
		return dao.save(t);
	}

	@Override
	public meseros modificar(meseros t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);		
	}

	@Override
	public Optional<meseros> listarPorId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<meseros> listar() {
		return dao.findAll();
	}

}