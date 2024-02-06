package hibernate;

import java.util.HashSet;
import java.util.Set;

public class CursoEscolar {
	private int id;
	private short anoInicio;
	private short anoFin;
	private Set<AlumnoSeMatriculaAsignatura> alumnoSeMatriculaAsignaturas = new HashSet<AlumnoSeMatriculaAsignatura>(0);
	public CursoEscolar() {
		
	}
	

	@Override
	public String toString() {
		return "CursoEscolar [id=" + id + ", anoInicio=" + anoInicio + ", anoFin=" + anoFin
				+ ", alumnoSeMatriculaAsignaturas=" + alumnoSeMatriculaAsignaturas.size() + "]";
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public short getAnoInicio() {
		return anoInicio;
	}

	public void setAnoInicio(short anoInicio) {
		this.anoInicio = anoInicio;
	}

	public short getAnoFin() {
		return anoFin;
	}

	public void setAnoFin(short anoFin) {
		this.anoFin = anoFin;
	}

	public Set<AlumnoSeMatriculaAsignatura> getAlumnoSeMatriculaAsignaturas() {
		return alumnoSeMatriculaAsignaturas;
	}

	public void setAlumnoSeMatriculaAsignaturas(Set<AlumnoSeMatriculaAsignatura> alumnoSeMatriculaAsignaturas) {
		this.alumnoSeMatriculaAsignaturas = alumnoSeMatriculaAsignaturas;
	}	
}
