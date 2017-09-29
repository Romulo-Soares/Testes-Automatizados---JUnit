package com.ifpb.TestesDeSoftware.JUnit.Testes;

import com.ifpb.TestesDeSoftware.JUnit.Entidades.CifraDeCesar;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCifraDeCesar {

    private CifraDeCesar cc;

    public TestCifraDeCesar() {
        cc = new CifraDeCesar();
    }

    @Test
    public void CT01_criptografar() {
        assertEquals("UDIDHO JXLPDUDHV VDNXUDL", cc.criptografar("Rafael Guimaraes Sakurai", 3));
    }
    
    @Test
    public void CT01_descriptografar() {
        assertEquals("RAFAEL GUIMARAES SAKURAI", cc.descriptografar("UDIDHO JXLPDUDHV VDNXUDL", 3));
    }
    
    @Test
    public void CT02_criptografar() {
        assertEquals("AXVDUX", cc.criptografar("romulo", 9));
    }
    
    @Test
    public void CT02_descriptografar() {
        assertEquals("ROMULO", cc.descriptografar("AXVDUX", 9));
    }
}
