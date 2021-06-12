package edu.uspg.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uspg.dao.ImesasDAO;
import edu.uspg.model.mesas;
import edu.uspg.service.ImesasService;

@Service
public class mesasServiceImpl implements ImesasService {

	@Autowired
	private ImesasDAO dao;
	
	@Override
	public mesas registrar(mesas t) {
		return dao.save(t);
	}

	@Override
	public mesas modificar(mesas t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);		
	}

	@Override
	public Optional<mesas> listarPorId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<mesas> listar() {
		return dao.findAll();
	}

}