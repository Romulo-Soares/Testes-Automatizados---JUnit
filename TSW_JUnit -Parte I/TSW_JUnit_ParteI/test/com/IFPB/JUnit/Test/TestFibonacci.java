package com.IFPB.JUnit.Test;

import com.IFPB.JUnit.Entidades.Fibonacci;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestFibonacci {

    public TestFibonacci() {
    }

    @Test
    public void CT01() {
        assertEquals(8, Fibonacci.n_esimoTermo(6));
    }
    
    @Test
    public void CT02() {
        assertEquals(55, Fibonacci.n_esimoTermo(10));
    }
    
    @Test
    public void CT03() {
        assertEquals(89, Fibonacci.n_esimoTermo(11));
    }
}
