package hibernate;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Departamento implements Serializable {
	private int id;
	private String nombre;
	private Set<Profesor> profesores = new HashSet<Profesor>(0);
	
	public Departamento() {
		
	}
	
	

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombre=" + nombre + ", profesores=" + profesores.size() + "]";
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(Set<Profesor> profesores) {
		this.profesores = profesores;
	}
	
	
}
