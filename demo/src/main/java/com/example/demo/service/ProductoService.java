package com.example.demo.service;

import java.util.List;
import java.util.Set;

import com.example.demo.models.Producto;
import com.example.demo.repository.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductoService {
   
    @Autowired
    private ProductoRepository productoRepo;

  
    public List<Producto> getAll(){
        return (List<Producto>) productoRepo.findAll();
    }


    public void postProducto(Producto p1){
        productoRepo.save(p1);
    }

}
