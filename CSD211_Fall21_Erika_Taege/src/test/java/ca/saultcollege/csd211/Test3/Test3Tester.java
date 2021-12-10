/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.saultcollege.csd211.Test3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jaequella
 */
public class Test3Tester {

    public Test3Tester() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testForEqual() {
        Book b1 = new Book("JJBA6", "Erika Taege", "45212522", "06/07/21");
        Book b2 = new Book("JJBA6", "Erika Taege", "45212522", "06/07/21");
        assertEquals(b1, b2);
    }

    @Test
    public void testForDifferent() {
        Book b1 = new Book("JJBA6", "Erika Taege", "45212522", "06/07/21");
        Book b2 = new Book("JJBA6", "Erika Taege", "45212528", "06/07/21");
        assertNotEquals(b1, b2);
    }
}
