package com.example.msproductos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.msproductos.models.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

	
}
