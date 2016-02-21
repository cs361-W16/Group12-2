package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mtruong080894
 */

public class testScore {

    @Test
    public void createBoard(){
        NewScore b = new NewScore();
        assertNotNull(b);
        b = new NewScore(14);
        assertNotNull(14)
    } /* Test for board creation, should work */

    @Test
    public void testScoreAdd(){
        NewScore b = new NewScore();
        assertTrue(b.getScore() == 0);
        b.addPoint();
        assertTrue(b.getScore() == 14);


    }






}