package hibernate;

public class AlumnoSeMatriculaAsignaturaId implements java.io.Serializable {

	private int idAlumno;
	private int idAsignatura;
	private int idCursoEscolar;

	public AlumnoSeMatriculaAsignaturaId() {
	}

	public AlumnoSeMatriculaAsignaturaId(int idAlumno, int idAsignatura, int idCursoEscolar) {
		this.idAlumno = idAlumno;
		this.idAsignatura = idAsignatura;
		this.idCursoEscolar = idCursoEscolar;
	}

	public int getIdAlumno() {
		return this.idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public int getIdAsignatura() {
		return this.idAsignatura;
	}

	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	public int getIdCursoEscolar() {
		return this.idCursoEscolar;
	}

	public void setIdCursoEscolar(int idCursoEscolar) {
		this.idCursoEscolar = idCursoEscolar;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AlumnoSeMatriculaAsignaturaId))
			return false;
		AlumnoSeMatriculaAsignaturaId castOther = (AlumnoSeMatriculaAsignaturaId) other;

		return (this.getIdAlumno() == castOther.getIdAlumno())
				&& (this.getIdAsignatura() == castOther.getIdAsignatura())
				&& (this.getIdCursoEscolar() == castOther.getIdCursoEscolar());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdAlumno();
		result = 37 * result + this.getIdAsignatura();
		result = 37 * result + this.getIdCursoEscolar();
		return result;
	}

}
