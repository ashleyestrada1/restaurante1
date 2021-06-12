package edu.uspg.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uspg.dao.IclientesDAO;
import edu.uspg.model.Cliente;
import edu.uspg.service.IclientesService;

@Service
public class clienteServiceImpl implements IclientesService {

	@Autowired
	private IclientesDAO dao;
	
	@Override
	public Cliente registrar(Cliente t) {
		return dao.save(t);
	}

	@Override
	public Cliente modificar(Cliente t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);		
	}

	@Override
	public Optional<Cliente> listarPorId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Cliente> listar() {
		return dao.findAll();
	}

}