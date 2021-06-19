package Classes.teams;

import Classes.players.HandballPlayer;

/**
 *
 * @author MESHAL
 */
public class HandballTeam extends Team {

    public HandballTeam(String name) {
        super(name);
    }

    @Override
    public int getScoredPointes() {
        int sum = 0;
        for (int i = 0; i < getPlayers().size(); i++) {
            sum += ((HandballPlayer) getPlayers().get(i)).getGoalsMade();
        }

        return sum;
    }

}
