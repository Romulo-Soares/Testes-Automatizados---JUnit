package com.IFPB.JUnit.Entidades;

public class Fatorial {

    public Fatorial() {  
    }

    public static long calculaFatorial(int num) {
        if (num <= 1) return 1;
        else return calculaFatorial(num - 1) * num;
    }
    
}
