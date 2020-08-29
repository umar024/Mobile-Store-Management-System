/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfinalproject;

/**
 *
 * @author intag pc
 */
public class admin {
    String name;
    String password;
    
    admin(){
        name = "admin";
        password = "admin";
    }
    admin(String n, String p){
        this.name = n;
        this.password = p;
    }
    
    
    int check = 0;
    public int checkAdminLogin(String n, String p){
        if(name.equals(n) && password.equals(p)){
        check = 1;
    }
        else{
            check = 0;
        }
        
        
        return check;
    }
}
