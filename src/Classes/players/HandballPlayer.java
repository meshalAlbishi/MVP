package Classes.players;

import static Classes.sports.Handball.*;
/**
 *
 * @author MESHAL
 */
public class HandballPlayer extends Player {

    private int goalsMade;
    private int goalsReceived;

    public HandballPlayer(String name, String nickname, int number, String teamName, String position, int goalsMade, int goalsReceived) {
        super(name, nickname, number, teamName, position);
        this.goalsMade = goalsMade;
        this.goalsReceived = goalsReceived;
        calcValue();
    }

    public int getGoalsMade() {
        return goalsMade;
    }

    public void setGoalsMade(int goalsMade) {
        this.goalsMade = goalsMade;
    }

    public int getGoalsReceived() {
        return goalsReceived;
    }

    public void setGoalsReceived(int goalsReceived) {
        this.goalsReceived = goalsReceived;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHandballPlayer{" + "goalsMade=" + goalsMade + ", goalsReceived=" + goalsReceived + '}'
                + "\nThe MVP = " + getValue();
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
            }
    }
     
    @Override
    public int calulateMVP(int index) {
       return (scores[index][0]) + (this.goalsMade * scores[index][1]) - (this.goalsReceived * scores[index][2]);
    }

   

}
