package com.company;

import org.junit.Ignore;

import static org.junit.Assert.*;
/**
 * Created by cof on 2016-05-11.
 */
public class CcTest {
    @org.junit.Test
    public void testRebecka() throws Exception {
        String s = "Rebecka";
        String testResult = Cc.aTillZ(s);
        assertEquals("Uhehfnd", testResult);
    }
    @org.junit.Test
    public void testJohan() throws Exception {
        String s = "Johan";
        String testResult = Cc.aTillZ(s);
        assertEquals("Mrkdq", testResult);
    }
    @org.junit.Test
    public void testMurri() throws Exception {
        String s = "Murri och Glimmis! 123567?\n    Murri&Glimmis";
        String testResult = Cc.aTillZ(s);
        assertEquals("Pxuul rfk Jolpplv! 123567?\n" +
                "    Pxuul&Jolpplv", testResult);
    }
    @org.junit.Test
    public void testRebex() throws Exception {
        String s = "Rebex";
        String testResult = Cc.aTillZ(s);
        assertEquals("Uheha", testResult);
    }
    @org.junit.Test
    public void testXyz() throws Exception {
        String s = "XYZ";
        String testResult = Cc.aTillZ(s);
        assertEquals("ABC", testResult);
    }
    @org.junit.Test
    public void testBigAbcd() throws Exception {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String testResult = Cc.aTillZ(s);
        assertEquals("DEFGHIJKLMNOPQRSTUVWXYZABC", testResult);
    }
    @org.junit.Test
    public void testSmallAbcd() throws Exception {
        String s = "abcdefghijklmnopqrstuvwxyz";
        String testResult = Cc.aTillZ(s);
        assertEquals("defghijklmnopqrstuvwxyzabc", testResult);
    }
    @org.junit.Test
    @Ignore
    public void testÅÄÖ() throws  Exception {
        String s = "ÅÄÖåäö";
        String testResult = Cc.aTillZ(s);
        assertEquals("ABCabc", testResult);
    }
}