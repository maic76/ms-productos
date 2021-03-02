package com.example.msproductos.models.service;

import java.util.List;

import com.example.msproductos.models.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();
	
	public Producto findById(Long id);
}
