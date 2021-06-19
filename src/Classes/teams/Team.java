package Classes.teams;

import Classes.players.Player;
import java.util.ArrayList;

/**
 *
 * @author MESHAL
 */
public abstract class Team {

    private ArrayList<Player> players;
    private String name;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public abstract int getScoredPointes();

     public Player MVP_per_team() {
        Player player = getPlayers().get(0);

        for (int i = 0; i < getPlayers().size(); i++) {
            
            if (getPlayers().get(i).getValue() > player.getValue()) {
                player =  getPlayers().get(i);
            }
            
        }
        
        return player;
    }
}
