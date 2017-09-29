
package com.IFPB.JUnit.Test;

import com.IFPB.JUnit.Entidades.Aviao;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestAviao {
    
    public TestAviao() {
    }
    
    Aviao aviao = new Aviao(20);
    
    @Test
    public void CT01_ligar(){
        assertEquals(true, aviao.ligar());
        assertEquals(true, aviao.isLigado());    
    }
    
    @Test
    public void CT02_ligar(){
        aviao.setLigado(true);
        assertEquals(false, aviao.ligar());
        assertEquals(true, aviao.isLigado());    
    }
    
    @Test
    public void CT01_desligar(){
        aviao.setLigado(true);
        assertEquals(true, aviao.desligar());
        assertEquals(false, aviao.isLigado());    
    }
    
    @Test
    public void CT02_desligar(){
        assertEquals(false, aviao.desligar());
        assertEquals(false, aviao.isLigado());    
    }
    
    @Test
    public void CT01_acelerar(){
        aviao.setLigado(true);
        assertEquals(true, aviao.acelerar());
        assertEquals(2, aviao.getVelocidade());    
    }
    
    @Test
    public void CT02_acelerar(){
        assertEquals(false, aviao.acelerar());
        assertEquals(0, aviao.getVelocidade());    
    }
    
    @Test
    public void CT01_desacelerar(){
        aviao.setVelocidade(2);
        assertEquals(true, aviao.desacelerar());
        assertEquals(0, aviao.getVelocidade());    
    }
    
    @Test
    public void CT02_desacelerar(){
        assertEquals(false, aviao.desacelerar());
        assertEquals(0, aviao.getVelocidade());    
    }
    
    @Test
    public void CT01_voar(){
        assertEquals(false, aviao.voar());
        assertEquals(0, aviao.getVelocidade());
        assertEquals(false, aviao.isLigado());
    }
    
    @Test
    public void CT02_voar(){
        aviao.setLigado(true);
        aviao.setVelocidade(2);
        assertEquals(true, aviao.voar());
        assertEquals(2, aviao.getVelocidade());
        assertEquals(true, aviao.isLigado());
    }
    
    @Test
    public void CT01_pousar(){
        aviao.setVoando(true);
        assertEquals(true, aviao.pousar());
        assertEquals(0, aviao.getVelocidade());
        assertEquals(false, aviao.isVoando());
    }
    
    @Test
    public void CT02_pousar(){
        assertEquals(false, aviao.pousar());
        assertEquals(false, aviao.isVoando());
    }
    
    
}
