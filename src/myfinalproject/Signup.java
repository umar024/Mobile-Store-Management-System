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
public class Signup {
 public  int count=1;
    String serial [] = {"1.", "2.", "3.", "4.", "5.", "6.", "7.", "", "", ""};
    String name [] = {"Muhammad Umar", "Muhammad Azan", "", "", "", "", "", "","",""};
    String username[]= {"Umar", "Azan", "", "",  "", "", "", "", "", ""};
    String email[] = {"umar024@gmail.com", "azan022@gmail.com", "", "", "", "", "", "", "", ""};
    String password []= {"umar", "azan", "", "", "", "", "", "", "", ""};
    
  
 
 public int checksellogin(String n, String p){
        int check =0;
        for(int i=0; i<name.length; i++){
        if(username[i].equals(n) && password[i].equals(p)){
         check = 1;
         break;
        }    
        }
       return check;
    }
 
 public int Deluser(String n){
     int check = 0;
     if(username[0].equals(n)){
         check = 0;
     }
     else if(username[1].equals(n)){
         check = 1;
     }
     else if(username[2].equals(n)){
         check = 2;
     }
     else if(username[3].equals(n)){
         check = 3;
     }
     else if(username[4].equals(n)){
         check = 4;
     }
     
     return check; }
 
 
 
}