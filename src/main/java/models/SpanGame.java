package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Michael on 2/18/2016.
 */
public class SpanGame extends Game{
    public SpanGame(){
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        error = false;
    }

    public void buildDeck() {
        for(int i = 1; i < 11; i++){
            deck.add(new Card(i,Suit.Clubs));
            deck.add(new Card(i,Suit.Hearts));
            deck.add(new Card(i,Suit.Diamonds));
            deck.add(new Card(i,Suit.Spades));
        }
    }
}
