
package com.IFPB.JUnit.Entidades;

public class Aviao {
    
    private boolean ligado;
    private boolean voando;
    private int potencia;
    private int velocidade;
    
    public Aviao(){
    }
    
    public Aviao(int potencia) {
        this.ligado = false;
        this.voando = false;
        this.potencia = potencia;
        this.velocidade = 0;
    }
    
    public boolean ligar(){
        if(!isLigado()){
            return this.ligado = true;
        }
        return false;
    }

    public boolean desligar(){
        if(isLigado()){
            this.ligado = false;
            return true;
        }
        return false;
    }

    public boolean acelerar(){
        if(isLigado()){
            this.velocidade += 2;
            return true;
        }
        return false;
    }

    public boolean desacelerar(){
        if(this.velocidade >= 2){
            this.velocidade -= 2;
            return true;
        }
        return false;
    }

    public boolean voar(){
        if(isLigado() && getVelocidade() > 0){
            return this.voando = true;
        }
        return false;
    }

    public boolean pousar(){
        if(isVoando()){
            this.voando = false;
            this.velocidade = 0;
            return true;
        }
        return false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isVoando() {
        return voando;
    }

    public void setVoando(boolean voando) {
        this.voando = voando;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Aviao{" + "ligado=" + ligado + ", voando=" + voando + 
                ", potencia=" + potencia + ", velocidade=" + velocidade + '}';
    }
    
}
