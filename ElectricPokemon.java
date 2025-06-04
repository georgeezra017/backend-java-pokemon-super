public class ElectricPokemon extends Pokemon implements UpgradedPokemon {
    private String name;
    private int level;

    public ElectricPokemon(String name, int level) {
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

    public void thunder() {
        System.out.println(name + " is thundering");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " is making noise like a " + level + name);

    }

    @Override
    public void inferno() {
        System.out.println(name + " uses inferno, how is that possible?!");
    }
}
