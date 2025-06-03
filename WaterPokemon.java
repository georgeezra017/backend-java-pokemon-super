public class WaterPokemon extends Pokemon {
    private String name;
    private int level;

    public WaterPokemon(String name, int level) {
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
    public void hydroCanon(){
        System.out.println("<UNK> <UNK> <UNK> <UNK> <UNK> <UNK> <UNK> <UNK> <UNK>");
    }

    public void rainDance(){
        System.out.println("<UNK> <UNK> <UNK> <UNK>");
    }
    @Override
    public void makeNoise() {
        System.out.println(name + " is making noise like a " + level + name);

    }
}
