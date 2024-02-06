package hibernate;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Asignatura implements Serializable{
	private int id;
	private String nombre;
	private float creditos;
	private String tipo;
	private int curso;
	private int cuatrimestre;
	private Profesor profesor;
	private Grado grado;
	private Set<AlumnoSeMatriculaAsignatura> alumnoSeMatriculaAsignaturas = new HashSet<AlumnoSeMatriculaAsignatura>(0);
	
	public Asignatura() {
		
	}
	@Override
	public String toString() {
		return "Asignatura [id=" + id + ", nombre=" + nombre + ", creditos=" + creditos + ", tipo=" + tipo + ", curso="
				+ curso + ", cuatrimestre=" + cuatrimestre + ", profesor=" + profesor.getPersona().getNombre() + ", grado=" + grado.getNombre()
				+ ", alumnoSeMatriculaAsignaturas=" + alumnoSeMatriculaAsignaturas.size() + "]";
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

	public float getCreditos() {
		return creditos;
	}

	public void setCreditos(float creditos) {
		this.creditos = creditos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public int getCuatrimestre() {
		return cuatrimestre;
	}

	public void setCuatrimestre(int cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Grado getGrado() {
		return grado;
	}

	public void setGrado(Grado grado) {
		this.grado = grado;
	}

	public Set<AlumnoSeMatriculaAsignatura> getAlumnoSeMatriculaAsignaturas() {
		return alumnoSeMatriculaAsignaturas;
	}

	public void setAlumnoSeMatriculaAsignaturas(Set<AlumnoSeMatriculaAsignatura> alumnoSeMatriculaAsignaturas) {
		this.alumnoSeMatriculaAsignaturas = alumnoSeMatriculaAsignaturas;
	}
}
