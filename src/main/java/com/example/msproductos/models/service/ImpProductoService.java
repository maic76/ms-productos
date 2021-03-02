package com.example.msproductos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.msproductos.models.entity.Producto;
import com.example.msproductos.models.repository.ProductoRepository;

@Service
public class ImpProductoService implements IProductoService {

	@Autowired
	ProductoRepository productoRepo;
	
	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoRepo.findAll();
	}

	@Override
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return productoRepo.findById(id).orElse(null);
	}

}
