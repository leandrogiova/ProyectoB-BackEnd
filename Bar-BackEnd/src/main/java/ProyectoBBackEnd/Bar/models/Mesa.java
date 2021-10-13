package ProyectoBBackEnd.Bar.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Mesa")
@Data
public class Mesa {
    
    @Id
    private Long id;
    private int numeroMesa;
    private boolean estado;
    private Date fecha;
    private String detalle;
    private int precioTemporal;


    public Mesa(){
    }

    public Mesa(Long id, int numeroMesa, boolean estado, Date fecha, String detalle, int precioTemporal){
        this.id = id;
        this.numeroMesa = numeroMesa;
        this.estado = estado;
        this.fecha = fecha;
        this.detalle = detalle;
        this.precioTemporal = precioTemporal;
    }


    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }


    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    

    public int getNumeroMesa() {
        return numeroMesa;
    }
    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }


    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    public int getPrecioTemporal() {
        return precioTemporal;
    }
    public void setPrecioTemporal(int precioTemporal) {
        this.precioTemporal = precioTemporal;
    }
    
}
