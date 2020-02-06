package edu.elsmancs.bowling;

public class ScoreCard {
    private String scoreCard = "";

    ScoreCard(String scoreCard) {
        this.scoreCard = scoreCard;
    }

    public String getScoreCard() {
        return scoreCard;
    }

    public String calculateScore() {
        Integer score = 0;
        for (int i = 0; i<( scoreCard.length() ); i++){
            char pin = scoreCard.charAt(i);
            if(pin == '-') {
                pin = '0'; }
            if(pin == '/') {
                 }
            score += Character.getNumericValue(pin);
        }

        return score.toString();
    }
}
