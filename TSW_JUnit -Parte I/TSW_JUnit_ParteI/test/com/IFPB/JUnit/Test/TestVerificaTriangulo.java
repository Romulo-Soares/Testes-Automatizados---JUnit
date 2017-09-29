package com.IFPB.JUnit.Test;

import com.IFPB.JUnit.Entidades.VerificaTriangulo;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestVerificaTriangulo {

    VerificaTriangulo vrfTriangle = new VerificaTriangulo();

    @Test
    public void CT01_isTriangle() {
        assertEquals(true, vrfTriangle.isTriangle(5, 6, 10));
    }
    
    @Test
    public void CT02_isTriangle() {
        assertEquals(false, vrfTriangle.isTriangle(5, 6, 20));
    }
    
    @Test
    public void CT01_verificaTriangulo() {
        assertEquals("Não é um triângulo válido", vrfTriangle.verificaTriangulo(5, 6, 20));
    }
    
    @Test
    public void CT02_verificaTriangulo() {
        assertEquals("Equilátero", vrfTriangle.verificaTriangulo(6, 6, 6));
    }
    
    @Test
    public void CT03_verificaTriangulo() {
        assertEquals("Isósceles", vrfTriangle.verificaTriangulo(6, 6, 10));
    }
    
    @Test
    public void CT04_verificaTriangulo() {
        assertEquals("Isósceles", vrfTriangle.verificaTriangulo(6, 10, 6));
    }
    
    @Test
    public void CT05_verificaTriangulo() {
        assertEquals("Isósceles", vrfTriangle.verificaTriangulo(10, 6, 6));
    }
    
    @Test
    public void CT06_verificaTriangulo() {
        assertEquals("Escaleno", vrfTriangle.verificaTriangulo(6, 7, 8));
    }
    
}
