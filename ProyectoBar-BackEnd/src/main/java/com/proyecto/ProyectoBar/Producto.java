package com.proyecto.ProyectoBar;

import java.io.Serializable;


//import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Table
public class Producto{
//https://www.youtube.com/watch?v=twa9Fv467Dk&ab_channel=QualitrainTV

//    @EmbeddedId   
//    private ProductoClavePrimaria productoId;

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long numeroProducto;
    private String nombre;

    private int precio;

    
    public Producto(){

    }
public Long getNumeroProducto() {
        return numeroProducto;
    }
    public void setNumeroProducto(Long numeroProducto) {
        this.numeroProducto = numeroProducto;
    }
    public Producto(Long id, Long numeroProducto,String nombre, int precio){
        this.id = id;
        this.setNumeroProducto(numeroProducto);
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


}
