package MiProyecto.App1.Model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "ConsumoPorMesa")
@Data
public class MesaProducto {
    @Id @Column private Long id;

    @OneToMany @Column
    private Set<Producto> listaproductos;

    @OneToOne
    private Mesa mesaUnica;

    @Column private int cantidad;

     public MesaProducto(Long id, Set<Producto> listaproductos, Mesa mesaUnica, int cantidad) {
        this.id = id;
        this.listaproductos = listaproductos;
        this.mesaUnica = mesaUnica;
        this.cantidad = cantidad;
    }

    public MesaProducto() {
    }

    public MesaProducto(Long varLong) {
    }

    public void agregarProducto(Producto p){
        listaproductos.add(p);
    }





}
