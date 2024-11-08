package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class AppTest {

    @Test
    public void testsumwithPositives() {
        App app=new App();
        int actual=app.sum(100, 200);
        int expected =300;
        assertEquals(expected, actual);
    }
    @Test
    public void testsumwithnegatives() {
        App app=new App();
        int actual=app.sum(-100, -200);
        int expected =-300;
        assertEquals(expected, actual);
    }
    @Test
    public void testsumwithboth() {
        App app=new App();
        int actual=app.sum(-100, 200);
        int expected =100;
        assertEquals(expected, actual);
    }
    @Test
    public void testsumwithzero() {
        App app=new App();
        int actual=app.sum(0, 0);
        int expected =0;
        assertEquals(expected, actual);
    }
}
