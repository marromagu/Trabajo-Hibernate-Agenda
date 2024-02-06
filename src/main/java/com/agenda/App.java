package com.agenda;

import java.util.Date;
import java.util.List;

import DAO.User;
import DAO.UserPersona;
import hibernate.*;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		var sf = Hibernateconexion.getSessionFactory();
		// Crear una instancia de la clase PersonaDAO
		UserPersona miUserPersona = new UserPersona();

//    	var personaDevuelto=sf.openSession().get(Persona.class, "1");
//    	System.out.println(personaDevuelto);

//    	var departamentoDevuelto = sf.openSession().get(Departamento.class, "1");
//    	System.out.println(departamentoDevuelto);

//    	var profeDevuelto = sf.openSession().get(Profesor.class, "3");
//    	System.out.println(profeDevuelto);
//    	
//    	var asignaturaDevuelto = sf.openSession().get(Asignatura.class, "1");
//    	System.out.println(asignaturaDevuelto);
//    	
//    	var cursoDevuelto = sf.openSession().get(CursoEscolar.class, "1");
//    	System.out.println(cursoDevuelto);

		/// User.richi();

//    	AlumnoSeMatriculaAsignaturaId amaId = new AlumnoSeMatriculaAsignaturaId(19,1,5);
//    	var ama = sf.openSession().get(AlumnoSeMatriculaAsignatura.class, amaId);
//    	System.out.println(ama);

//        // Obtener una Persona por su ID
//		Persona personaRecuperada = miUserPersona.obtenerPersonaPorId(1);
//		System.out.println(personaRecuperada);

//		List<Object[]> resultado =  miUserPersona.contarPersonasPorNombre();
//		System.out.println(resultado.size());
//		
//		List<Object[]> resultado2 =  miUserPersona.contarPersonasPorsexo();
//		System.out.println(resultado2.size());

//		System.out.println("Personas que también son profesores:");
//		for (Profesor personaProfe : miUserPersona.obtenerPersonasQueSonProfesores()) {
//			System.out.println(personaProfe.getIdProfesor());
//		}

//        // Obtener todas las Personas
//        System.out.println("Todas las personas:");
//        for (Persona persona : miUserPersona.obtenerTodasLasPersonas()) {
//            System.out.println(persona);
//        }obtenerPersonasQueSonProfesores

		// Crear una nueva Persona y guardarla en la base de datos

//        Persona nuevaPersona = new Persona();
//        nuevaPersona.setNif("123456789");
//        nuevaPersona.setNombre("Mario");
//        nuevaPersona.setApellido1("Romero");
//        nuevaPersona.setApellido2("Aguilar");
//        nuevaPersona.setCiudad("Ciudad1");
//        nuevaPersona.setDireccion("Calle1");
//        nuevaPersona.setTelefono("1234567890");
//        nuevaPersona.setFechaNacimiento( (java.sql.Date) new Date(System.currentTimeMillis()));
//        nuevaPersona.setSexo("H");
//        nuevaPersona.setTipo("alumno");
//        miUserPersona.guardarPersona(nuevaPersona);

        // Actualizar una Persona existente en la base de datos
//        Persona personaExistente = miUserPersona.obtenerPersonaPorId(2);
//        System.out.println("--------------------------------");
//        System.out.println(personaExistente.getNombre());
//        personaExistente.setNombre("Ric");
//        System.out.println(personaExistente.getNombre());
//        miUserPersona.actualizarPersona(personaExistente);

		
        // Eliminar una Persona de la base de datos
        Persona personaAEliminar = miUserPersona.obtenerPersonaPorId(2);
        miUserPersona.eliminarPersona(personaAEliminar);

	}
}
