package com.codetest;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTheMortageTest {
    @Test
     public void testingTheMath(){
        CalculateTheMortage math =new CalculateTheMortage();
        assertEquals(1687.7152099609375f, math.e(200000f,0.005f,2.45409f),0.0002);
    }

}