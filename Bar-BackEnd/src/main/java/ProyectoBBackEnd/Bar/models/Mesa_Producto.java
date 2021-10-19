package ProyectoBBackEnd.Bar.models;

import java.sql.Date;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Mesa_Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_mesa")
    private int numero_mesa;

    @OneToMany()
    private List<Producto> listaProductos;



    @Column(name = "estado")
    private boolean estado;

    public Mesa_Producto(){
    }
    public Mesa_Producto(Long id, int numero_mesa,  List<Producto> listaProductos,  boolean estado){
        this.id = id;   
        this.estado = estado;
        this.listaProductos = listaProductos;
        this.numero_mesa = numero_mesa;


    }

    public void setListaProductos(List<Producto> listaProductos){
        this.listaProductos = listaProductos;
    }
    public List<Producto> getListaProductos(){
        return listaProductos;
    }

    public int getNumero_mesa(){
        return this.numero_mesa;
    }
    public void setNumero_mesa(int numeroMesa){
        this.numero_mesa = numeroMesa;
    }


    public boolean getEstado(){
        return this.estado;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }

}











   
/*
    @Column(name = "fecha")
    private Date fecha;}
        public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }














    @Column(name = "detalle")
    private String detalle;

    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    public Mesa_Producto(Long id, List<Producto> listaProductos, int numero_mesa, boolean estado, Date fecha, int precio_temporal, String forma_pago, String detalle ){
        this.id = id;
        this.listaProductos = listaProductos;
        this.numero_mesa = numero_mesa;
        this.estado = estado;
        this.fecha = fecha;
        this.precio_temporal = precio_temporal;
        this.detalle = detalle;
    }





        @Column(name = "precio_temporal")
    private int precio_temporal;
    @Column(name = "forma_pago")
    private String forma_pago;
    public String getFormaPago() {
        return forma_pago;
    }
    public void setFormaPago(String formaPago) {
        this.forma_pago = formaPago;
    }

    public int getPrecioTemporal() {
        return precio_temporal;
    }
    public void setPrecioTemporal(int precioTemporal) {
        this.precio_temporal = precioTemporal;
    }


    */