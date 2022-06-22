package dao;

import dto.Datos_1;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class datosDAO {

    public static EntityManagerFactory getEntity(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Login2PU");
        return emf;
    }
    
    public static void agregar(Datos_1 usua) {
        EntityManager em = getEntity().createEntityManager();
        em.getTransaction().begin();
        em.persist(usua);
        em.getTransaction().commit();
    }


    
    
    public static void main(String[] args) {
        
    }
}
