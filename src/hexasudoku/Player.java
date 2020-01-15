/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hexasudoku;

/**
 *
 * @author elise
 */

import java.io.Serializable;


public class Player implements Serializable {

    public String name;
    public String pass;
    
    public Player(String name, String pass){
        this.name=name;
        this.pass=pass;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPass(){
        return pass;
    }
}
