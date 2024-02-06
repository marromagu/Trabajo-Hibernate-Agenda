package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.agenda.Hibernateconexion;

import hibernate.Grado;

public class User {
	
	
    public static void richi() {
    	SessionFactory sf=Hibernateconexion.getSessionFactory();
        try (Session session = sf.openSession()) {
            String hql = "from Grado g ";


            Query<Object[]> query = session.createQuery(hql, Object[].class);
            ArrayList<String> arrayString = new ArrayList<String>();
            for(Object[] o: query.list()) {
            	for(Object object: o) {
            		Grado grado = (Grado) object;
            		arrayString.add(grado.toString());
            	}
            }
            for(String s: arrayString) {
            	System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
