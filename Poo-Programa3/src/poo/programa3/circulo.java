/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.programa3;

import java.awt.*;
/**
 *
 * @author User
 */
public class circulo {
    
    int radio;

    public circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    public void graficar(Graphics C1, circulo c1, int x, int y){
        C1.setColor(Color.red);
        C1.fillOval(x, y, c1.getRadio()*4, c1.getRadio()*4);
    }
    
    public double area(circulo c1){
        return 3.1416*c1.getRadio()*c1.getRadio();
    }
    
}
