package ProyectoBBackEnd.Bar.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProyectoBBackEnd.Bar.models.Mesa;
import ProyectoBBackEnd.Bar.repositorys.MesaRepository;

@Service
public class MesaService {
    
    @Autowired
    private MesaRepository mesaRepo;


/*
getAllMesas devueve todas las mesas abiertas, es decir que estan ocupadas en el instante actual
*/
    public List<Mesa> getAllMesas(){
        List<Mesa> milista;
        List<Mesa> milista2 = new ArrayList<Mesa>();

        milista = mesaRepo.findAll();

        for(Mesa m1:milista){
            if(m1.isEstado()){
                milista2.add(m1);
            }
        }        
        return milista2;
    }

    
}
