public class FirePokemon extends Pokemon {
    private String name;
    private int level;

    public FirePokemon(String name, int level) {
        this.name = name;
        this.level = level;

    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    public void pyroBall() {
        System.out.println(name + " attacked using pyro ball");

    }

    public void inferno() {
        System.out.println(name + " attacked using inferno");
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " is making noise like a " + level + name);

    }
}

