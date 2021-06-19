package Classes;

/**
 *
 * @author MESHAL
 */
public abstract class Person {

    private String name;
    private String nickname;

    public Person(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", nickname=" + nickname + '}';
    }       
    
}
