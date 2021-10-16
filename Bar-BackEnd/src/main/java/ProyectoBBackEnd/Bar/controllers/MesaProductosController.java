package ProyectoBBackEnd.Bar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProyectoBBackEnd.Bar.models.Mesa_Producto;
import ProyectoBBackEnd.Bar.services.MesaProductosService;

@CrossOrigin
@RestController
@RequestMapping("/mesasAbiertas")
public class MesaProductosController {
    
    @Autowired
    private MesaProductosService mesaProductosService;

    @GetMapping
    public List<Mesa_Producto> mesasAbiertas(){
       return mesaProductosService.getAllMesasAbiertas();
    }

}
