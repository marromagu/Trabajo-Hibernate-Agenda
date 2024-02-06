package hibernate;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Profesor implements Serializable {
	private int idProfesor;
	private Departamento departamento;
	private Persona persona;
	private Set<Asignatura> asignaturas = new HashSet<Asignatura>(0);
	
	public Profesor() {
		
	}

	@Override
	public String toString() {
		return "Profesor [idProfesor=" + idProfesor + ", departamento=" + departamento.getNombre() + ", persona=" + persona.getNombre()
				+ ", asignaturas=" + asignaturas.size() + "]";
	}

	public int getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Set<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Set<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
}
