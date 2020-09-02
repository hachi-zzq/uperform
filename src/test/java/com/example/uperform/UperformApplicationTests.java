package com.example.uperform;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@SpringBootTest
class UperformApplicationTests {

    @Test
    public void testDivideByThree(){
        assertFalse(Calculator.divideByThree(1));
        assertTrue(Calculator.divideByThree(3));
    }

    @Test
    public void testDivideByFive(){
        assertFalse(Calculator.divideByFive(1));
        assertTrue(Calculator.divideByFive(5));
    }

    @Test
    public void testStringContain(){
        assertFalse(Calculator.containNumber("1","2"));
        assertTrue(Calculator.containNumber("100","1"));
    }
}
