package com.example.demo.controller;

import java.io.Console;
import java.util.List;
import java.util.Set;

import com.example.demo.models.Producto;
import com.example.demo.repository.ProductoRepository;
import com.example.demo.service.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/productos"})
public class ProductoController {

    private List<Producto> milista;



    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto>listar(){
        return (List<Producto>) productoService.getAll();
    }





    /*
    @GetMapping("/listar")
    public String listar(Model model){
        List<Producto> productos = productoService.listar();
        return "index";

    }

    @RestController
@RequestMapping({"/personas"})

    @GetMapping
    public List<Producto> funcionGet2(){
        milista = productoService.getAll();
        return milista;
    }






    @GetMapping
    public List<Producto> funcionGet(){
        milista = productoService.getAll();
        return milista;
    }


    public List<Producto> miNuevaFuncionGet(){
        milista = productoService.getAll();
        return milista;
    }

    @PostMapping
    public void save(Producto p1){
        productoService.postProducto(p1);
    }
    */

}
