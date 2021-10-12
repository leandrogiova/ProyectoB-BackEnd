package com.example.demo.service;

import com.example.demo.repository.MesaRepository;
import com.example.demo.models.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MesaService {
    
    @Autowired
    private MesaRepository mesaRepo;


    public List<Mesa> getAllMesas(){
        return mesaRepo.findAll();
    }

}
