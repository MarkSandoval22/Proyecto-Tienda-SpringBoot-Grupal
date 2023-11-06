package com.proyecto.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.tienda.model.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
