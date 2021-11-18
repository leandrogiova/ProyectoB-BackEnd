package ProyectoBBackEnd.Bar.models;

import java.time.*;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.print.attribute.standard.DateTimeAtCompleted;

@Entity
public class Mesa_Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_mesa")
    private Long numero_mesa;

    @OneToMany()
    private List<Producto> listaProductos;

    @Column(name = "estado")
    private boolean estado;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    @Column(name = "precioTotal")
    private int precioTotal;

    @Column(name = "precioTemporal")
    private int precioTemporal;

    @Column(name = "formaDePago")
    private String formaDePago;

    @Column(name = "detalle")
    private String detalle;


    public Mesa_Producto(){
    }
    public Mesa_Producto(Long id, Long numero_mesa, List<Producto> listaProductos, boolean estado, LocalDateTime fecha,
            int precioTotal, int precioTemporal, String formaDePago, String detalle) {
        this.id = id;
        this.numero_mesa = numero_mesa;
        this.listaProductos = listaProductos;
        this.estado = estado;
        this.fecha = fecha;
        this.precioTotal = precioTotal;
        this.precioTemporal = precioTemporal;
        this.formaDePago = formaDePago;
        this.detalle = detalle;
    }


    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return this.id;
    }


    public void setListaProductos(List<Producto> listaProductos){
        this.listaProductos = listaProductos;
    }
    public List<Producto> getListaProductos(){
        return listaProductos;
    }


    public Long getNumero_mesa(){
        return this.numero_mesa;
    }
    public void setNumero_mesa(Long numeroMesa){
        this.numero_mesa = numeroMesa;
    }


    public boolean getEstado(){
        return this.estado;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    

    public void setPrecioTotal(int precioTotal){
        this.precioTotal = precioTotal;
    }
    public int getPrecioTotal(){
        return this.precioTotal;
    }


    public void setPrecioTemporal(int precioTemporal){
        this.precioTemporal = precioTemporal;
    }
    public int getPrecioTemporal(){
        return this.precioTemporal;
    }
    
    
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }


    public String getFormaDePago() {
        return formaDePago;
    }
    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }


    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

}











   
/*
    @Column(name = "fecha")
    














    @Column(name = "detalle")
    private String detalle;

    
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