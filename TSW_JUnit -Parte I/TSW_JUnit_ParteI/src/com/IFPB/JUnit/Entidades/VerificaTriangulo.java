package com.IFPB.JUnit.Entidades;

public class VerificaTriangulo {

    public VerificaTriangulo() {
    }

    public String verificaTriangulo(double lado1, double lado2, double lado3) {
        if (isTriangle(lado1, lado2, lado3)) {
            if (lado1 == lado2 && lado1 == lado3) {
                return "Equilátero";
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                return "Isósceles";
            }
            return "Escaleno";
        }
        return "Não é um triângulo válido";
    }

    public boolean isTriangle(double lado1, double lado2, double lado3) {
        return ((lado1 + lado2) > lado3) && ((lado1 + lado3) > lado2)
                && ((lado2 + lado3) > lado1);
    }

}
