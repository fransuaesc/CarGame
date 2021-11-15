/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicalibre;

import java.util.logging.Level;
import java.util.logging.Logger;

//constructor especial para el coche que podemos manejar
public class Car extends Thread {
    private javax.swing.JLabel jLabel1=null;
    private int sleep=8;
     public Car (String str){
        super(str);
    } 
     //constructor de los demas coches
     public Car (String str, javax.swing.JLabel jLabel){
        super(str);
        this.jLabel1= jLabel;
    } 
 
     public void run(){
         int sw = Integer.parseInt(getName());
         //switch para elegír que for recorre cada coche,  los for realizan el movimiento de las imagenes
         switch(sw){
             case 1:
                for (int i = 0; i < 1000; i++) {   
                    //funcion para mover las imagenes
                    this.jLabel1.setLocation((i),5);
                    try {
                        Car.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
                    }
             
                }       
                NewJFrame.fin2(1,2,3,4);
                break;
             case 2:
                 
                 for (int i = 0; i < 1000; i++) {
                    this.jLabel1.setLocation((i),160);
                    try {
                        //el sleep de este coche va cambiando segun el usuario realice los cambios, irá mas rapido si lo hace bien o mas lento
                        Car.sleep(this.sleep);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
                    }
             
                }
                 NewJFrame.fin1();
                break;
                case 3:
                for (int i = 0; i < 1000; i++) {             
                    this.jLabel1.setLocation((i),40);
                    try {
                        Car.sleep(11);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
                    }
             
                }       
                NewJFrame.fin2(0,2,3,4);
                break;
                case 4:
                for (int i = 0; i < 1000; i++) {             
                    this.jLabel1.setLocation((i),80);
                    try {
                        Car.sleep(9);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
                    }
             
                }       
                NewJFrame.fin2(0,1,3,4);
                break;
                case 5:
                for (int i = 0; i < 1000; i++) {             
                    this.jLabel1.setLocation((i),120);
                    try {
                        Car.sleep(7);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
                    }
             
                }       
                NewJFrame.fin2(0,1,2,3);
                break;
         }
         
     }
     //funcion para setear el tiempo de sleep del coche del usuario
    public void setSleep(int s){
        this.sleep = s;
    }
    
}
