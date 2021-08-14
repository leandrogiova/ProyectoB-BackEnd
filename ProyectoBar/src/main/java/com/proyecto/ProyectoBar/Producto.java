package com.proyecto.ProyectoBar;

import java.io.Serializable;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
public class Producto{
//https://www.youtube.com/watch?v=twa9Fv467Dk&ab_channel=QualitrainTV

    @EmbeddedId   
    private ProductoClavePrimaria productoId;

    private String nombre;

    private int precio;

    
    public Producto(){

    }
    public Producto(ProductoClavePrimaria productoId, String nombre, int precio){
        this.productoId = productoId;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }


    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ProductoClavePrimaria getProductoClavePrimaria(){
        return this.productoId;
    }
    public void setProductoClavePrimaria(ProductoClavePrimaria productoId){
        this.productoId = productoId;
    }

}
