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

}
