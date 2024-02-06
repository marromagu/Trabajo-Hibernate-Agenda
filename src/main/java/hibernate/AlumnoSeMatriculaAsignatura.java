package hibernate;

import java.io.Serializable;

public class AlumnoSeMatriculaAsignatura implements Serializable {
	private AlumnoSeMatriculaAsignaturaId alumnoMatriculaCursoId;
	private Persona alumno;
	private Asignatura asignatura;
	private CursoEscolar cursoEscolar;
	
	public AlumnoSeMatriculaAsignatura() {
		
	}
	
	@Override
	public String toString() {
		return "AlumnoMatriculaCurso [alumnoMatriculaCursoId=" + alumnoMatriculaCursoId + ", alumno=" + alumno.getNombre()
				+ ", asignatura=" + asignatura.getNombre() + ", cursoEscolar=" + cursoEscolar.getAnoInicio() +"-"+cursoEscolar.getAnoFin()+ "]";
	}

	public AlumnoSeMatriculaAsignaturaId getAlumnoMatriculaCursoId() {
		return alumnoMatriculaCursoId;
	}

	public void setAlumnoMatriculaCursoId(AlumnoSeMatriculaAsignaturaId alumnoMatriculaCursoId) {
		this.alumnoMatriculaCursoId = alumnoMatriculaCursoId;
	}



	public Persona getAlumno() {
		return alumno;
	}

	public void setAlumno(Persona alumno) {
		this.alumno = alumno;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public CursoEscolar getCursoEscolar() {
		return cursoEscolar;
	}

	public void setCursoEscolar(CursoEscolar cursoEscolar) {
		this.cursoEscolar = cursoEscolar;
	}
}
