package MiProyecto.App1.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity @Table @Data
public class Proveedor {
    
    @Id @Column private Long id;

    @Column private String nombre;  

    @Column private String apellido;

    @Column private String telefono1;

    @Column private String telefono2;

    @Column private String direccion;

    @Column private String mail;

    @Column private String empresa;
}
