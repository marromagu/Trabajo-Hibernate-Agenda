package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.agenda.*;
import hibernate.*;

public class UserPersona {

	// Obtiene la SessionFactory de la conexión a Hibernate
	private SessionFactory sessionFactory = Hibernateconexion.getSessionFactory();

	// Busca y devuelve una Persona por su ID
	public Persona obtenerPersonaPorId(int id) {
		return sessionFactory.openSession().get(Persona.class, id);
	}

	// Obtiene todas las Personas de la base de datos
	public List<Persona> obtenerTodasLasPersonas() {
		Session session = sessionFactory.openSession();
		List<Persona> personas = session.createQuery("FROM Persona", Persona.class).list();
		session.close();
		return personas;
	}

	// Consulta HQL con join entre Persona y Profesor
	public List<Profesor> obtenerPersonasQueSonProfesores() {
		Session session = sessionFactory.openSession();

		String hql = "SELECT p FROM Persona p JOIN Profesor pr ON p.id = pr.persona.id";

		Query<Profesor> query = session.createQuery(hql, Profesor.class);
		List<Profesor> resultado = query.getResultList();

		session.close();
		return resultado;
	}
	public List<Persona> obtenerPersonasQueNoSonProfesores() {
	    Session session = sessionFactory.openSession();

	    String hql = "SELECT p FROM Persona p WHERE p NOT IN (SELECT pr.persona FROM Profesor pr)";

	    Query<Persona> query = session.createQuery(hql, Persona.class);
	    List<Persona> resultado = query.getResultList();

	    session.close();
	    return resultado;
	}
	// Consulta HQL con GROUP BY
	public List<Object[]> contarPersonasPorNombre() {
		Session session = sessionFactory.openSession();

		// Consulta HQL con GROUP BY
		String hql = "SELECT nombre, COUNT(*) FROM Persona GROUP BY nombre";

		Query<Object[]> query = session.createQuery(hql, Object[].class);
		List<Object[]> resultado = query.getResultList();

		session.close();
		return resultado;
	}

	// Consulta HQL con GROUP BY
	public List<Object[]> contarPersonasPorsexo() {
		Session session = sessionFactory.openSession();

		// Consulta HQL con GROUP BY
		String hql = "SELECT sexo, COUNT(*) FROM Persona GROUP BY sexo";

		Query<Object[]> query = session.createQuery(hql, Object[].class);
		List<Object[]> resultado = query.getResultList();

		session.close();
		return resultado;
	}

	// Guarda una nueva Persona en la base de datos
	public void guardarPersona(Persona persona) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(persona);
		transaction.commit();
		session.close();
	}

	// Actualiza una Persona existente en la base de datos
	public void actualizarPersona(Persona persona) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(persona);
		transaction.commit();
		session.close();
	}

	// Elimina una Persona de la base de datos
	public void eliminarPersona(Persona persona) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.remove(persona);
		transaction.commit();
		session.close();
	}
}
