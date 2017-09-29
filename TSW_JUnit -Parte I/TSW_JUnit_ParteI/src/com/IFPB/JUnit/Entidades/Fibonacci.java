package com.IFPB.JUnit.Entidades;

public class Fibonacci {

    public Fibonacci() {
    }

    public static int n_esimoTermo(int n) {
        if (n == 0 || n == 1) return n;
        else return n_esimoTermo(n - 1) + n_esimoTermo(n - 2);
    }

}
