package ProyectoBBackEnd.Bar.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProyectoBBackEnd.Bar.models.Mesa_Producto;
import ProyectoBBackEnd.Bar.repositorys.MesaProductosRepository;
import ProyectoBBackEnd.Bar.services.MesaProductosService;

@CrossOrigin
@RestController
@RequestMapping("/mesasAbiertas")
public class MesaProductosController {
    
    @Autowired
    private MesaProductosService mesaProductosService;


    @Autowired 
    private MesaProductosRepository mesaProductoRepo;


    private LocalDateTime fecha1;
    private LocalDateTime fecha2;

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
    public void enviarProductoAMesa(@RequestBody Mesa_Producto m1){
        mesaProductosService.enviarProductoMesa(m1);
    }

    @PostMapping("/cobrarMesa")
    public void cobrarMesa(@RequestBody Mesa_Producto m1){

        Mesa_Producto mesaActual = mesaProductoRepo.findById(m1.getId()).orElse(null);

        //actualiza el estado de la mesa para cerarla
        mesaActual.setEstado(m1.getEstado());
        
        mesaProductoRepo.save(mesaActual);
    }




    @PostMapping("/updateMesa")
    public void actualizar(@RequestBody Mesa_Producto m1){
        Mesa_Producto mesaActual = mesaProductoRepo.findById(m1.getId()).orElse(null);
        mesaActual.setListaProductos(m1.getListaProductos());
        mesaActual.setPrecioTotal(m1.getPrecioTotal());
        
        mesaProductoRepo.save(mesaActual);
    }







    @PostMapping("/FechasResumenes")
    public void fechasResumenes(@RequestBody LocalDateTime fechas[]){
        fecha1 = fechas[0];
        fecha2 = fechas[1];
    }
    


    @GetMapping("/Resumenes")
    public List<Mesa_Producto> resumenes(){

            List<Mesa_Producto> lista1;
        List<Mesa_Producto> lista2 = new ArrayList<Mesa_Producto>();
        lista1 = mesaProductosService.getAllMesasAbiertas();    
        if(fecha1 == fecha2){
            for (Mesa_Producto mesa_Producto : lista1) {
                if(mesa_Producto.getFecha().compareTo(fecha1) == 0){
                    lista2.add(mesa_Producto);
                }
            }    
        }
        else{
            for (Mesa_Producto mesa_Producto : lista1) {
                if(mesa_Producto.getFecha().compareTo(fecha1) > 0 && mesa_Producto.getFecha().compareTo(fecha2) < 0){ 
                    lista2.add(mesa_Producto);
                }
            }
        }
        return lista2;
    } 
 }
