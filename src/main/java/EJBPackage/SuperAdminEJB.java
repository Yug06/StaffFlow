/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package EJBPackage;

import Entitypkg.Designationtb;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Yug
 */
@Stateless
public class SuperAdminEJB {
@PersistenceContext(unitName = "my_persistence_unit")
EntityManager em;

    //Display
    public Collection<Designationtb> displayDesignation(){
        return em.createNamedQuery("Designationtb.findAll").getResultList();
    }

    //Insert
    public void addDesignation(String type){
        Designationtb dt = new Designationtb();
        dt.setType(type);
        em.persist(dt);
    }
    
    //GetDataById
    public Collection<Designationtb> getDataByIdforUpdate(Integer designationID){
        return em.createNamedQuery("Designationtb.findByDesignationID").setParameter("designationID", designationID).getResultList();
    }
    
    //Update
    public void updateDesignation(Integer designationID, String type){
        Designationtb dt = em.find(Designationtb.class, designationID);
        dt.setType(type);
        em.merge(dt);
    }
    
    //Delete
    public void deleteDesignation(Integer designationID){
        Designationtb dt = em.find(Designationtb.class, designationID);
        em.remove(dt);
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
