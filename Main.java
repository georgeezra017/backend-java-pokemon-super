public class Main {
    public static void main(String[] args) {

        ElectricPokemon ElectricPokemon = new ElectricPokemon("Pikachu", 15);
        FirePokemon FirePokemon = new FirePokemon("Charmander", 15);
        GrassPokemon GrassPokemon = new GrassPokemon("Bulbasaur", 15);
        WaterPokemon WaterPokemon = new WaterPokemon("Squirtle", 15);

        ElectricPokemon.eat();
        FirePokemon.inferno();
        GrassPokemon.thunder();
        WaterPokemon.rainDance();

        WaterPokemon.makeNoise();


    }
}
