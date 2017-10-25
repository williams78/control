/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evolutions.business;

import com.evolutions.maping.Login;
import javax.ejb.Local;

/**
 *
 * @author udeveloper
 */
@Local
public interface ILogin {
    public boolean authenticate(Login obj) throws Exception; 
    
}
