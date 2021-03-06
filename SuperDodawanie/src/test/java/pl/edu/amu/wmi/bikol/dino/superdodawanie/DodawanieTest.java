/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.bikol.dino.superdodawanie;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bikol
 */
public class DodawanieTest {
    
    public DodawanieTest() {
    }

   
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of dodaj method, of class Dodawanie.
     */
    @Test
    public void testDodaj1() {
        System.out.println("dodaj");
        String a = "1";
        String b = "1";
        Dodawanie instance = new Dodawanie();
        String expResult = "2.0";
        String result = instance.dodaj(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testDodaj2() {
        System.out.println("dodaj");
        String a = "0";
        String b = "0";
        Dodawanie instance = new Dodawanie();
        String expResult = "0.0";
        String result = instance.dodaj(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDodaj3() {
        System.out.println("dodaj");
        String a = "1.5";
        String b = "0";
        Dodawanie instance = new Dodawanie();
        String expResult = "1.5";
        String result = instance.dodaj(a, b);
        assertEquals(expResult, result);
    }
    
}
