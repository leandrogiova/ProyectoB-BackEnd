package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.Producto;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {
 
//    List<Producto> findAll();


}
