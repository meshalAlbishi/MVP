 
package Classes.teams;

import Classes.players.BasketballPlayer;
import Classes.teams.Team;

/**
 *
 * @author MESHAL
 */
public class BasketballTeam extends Team{
    
    public BasketballTeam(String name) {
        super(name);
    }
    
    @Override
    public int getScoredPointes() {
        int sum = 0;
        for (int i = 0; i < getPlayers().size(); i++) {
            sum += ((BasketballPlayer) getPlayers().get(i)).getScoredPoints();
        }

        return sum;
    }
    
}
