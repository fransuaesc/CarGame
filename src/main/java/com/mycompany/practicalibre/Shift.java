/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicalibre;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author alumno
 */
public class Shift extends Thread{
    private javax.swing.JProgressBar jProgressBar1 =null;
    private int sw=1;
    private int i=0;
    private Car car2;
    private int dificultad=0;
    
     public Shift (String str){
        super(str);
    } 
     public Shift (String str,javax.swing.JProgressBar jProgressBar1, Car car2,int dificultad){
        super(str);
        this.jProgressBar1 = jProgressBar1;
        this.car2=car2;
        this.dificultad= dificultad;
    } 
     
     public void run(){         
         //for para rellenar la barra de progreso
         for (this.i = 0; this.i < 120; this.i++) { 
             //if que determina el color del texto de dentro de la barra
             if(this.i>85){
                 jProgressBar1.setForeground(Color.red);
             }else if(this.i<80){
                 jProgressBar1.setForeground(Color.black);
             }else {
                 jProgressBar1.setForeground(Color.green);
             }
             try {
                 //este parametro determina la velocidad a la que se rellena la barra
                 Shift.sleep(dificultad);
             } catch (InterruptedException ex) {
                 Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
             }
             //valor que determina el relleno de la barra de progreso
             jProgressBar1.setValue(this.i+1);
             //texto de dentro de la barra
             jProgressBar1.setString(this.i+"%");
             
         }
              car2.stop();
             
     }
     //funcion para determinar en que momento ha pulsado el usuario la tecla de cambio, si la pulsa mal será penalizado y si lo hace bien se beneficiará
     public void ShiftUp(){
         if(this.i>85){
                 car2.setSleep(18);
             }else if(this.i<80){
                 car2.setSleep(15);
             }else {
                 car2.setSleep(6);
             }
         
         this.i=0;
         
     }
}
