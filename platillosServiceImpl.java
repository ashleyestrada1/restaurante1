package edu.uspg.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uspg.dao.IplatillosDAO;
import edu.uspg.model.platillos;
import edu.uspg.service.IplatillosService;

@Service
public class platillosServiceImpl implements IplatillosService {

	@Autowired
	private IplatillosDAO dao;
	
	@Override
	public platillos registrar(platillos t) {
		return dao.save(t);
	}

	@Override
	public platillos modificar(platillos t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);		
	}

	@Override
	public Optional<platillos> listarPorId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<platillos> listar() {
		return dao.findAll();
	}

}