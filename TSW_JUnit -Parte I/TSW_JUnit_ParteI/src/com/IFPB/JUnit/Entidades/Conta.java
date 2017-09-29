
package com.IFPB.JUnit.Entidades;

public class Conta {
    
    private int numero;
    private String titular;
    private double saldo;
    private double limiteCredito;

    public Conta(){
    }    
    
    public Conta(int numero, String titular, double saldo, double limiteCredito) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteCredito = limiteCredito;
    }
    
    public boolean sacar(double valor){
        if((this.saldo > valor) && valor > 0){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    
    public boolean depositar(double valor){
        if(valor >= 2){
            this.saldo += valor;
            return true;
        }
        return false;
    }
    
    public boolean transferir(Conta conta, double valor){
        if(valor > 0){
            this.saldo -= valor;
            conta.saldo += valor;
            return true;
        }
        return false;
    }
    
    public boolean comprarNoCredito(double valor){
        if(this.limiteCredito >= valor){
            this.limiteCredito -= valor;
            return true;
        }
        return false;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + ", limiteCredito=" + limiteCredito + '}';
    }
    
    
}
