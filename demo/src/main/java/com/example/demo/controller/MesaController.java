package com.example.demo.controller;

import java.util.List;

import com.example.demo.models.Mesa;
import com.example.demo.repository.MesaRepository;
import com.example.demo.service.MesaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/mesa"})
public class MesaController {
    
    @Autowired
    private MesaRepository mesaRepo;

    @GetMapping
    public List<Mesa> todasLasMesas(){
        return mesaRepo.findAll();
    }
}
