package com.proyecto.ProyectoBar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/productos")
@CrossOrigin
public class ProductoController{


    @Autowired
    ProductoRepository productoRepo;

    @GetMapping
    public List<Producto> todosLosProductos(){      
        return productoRepo.findAll();
    }
}










/*
@RestController
@RequestMapping("/productos")
@CrossOrigin
public class ProductoController implements Serializable{

    @Autowired
    private ProductoRepository productoRepo;

    @GetMapping
    @ResponseBody
    public List<Producto> retornarProductos(){
        List<Producto> listaProductos = new ArrayList<>();
        
        Producto p1 = new Producto(1, "cafe");
        Producto p2 = new Producto(2, "cafe chico");
        Producto p3 = new Producto(3, "cafe mediano");
        Producto p4 = new Producto(4, "cafe grande");
        Producto p5 = new Producto(5, "cafe extra grande");

        
        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
        listaProductos.add(p4);
        listaProductos.add(p5);

        System.out.println();

        
        return listaProductos;
    }
}
*/



