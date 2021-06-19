
package Classes;

import Classes.players.Player;
import Classes.teams.Team;

/**
 *
 * @author MESHAL
 */
public interface HelperFunction {
    
    public Player createPlayer(String[] playerInfo);
    
    public void addToTeam(Player player, Team teamA, Team teamB) throws Exception ;
}
