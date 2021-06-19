package Classes.players;

import Classes.Person;

/**
 *
 * @author MESHAL
 */
public abstract class Player extends Person {

    private int number;
    private String teamName;
    private String position;
    private int value;

    public Player(String name, String nickname, int number, String teamName, String position) {
        super(name, nickname);
        this.number = number;
        this.teamName = teamName;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void incValue(int value) {
        this.value += value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
        
    public abstract int calulateMVP(int index);

    
    
    @Override
    public String toString() {
        return super.toString() + "\nPlayer{" + "number=" + number + ", teamName=" + teamName + ", position=" + position + '}';
    }

}
