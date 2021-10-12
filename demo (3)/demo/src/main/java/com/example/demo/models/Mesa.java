package com.example.demo.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mesa {
    
    @Id
    private Long id;

    private int numeroMesa;

    private boolean estado;

    private String detalle;

    private Date fecha;





}
