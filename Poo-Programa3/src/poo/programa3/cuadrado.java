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
public class cuadrado {
    int lado;

    public cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public void graficar (Graphics C1,cuadrado cu, int x, int y){
        C1.setColor(Color.LIGHT_GRAY);
        C1.fillRect(x, y, cu.getLado()*2, cu.getLado()*2);
    }
    
    public double area(cuadrado cu){
        return cu.getLado()*cu.getLado();
    }
}
