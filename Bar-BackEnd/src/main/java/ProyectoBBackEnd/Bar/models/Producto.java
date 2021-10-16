package ProyectoBBackEnd.Bar.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="Producto")
@Data
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numeroProducto;

    private String nombre;

    private int precio;

    public Producto(){        
    }

    public Producto(Long id, String nombre, int precio, int numeroProducto) {
        this.id = id;
        this.numeroProducto = numeroProducto;
        this.nombre = nombre;
        this.precio = precio;
    }


    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }


    public int getNumeroProducto() {
        return numeroProducto;
    }
    public void setNumeroProducto(int numeroProducto) {
        this.numeroProducto = numeroProducto;
    }

    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 
}

















