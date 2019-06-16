package com.sda.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Zadanie2Test {


    @Test
    public void getHelloWorld() {
        Zadanie2 zadanie2 = new Zadanie2();
        String returned = zadanie2.getHelloWorld();
        String expected = "Hello World";
        assertEquals(expected, returned);
    }

}