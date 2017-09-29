
package com.IFPB.JUnit.Entidades;

public class Cubo {
    
    public Cubo(){
    }
    
    public static double areaDeUmLado(double a){
        return a*a;
    }
    
    public static double areaLateral(double a){
        return 4 * a*a;
    }
    
    public static double areaTotal(double a){
        return 6 * a*a;
    }
    
    public static double volume(double a){
        return a*a*a;
    }
    
}
