
package com.ifpb.TestesDeSoftware.JUnit.Entidades;

public class CifraDeCesar {
    
    private String alfabeto;
    
    public CifraDeCesar(){
        this.alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 
    }
    
    public String criptografar(String palavra, int n){
        String criptografada = "";
        int tam = palavra.length()-1;
        
        for(int i = 0; i<= tam; i++){
            char caracter = palavra.toUpperCase().charAt(i);
            
            if(alfabeto.indexOf(caracter) != -1){
                int posicao = alfabeto.indexOf(caracter);
                if(posicao+n>25){
                    int resto = 26-posicao;
                    int aux = n-resto; 
                    criptografada += alfabeto.charAt(aux);
                }else{
                    criptografada += alfabeto.charAt(posicao+n);
                } 
            }else criptografada += caracter;
        }
        return criptografada; 
    }
    
    public String descriptografar(String palavra, int n){
        String descriptografada = "";
        int tam = palavra.length()-1;
        
        for(int i = 0; i<= tam; i++){
            char caracter = palavra.toUpperCase().charAt(i);
            
            if(alfabeto.indexOf(caracter) != -1){
                int posicao = alfabeto.indexOf(caracter);
                if(posicao-n<0){
                    if(posicao>n){
                        descriptografada += alfabeto.charAt(((n-posicao)*-1));
                    }else{
                        int resto = n-posicao;
                        int aux = 26-resto;
                        descriptografada += alfabeto.charAt(aux);
                    }
                }else{
                    descriptografada += alfabeto.charAt(posicao-n);
                } 
            }else descriptografada += caracter;
        }
        return descriptografada; 
    }
    
}
