package ProyectoBBackEnd.Bar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProyectoBBackEnd.Bar.models.Mesa;
import ProyectoBBackEnd.Bar.services.MesaService;

@CrossOrigin
@RestController
@RequestMapping("/mesas")
public class MesaController {
    
    @Autowired
    private MesaService mesaService;

    @GetMapping
    public List<Mesa> todasLasMesasAbiertas(){
        return mesaService.getAllMesas();
    }

}
