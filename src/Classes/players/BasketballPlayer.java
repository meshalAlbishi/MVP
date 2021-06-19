package Classes.players;

import static Classes.sports.Basketball.*;

/**
 *
 * @author MESHAL
 */
public class BasketballPlayer extends Player {

    private int scoredPoints;
    private int rebounds;
    private int assists;

    public BasketballPlayer(String name, String nickname, int number, String teamName, String position, int scoredPoints, int rebounds, int assists) {
        super(name, nickname, number, teamName, position);
        this.scoredPoints = scoredPoints;
        this.rebounds = rebounds;
        this.assists = assists;
        calcValue();
    }

    public int getScoredPoints() {
        return scoredPoints;
    }

    public void setScoredPoints(int scoredPoints) {
        this.scoredPoints = scoredPoints;
    }

    public int getRebounds() {
        return rebounds;
    }

    public void setRebounds(int rebounds) {
        this.rebounds = rebounds;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    private void calcValue() {
        switch (this.getPosition()) {
            case "G":
                this.setValue(calulateMVP(0));
                break;
            // ---------------
            case "F":
                this.setValue(calulateMVP(1));
                break;
            // ---------------
            case "C":
                this.setValue(calulateMVP(2));
                break;
            // ---------------
            }
    }

    @Override
    public int calulateMVP(int index) {
        return (scores[index][0] * this.scoredPoints) + (scores[index][1] * this.rebounds) + (scores[index][0] * this.assists);
    }

    @Override
    public String toString() {
        return super.toString() + "\nBasketballPlayer{" + "scoredPoints=" + scoredPoints + ", rebounds=" + rebounds + ", assists=" + assists + ", value=" + getValue() + '}'
                + "\nThe MVP = " + getValue();
    }

}
