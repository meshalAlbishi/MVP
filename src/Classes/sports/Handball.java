package Classes.sports;

import Classes.players.BasketballPlayer;
import Classes.players.HandballPlayer;
import Classes.teams.HandballTeam;
import Classes.players.Player;
import Classes.teams.Team;
import java.util.Scanner;

/**
 *
 * @author MESHAL
 */
public class Handball extends Sport {

    public static String[] postitins = {"G", "F"};
    public static int[][] scores = {{50, 5, 2}, {20, 1, 1}};

    public Handball(Scanner input) throws Exception {
        super("Handball");

        super.setTeamA(new HandballTeam("Team A"));
        super.setTeamB(new HandballTeam("Team B"));

        handballOperations(input);
    }

    private void handballOperations(Scanner input) throws Exception {
        input.nextLine();
        while (input.hasNext()) {

            // read the player information line
            String[] playerInfo = input.nextLine().trim().split(";");

            // ---------------------------------------------------
            HandballPlayer player = (HandballPlayer) createPlayer(playerInfo);

            addToTeam(player, getTeamA(), getTeamB());
        }

        this.play();

    }

    @Override
    public Player createPlayer(String[] playerInfo) {
        // player number
        int number = Integer.parseInt(playerInfo[2]);

        // statics
        int goalsMade = Integer.parseInt(playerInfo[5]);
        int goalsReceived = Integer.parseInt(playerInfo[6]);

        return new HandballPlayer(playerInfo[0], playerInfo[1], number, playerInfo[3], playerInfo[4], goalsMade, goalsReceived);
    }

    @Override
    public void addToTeam(Player player, Team teamA, Team teamB) throws Exception {
        if (!player.getTeamName().contains("A") && !player.getTeamName().contains("B")) {
            throw new Exception("Team Not Found");
        }

        if (player.getTeamName().contains("A")) {
            teamA.addPlayer(player);
        }

        if (player.getTeamName().contains("B")) {
            teamB.addPlayer(player);
        }
    }

    @Override
    public void play() {
        Player bestMVPA = getTeamA().MVP_per_team();
        Player bestMVPB = getTeamB().MVP_per_team();

        // check the winner team, to add 10 points
        if (getTeamA().getScoredPointes() > getTeamB().getScoredPointes()) {
            bestMVPA.incValue(10);
        } else if (getTeamA().getScoredPointes() < getTeamB().getScoredPointes()) {
            bestMVPB.incValue(10);
        }

        if (bestMVPA.getValue() > bestMVPB.getValue()) {
            System.out.println("\nThe MVP from team A is: \n" + bestMVPA.toString());
        } else {
            System.out.println("\nThe MVP from team B is: \n" + bestMVPB.toString());
        }

    }

}
