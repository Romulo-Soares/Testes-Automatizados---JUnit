package com.ifpb.TestesDeSoftware.JUnit.Entidades;

public class VerificaCPF {

    public VerificaCPF() {

    }

    public static boolean checksFirstDigit(String cpf) {
        if (!vrfIgualdadeDigito(cpf)) {
            int digito, resto, decimo, soma = 0;

            for (int i = 10; i >= 2; i--) {
                digito = Integer.parseInt(String.valueOf(cpf.charAt(10 - i)));
                soma += digito * i;
            }
            resto = soma % 11;

            if (resto < 2) {
                if (cpf.charAt(9) == 0) {
                    return true;
                }
            }

            decimo = Integer.parseInt(String.valueOf(cpf.charAt(9)));
            return decimo == 11 - resto;
        }
        return false;

    }

    public static boolean checksSecondDigit(String cpf) {
        if (!vrfIgualdadeDigito(cpf)) {
            int digito, resto, decimo, soma = 0;

            for (int i = 11; i >= 2; i--) {
                digito = Integer.parseInt(String.valueOf(cpf.charAt(11 - i)));
                soma += digito * i;
            }
            resto = soma % 11;

            if (resto < 2) {
                if (cpf.charAt(10) == 0) {
                    return true;
                }
            }

            decimo = Integer.parseInt(String.valueOf(cpf.charAt(10)));
            return decimo == 11 - resto;
        }
        return false;
    }

    public static boolean vrfIgualdadeDigito(String cpf) {
        int igual = 0;
        for (int i = 0; i <= 9; i++) {
            for (int k = 0; k <= cpf.length()-1; k++) {
                if (Integer.parseInt(String.valueOf(cpf.charAt(k))) == i) {
                    igual++;
                }
            }
            if (igual == 11) {
                return true;
            }
            igual = 0;
        }
        return false;
    }

    public static boolean isCPF(String cpf) {
        return (checksFirstDigit(cpf) && checksSecondDigit(cpf));
    }

}
