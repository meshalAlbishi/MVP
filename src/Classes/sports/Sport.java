package Classes.sports;

import Classes.HelperFunction;
import Classes.teams.Team;

/**
 *
 * @author MESHAL
 */
public abstract class Sport implements HelperFunction{

    private String name;
    private Team teamA;
    private Team teamB;

    public Sport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeamA() {
        return teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }
       
    public abstract void play();

}
