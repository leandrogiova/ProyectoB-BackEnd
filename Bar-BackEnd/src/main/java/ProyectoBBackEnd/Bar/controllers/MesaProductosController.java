package ProyectoBBackEnd.Bar.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProyectoBBackEnd.Bar.models.Mesa_Producto;
import ProyectoBBackEnd.Bar.models.Producto;
import ProyectoBBackEnd.Bar.services.MesaProductosService;

@CrossOrigin
@RestController
@RequestMapping("/mesasAbiertas")
public class MesaProductosController {
    
    @Autowired
    private MesaProductosService mesaProductosService;

    @GetMapping("/lista")
    public List<Mesa_Producto> mesasAbiertas(){
        List<Mesa_Producto> lista1;
        List<Mesa_Producto> lista2 = new ArrayList<Mesa_Producto>();

       lista1 = mesaProductosService.getAllMesasAbiertas();
        for (Mesa_Producto mesa_Producto : lista1) {
            if(mesa_Producto.getEstado()){
                lista2.add(mesa_Producto);
            }
        }
       return lista2;
    }

    @PostMapping("/envio")
    public void enviarProductoAMesa(Mesa_Producto m1){
        mesaProductosService.enviarProductoMesa(m1);
    }

}
