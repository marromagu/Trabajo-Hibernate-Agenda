package hibernate;

import java.util.HashSet;
import java.util.Set;

public class Grado {
	private int id;
	private String nombre;
	private Set<Asignatura> asignaturas = new HashSet<Asignatura>(0);
	
	public Grado() {
		
	}

	@Override
	public String toString() {
		return "Grado [id=" + id + ", nombre=" + nombre + ", asignaturas=" + asignaturas.size() + "]";
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

	public Set<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Set<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
}
