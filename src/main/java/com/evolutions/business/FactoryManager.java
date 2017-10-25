/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evolutions.business;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Dark Flowers
 */
public abstract class FactoryManager {
    
    private static final String PERSISTENCE_UNIT_NAME="Persistence";
    
    public static EntityManagerFactory getEntityManagerFactory(){
    
        return Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        
    }
    
}
