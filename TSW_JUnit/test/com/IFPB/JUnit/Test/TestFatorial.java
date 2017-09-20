package com.IFPB.JUnit.Test;

import com.IFPB.JUnit.Entidades.Fatorial;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestFatorial {
    
    public TestFatorial() {
    }
    
    @Test
    public void CT01(){
        assertEquals(120, Fatorial.calculaFatorial(5));   
    }
    
    @Test
    public void CT02(){
        assertEquals(3628800, Fatorial.calculaFatorial(10));   
    }
    
    @Test
    public void CT03(){
        assertEquals(2432902008176640000L, Fatorial.calculaFatorial(20));   
    }
    
}
