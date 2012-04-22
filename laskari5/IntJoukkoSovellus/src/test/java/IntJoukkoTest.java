/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import ohtu.intjoukkosovellus.IntJoukko;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author mkoski
 */
public class IntJoukkoTest {
    
    IntJoukko joukko;
    public IntJoukkoTest() {
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        joukko = new IntJoukko();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void lisaaLukuTest() {

        boolean onvai = joukko.lisaa(5);
        assertEquals(true, onvai);
    }
    
    @Test
    public void kuuluuTest() {
        boolean kuuluu = joukko.kuuluu(3);
        assertEquals(false, kuuluu);
    }
    
    @Test
    public void poistaTest() {
        boolean poista = joukko.poista(2);
        assertEquals(false, poista);
    }
    
    @Test
    public void onkoJoTest() {
        int [] taulu = new int[2];
        taulu[0] = 1;
        taulu[1] = 2;
        boolean onko = joukko.onkoJo(1, taulu);
        assertEquals(true, onko);
    }
}
