package com.ifpb.TestesDeSoftware.JUnit.Entidades;

public class Chassi {

    public static String retornAno(String chassi) {
        if (chassi.length() != 17) {
            return "Inválido";
        } else if(!chassi.toUpperCase().equals(chassi)){
            return "Inválido";
        }else {
            switch (chassi.charAt(9)) {
                case 'A':
                    return "2010";
                case 'B':
                    return "2011";
                default:
                    return "2012";
            }
        }
    }

}
