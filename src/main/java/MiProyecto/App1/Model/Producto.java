    //http://dracof.blogspot.com/2012/05/claves-compuestas-jpa.html
    //https://www.iteramos.com/pregunta/21252/-como-asignar-una-clave-compuesta-con-hibernate-
    //https://programmerclick.com/article/28881638783/
    //https://www.oscarblancarteblog.com/2016/11/02/llaves-compuestas-idclass/




package MiProyecto.App1.Model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;



@Entity
@Table
@IdClass(Producto.class)
public class Producto implements Serializable{

    @Column @Id private int id_grupo;

    @Column @Id private Long id;

    @Column private String nombre;

    @Column private int precio;

    public Producto (int id_grupo, Long id, String nombre, int precio){
        this.id_grupo = id_grupo;
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    } 
    public Producto() { }
    


}
