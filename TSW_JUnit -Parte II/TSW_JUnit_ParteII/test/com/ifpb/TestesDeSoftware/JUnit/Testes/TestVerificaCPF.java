
package com.ifpb.TestesDeSoftware.JUnit.Testes;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ifpb.TestesDeSoftware.JUnit.Entidades.VerificaCPF;

public class TestVerificaCPF {
    
    public TestVerificaCPF() {
    }
    
    @Test
    public void CT01_verificaCPF(){
        assertEquals(true, VerificaCPF.isCPF("11340986426"));
    }
    
    @Test
    public void CT02_verificaCPF(){
        assertEquals(false, VerificaCPF.isCPF("11111111111"));
    }
    
    @Test
    public void CT03_verificaCPF(){
        assertEquals(false, VerificaCPF.isCPF("00000000000"));
    }
    
    @Test
    public void CT04_verificaCPF(){
        assertEquals(false, VerificaCPF.isCPF("99999999999"));
    }
    
    @Test
    public void CT05_verificaCPF(){
        assertEquals(true, VerificaCPF.isCPF("12080230476"));
    }
    
}
