/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package EJBPackage;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Foram
 */
@Stateless
public class ProjectEJB {
    
    @PersistenceContext(unitName = "my_persistence_unit")
    EntityManager em;
    
    
    //Hello
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
