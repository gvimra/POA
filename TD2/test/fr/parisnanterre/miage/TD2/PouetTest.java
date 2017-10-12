package fr.parisnanterre.miage.TD2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PouetTest {

    private Pouet p;


    @Test
    public void testAdd() throws Exception {

        assertEquals(p.add(0, 0),0);

    }


}