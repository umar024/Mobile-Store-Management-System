/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfinalproject;
//import javax.swing.*;

import javax.swing.JOptionPane;

/**
 *
 * @author intag pc
 */
public class Stock extends javax.swing.JFrame implements Interface {
    
    String serial [] = {"1.", "2.", "3.", "4.", "5.", "6.", "7.", "8."};
    String company [] = {"LG","Samsung", "Huawei","Q-Mobile", "", "", ""};
    String model [] = {"G2", "J5", "P8-LITE", "J7-PRO", "", "", ""};
    String ram [] = {"2GB", "3GB", "2GB", "2GB", "", "", ""};
    String rom [] = {"32GB", "64GB", "16GB", "16GB", "", "", ""};
    String price [] = {"16000", "30000", "15000", "17999", "0", "0", "0"};
    
    
    
    public void checklength(){
        
    }

public int searchmobile(String mob){
    int i = 0;
    if(model[0].equals(mob)){
        i = 0;
    }
    else if(model[1].equals(mob)){
        i = 1;
    }
    else if(model[2].equals(mob)){
        i = 2;
    }
    else if(model[3].equals(mob)){
        i = 3;
    }
    else if(model[4].equals(mob)){
        i = 4;
    }
    else if(model[5].equals(mob)){
        i = 5;
    }
    else if(model[6].equals(mob)){
        i = 6;
    }
        else{
         i = 10;
        }
    return i;
}

public int Deletemob(String mob){
    int i = 0;
    if(model[0].equals(mob)){
        i=0;
    }
    else if(model[1].equals(mob)){
        i=1;
    }
    else if(model[2].equals(mob)){
        i = 2;
    }
    else if(model[3].equals(mob)){
        i = 3;
    }
    else if(model[4].equals(mob)){
        i = 4;
    }
    else if(model[5].equals(mob)){
        i = 5;
    }
    else if(model[6].equals(mob)){
        i = 6;
    }
        else{
         i = 10;
        }
    return i;
}



public int Addmob(String c){
    int z = 0;
    for(int i=0; i<company.length; i++){
    if(company[i] == ""){
        z = i;
        break;
    }
}
    return z;
}
}