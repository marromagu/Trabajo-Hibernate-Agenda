package hibernate;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class Persona implements Serializable {
	
	private int id;
	private String nif;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String ciudad;
	private String direccion;
	private String telefono;
	private Date fechaNacimiento;
	private String sexo;
	private String tipo;
	private Profesor profesor;
	private Set<AlumnoSeMatriculaAsignatura> alumnoSeMatriculaAsignaturas = new HashSet<AlumnoSeMatriculaAsignatura>(0);
	
	public Persona() {
	}
	

	public Persona(String nif, String nombre, String apellido1, String apellido2, String ciudad, String direccion,
			String telefono, Date fechaNacimiento, String sexo, String tipo) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Persona [id=" + id + ", nif=" + nif + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", ciudad=" + ciudad + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", fechaNacimiento=" + fechaNacimiento + ", sexo=" + sexo + ", tipo=" + tipo + ", profesor="
				+ profesor + ", alumnoSeMatriculaAsignaturas=" + alumnoSeMatriculaAsignaturas.size() + "]";
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Set<AlumnoSeMatriculaAsignatura> getAlumnoSeMatriculaAsignaturas() {
		return alumnoSeMatriculaAsignaturas;
	}

	public void setAlumnoSeMatriculaAsignaturas(Set<AlumnoSeMatriculaAsignatura> alumnoSeMatriculaAsignaturas) {
		this.alumnoSeMatriculaAsignaturas = alumnoSeMatriculaAsignaturas;
	}
}

