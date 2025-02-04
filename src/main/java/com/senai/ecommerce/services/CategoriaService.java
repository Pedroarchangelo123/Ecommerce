package com.senai.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.ecommerce.entities.Categoria;
import com.senai.ecommerce.entities.Produto;
import com.senai.ecommerce.repositores.CategoriaRepository;

@Service
public class CategoriaService {
@Autowired
CategoriaRepository repo;

public List<Categoria> buscarTodos() {
	 List<Categoria> list = repo.findAll();
	 return list;
}
}
