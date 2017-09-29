/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.TestesDeSoftware.JUnit.Testes;

import com.ifpb.TestesDeSoftware.JUnit.Entidades.Chassi;
import com.ifpb.TestesDeSoftware.JUnit.Entidades.VerificaCPF;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author romulo
 */
public class TestChassi {

    public TestChassi() {
    }

    @Test
    public void CT01_retornaAno() {
        assertEquals("2010", Chassi.retornAno("9BP17164GA0000001"));
    }
    
    @Test
    public void CT02_retornaAno() {
        assertEquals("2011", Chassi.retornAno("9BP17164GB0000001"));
    }
    
    @Test
    public void CT03_retornaAno() {
        assertEquals("2012", Chassi.retornAno("9BP17164GC0000001"));
    }
    
    @Test
    public void CT04_retornaAno() {
        assertEquals("Inválido", Chassi.retornAno("9BP17164GA000000"));
    }
    
    @Test
    public void CT05_retornaAno() {
        assertEquals("Inválido", Chassi.retornAno("9BP17164Ga000000"));
    }
}
