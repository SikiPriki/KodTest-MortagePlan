package com.codetest;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTheMortageTest {
    @Test
     public void testingTheMath(){
        CalculateTheMortage math =new CalculateTheMortage();
        assertEquals(87.741950f, math.e(2000.0f,0.004166667f,1.1049424f),0.0001);
    }

}