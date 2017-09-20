
package com.IFPB.JUnit.Test;

import com.IFPB.JUnit.Entidades.Cubo;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCubo {
    
    public TestCubo() {
    }
    
    @Test
    public void CT01_areaDeUmLado(){
        assertEquals(4, Cubo.areaDeUmLado(2), 0.01);
    }
    
    @Test
    public void CT02_areaDeUmLado(){
        assertEquals(13.86370756, Cubo.areaDeUmLado(3.7234), 0.01);
    }
    
    @Test
    public void CT01_areaLateral(){
        assertEquals(55.45483024, Cubo.areaLateral(3.7234), 0.01);
    }
    
    @Test
    public void CT02_areaLateral(){
        assertEquals(16, Cubo.areaLateral(2), 0.01);
    }
    
    @Test
    public void CT01_areaTotal(){
        assertEquals(24, Cubo.areaTotal(2), 0.01);
    }
    
    @Test
    public void CT02_areaTotal(){
        assertEquals(83.18224536, Cubo.areaTotal(3.7234), 0.01);
    }
    
    @Test
    public void CT01_volume(){
        assertEquals(8, Cubo.volume(2), 0.01);
    }
    
    @Test
    public void CT02_volume(){
        assertEquals(51.620128728904, Cubo.volume(3.7234), 0.01);
    }
    
}
