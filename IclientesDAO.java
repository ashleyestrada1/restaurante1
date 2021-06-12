package edu.uspg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.uspg.model.Cliente;

public interface IclientesDAO extends JpaRepository<Cliente, Integer> {

}

