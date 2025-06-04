import org.w3c.dom.ls.LSOutput;

public abstract class Pokemon {
    private String name;
    private int level;


    public Pokemon(){

    }

    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;

    }
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public void levelUp() {
        level++;
    }
    public void levelDown() {
        level--;
    }

    public abstract void makeNoise();
}
