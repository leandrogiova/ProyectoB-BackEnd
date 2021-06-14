package MiProyecto.App1.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.springframework.lang.NonNull;

import lombok.Data;

@Entity
@Table
@Data
public class Mesa {
    
    @Column @Id private Long id;

    @Column private String nombre;

    @Column private String fecha;

    @Column @NonNull private Boolean activa;

    public Mesa(Long id, String nombre, String fecha, Boolean true1){
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.activa = true1;
    }
    public Mesa() {
    }
    

}
