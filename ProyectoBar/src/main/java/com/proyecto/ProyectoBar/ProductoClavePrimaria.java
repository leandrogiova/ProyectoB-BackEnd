package com.proyecto.ProyectoBar;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class ProductoClavePrimaria implements Serializable{
    
    private int id_grupo;

    private int id;


    public ProductoClavePrimaria(){
    }
    public ProductoClavePrimaria(int id_grupo, int id){
        this.setId_grupo(id_grupo);
        this.setId(id);
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId_grupo() {
        return id_grupo;
    }
    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
    }



    @Override
	public int hashCode() {
		return Objects.hash(id, id_grupo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoClavePrimaria other = (ProductoClavePrimaria) obj;
		return id == other.id && id_grupo == other.id_grupo;
	}




}
