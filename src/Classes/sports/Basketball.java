package Classes.sports;

import Classes.players.BasketballPlayer;
import Classes.teams.BasketballTeam;
import Classes.players.Player;
import Classes.teams.Team;
import java.util.Scanner;

/**
 *
 * @author MESHAL
 */
public class Basketball extends Sport {

    public static String[] postitins = {"G", "F", "C"};
    public static int[][] scores = {{2, 3, 1}, {2, 2, 2}, {2, 1, 3}};

    public Basketball(Scanner input) throws Exception {
        super("Basketball");

        super.setTeamA(new BasketballTeam("Team A"));
        super.setTeamB(new BasketballTeam("Team B"));

        basketballOperations(input);
    }

    private void basketballOperations(Scanner input) throws Exception {
        input.nextLine();
        while (input.hasNext()) {

            // read the player information line
            String[] playerInfo = input.nextLine().trim().split(";");

            // ---------------------------------------------------
            BasketballPlayer player = (BasketballPlayer) createPlayer(playerInfo);

            addToTeam(player, getTeamA(), getTeamB());
        }

        this.play();

    }

    @Override
    public Player createPlayer(String[] playerInfo) {
        // player number
        int number = Integer.parseInt(playerInfo[2]);

        // statics
        int scoredPoints = Integer.parseInt(playerInfo[5]);
        int rebounds = Integer.parseInt(playerInfo[6]);
        int assists = Integer.parseInt(playerInfo[7]);

        return new BasketballPlayer(playerInfo[0], playerInfo[1], number, playerInfo[3], playerInfo[4], scoredPoints, rebounds, assists);
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
        BasketballPlayer bestMVPA = (BasketballPlayer) getTeamA().MVP_per_team();
        BasketballPlayer bestMVPB = (BasketballPlayer) getTeamB().MVP_per_team();

        // check the winner team, to add 10 points
        if (getTeamA().getScoredPointes() > getTeamB().getScoredPointes()) {
            bestMVPA.incValue(10);
        } else if (getTeamA().getScoredPointes() < getTeamB().getScoredPointes()) {
            bestMVPB.incValue(10);
        }
        
        System.out.println("The Sport is Basketball");
        System.out.println("----------------------------------------");
        if (bestMVPA.getValue() > bestMVPB.getValue()) {
            System.out.println("\nThe MVP from team A is: \n" + bestMVPA.toString());
        } else {
            System.out.println("\nThe MVP from team B is: \n" + bestMVPB.toString());
        }
        System.out.println("----------------------------------------\n");
    }

}
