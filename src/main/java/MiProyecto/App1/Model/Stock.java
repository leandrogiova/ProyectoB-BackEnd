package MiProyecto.App1.Model;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity @Table @Data
public class Stock {

    @Id @Column private Long id;

    @Column @OneToMany private Set<Producto> listadeStock;

    @Column private String fecha;

    @Column private @OneToOne Proveedor proveedor1;


    public Stock(Long id, Set<Producto> listadeProductos, String fecha, Proveedor proveedor1){
        this.id = id;
        this.listadeStock = listadeProductos;
        this.fecha = fecha;
        this.proveedor1 = proveedor1;
    }
}
