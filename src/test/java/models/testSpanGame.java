package models;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Michael on 2/18/2016.
 */
public class testSpanGame {
    @Test
    public void testSpanGameBuildDeck(){
        SpanGame g = new SpanGame();
        g.buildDeck();
        assertEquals(40,g.deck.size());
    }

    @Test
    public void testSpanGameCreation(){
        SpanGame g = new SpanGame();
        assertNotNull(g);
    }

    @Test
    public void testSpanGameInit(){
        SpanGame g = new SpanGame();
        g.buildDeck();
        g.shuffle();
        assertEquals(40,g.deck.size());
        assertNotEquals(2,g.deck.get(0).getValue());
    }

    @Test
    public void testSpanGameRemove(){
        Game g = new Game();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        g.remove(2);
        assertEquals(0,g.cols.get(2).size());
    }
}
