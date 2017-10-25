/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evolutions.implement;


//import com.evolutions.factory.FactoryManager;
import com.evolutions.business.ILogin;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

/**
 *
 * @author Dark Flowers
 */
public class methodsLogin {

    private final EntityManager em=null;
    private final EntityManagerFactory entityManagerFactory=null;

    public methodsLogin() {
      // this.entityManagerFactory = FactoryManager.getEntityManagerFactory();
      // this.em = entityManagerFactory.createEntityManager();
    }

   
    public String authenticate(String user, String password) throws Exception {
       
     /*  em.getTransaction().begin();
       TypedQuery<Long> query = em.createNamedQuery("TB_Login.authenticate",Long.class)
                                .setParameter("ususer", user)
                                .setParameter("uspassword", password)
                                .setParameter("usstatus", 1);
       long usersCount = query.getSingleResult();
       em.close();
       return (usersCount==1)?"Bienvenido ".concat(user):"Error en los datos capturados."; 
       */
     return "";
    }
    
    
 

      
    
    
}
