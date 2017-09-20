
package com.IFPB.JUnit.Test;

import com.IFPB.JUnit.Entidades.Conta;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestConta {
    
    public TestConta() {
    }
    
    Conta romulo = new Conta(0, "Rômulo", 800000, 1000000);
    Conta maria = new Conta(0, "Maria", 50000, 100000);
    
    @Test
    public void CT01_sacar(){
        assertEquals(true, romulo.sacar(100000));
        assertEquals(700000, romulo.getSaldo(), 0.01);    
    }
    
    @Test
    public void CT02_sacar(){
        assertEquals(false, romulo.sacar(800000));
        assertEquals(800000, romulo.getSaldo(), 0.01);
    }
    
    @Test
    public void CT03_sacar(){
        assertEquals(false, romulo.sacar(-2));
        assertEquals(800000, romulo.getSaldo(), 0.01);
    }
    
    @Test
    public void CT04_sacar(){
        assertEquals(true, romulo.sacar(33));
        assertEquals(799967, romulo.getSaldo(), 0.01);
    }
    
    @Test
    public void CT05_sacar(){
        assertEquals(true, romulo.sacar(33.5));
        assertEquals(799966.5, romulo.getSaldo(), 0.01);
    }
    
    @Test
    public void CT01_depositar(){
        assertEquals(false, romulo.depositar(1));
        assertEquals(800000, romulo.getSaldo(), 0.01);
    }
    
    @Test
    public void CT02_depositar(){
        assertEquals(true, romulo.depositar(2));
        assertEquals(800002, romulo.getSaldo(), 0.01);
    }
    
    @Test
    public void CT03_depositar(){
        assertEquals(true, romulo.depositar(3.5));
        assertEquals(800003.5, romulo.getSaldo(), 0.01);
    }
    
    @Test
    public void CT01_transferir(){
        assertEquals(true, romulo.transferir(maria, 10000));
        assertEquals(60000, maria.getSaldo(), 0.01);
    }
    
    @Test
    public void CT02_transferir(){
        assertEquals(false, romulo.transferir(maria, -10000));
        assertEquals(50000, maria.getSaldo(), 0.01);
    }
    
    @Test
    public void CT03_transferir(){
        assertEquals(true, romulo.transferir(maria, 10000.5));
        assertEquals(60000.5, maria.getSaldo(), 0.01);
    }
    
    @Test
    public void CT01_comprarNoCredito(){
        assertEquals(true, romulo.comprarNoCredito(500000));
        assertEquals(500000, romulo.getLimiteCredito(), 0.01);
    }
    
    @Test
    public void CT02_comprarNoCredito(){
        assertEquals(true, romulo.comprarNoCredito(1000000));
        assertEquals(0, romulo.getLimiteCredito(), 0.01);
    }
    
    @Test
    public void CT03_comprarNoCredito(){
        assertEquals(false, romulo.comprarNoCredito(100000000));
        assertEquals(1000000, romulo.getLimiteCredito(), 0.01);
    }
   
}