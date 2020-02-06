package edu.elsmancs.bowling;

import static org.junit.Assert.*;

import org.junit.Test;

public class testScoreCard {

    @Test
    public void testCetScoreCard(){
        ScoreCard card = new ScoreCard("12345123451234512345");
        assertEquals(card.getScoreCard(), "12345123451234512345");
    }

    @Test
    public void testCalculateScore(){
        ScoreCard card = new ScoreCard("12345123451234512345");
        assertEquals(card.calculateScore(), "60");
    }

    @Test
    public void testCalculateScoreWithNonScore(){
        ScoreCard card = new ScoreCard("9-9-9-9-9-9-9-9-9-9-");
        assertEquals(card.calculateScore(), "90");
    }

    @Test
    public void testCalculateScoreWithSpare(){
        ScoreCard card = new ScoreCard("5/5/5/5/5/5/5/5/5/5/5");
        assertEquals(card.calculateScore(), "150");
    }
}

