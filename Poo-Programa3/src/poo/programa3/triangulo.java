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
public class triangulo {
    int base;
    int altura;

    public triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }
    
    public void setear(int base, int altura){
        this.base=base;
        this.altura=altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public double area(int base, int altura){
        return (base*altura)/2;
    }
    
    public void graficar (Graphics C1, triangulo tri, int x, int y){
        int x1 []={x, x-(tri.getBase()/2)*3,x+(tri.getBase()/2)*3};
        int y1 []={y, y+(tri.getAltura())*3, y+(tri.getAltura())*3};
        C1.setColor(Color.ORANGE);
        C1.fillPolygon(x1, y1, 3);
    }
            
}
