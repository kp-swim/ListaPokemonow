package krzysiek.listarzeczy;


import java.util.ArrayList;

public class Pokemon {
    public static ArrayList<Pokemon> pokemons = new ArrayList<>();
    public ArrayList<Stat> stats = new ArrayList<>();

    static{
        Pokemon tmp;

        pokemons.add(tmp = new Pokemon("Bulbasaur", PokemonType.GRASS, R.drawable.bulbasaur));
        tmp.stats.add(new Stat("HP", 45));
        tmp.stats.add(new Stat("Attack", 49));
        tmp.stats.add(new Stat("Defense", 49));
        tmp.stats.add(new Stat("Speed", 45));
        tmp.stats.add(new Stat("St.Atk", 50));
        tmp.stats.add(new Stat("Stamina", 55));
        pokemons.add(tmp = new Pokemon("Oddish", PokemonType.GRASS, R.drawable.oddish));
        tmp.stats.add(new Stat("Speed", 45));
        tmp.stats.add(new Stat("St.Atk", 50));
        tmp.stats.add(new Stat("Defense", 55));
        tmp.stats.add(new Stat("HP", 45));
        tmp.stats.add(new Stat("Attack", 49));
        pokemons.add(tmp = new Pokemon("Bellsprout", PokemonType.GRASS, R.drawable.bellsprout));
        tmp.stats.add(new Stat("HP", 25));
        tmp.stats.add(new Stat("Speed", 50));
        tmp.stats.add(new Stat("Defense", 55));

        pokemons.add(tmp = new Pokemon("Charmander", PokemonType.FIRE, R.drawable.charmander));
        tmp.stats.add(new Stat("Speed", 45));
        tmp.stats.add(new Stat("St.Atk", 150));
        tmp.stats.add(new Stat("HP", 155));;
        pokemons.add(tmp = new Pokemon("Ponyta", PokemonType.FIRE, R.drawable.ponyta));
        tmp.stats.add(new Stat("HP", 25));
        tmp.stats.add(new Stat("Attack", 50));
        tmp.stats.add(new Stat("Defense", 55));
        pokemons.add(tmp = new Pokemon("Poliwag", PokemonType.WATER, R.drawable.poliwag));
        tmp.stats.add(new Stat("HP", 25));
        tmp.stats.add(new Stat("Attack", 50));
        tmp.stats.add(new Stat("Defense", 55));

        pokemons.add(tmp = new Pokemon("Squirtle", PokemonType.WATER, R.drawable.oddish));
        tmp.stats.add(new Stat("HP", 25));
        tmp.stats.add(new Stat("Attack", 50));
        tmp.stats.add(new Stat("Stamina", 55));
        pokemons.add(tmp = new Pokemon("Magikarp", PokemonType.WATER, R.drawable.oddish));
        tmp.stats.add(new Stat("HP", 25));
        tmp.stats.add(new Stat("Attack", 50));
        tmp.stats.add(new Stat("Defense", 55));
        pokemons.add(tmp = new Pokemon("Lapras", PokemonType.WATER, R.drawable.oddish));
        tmp.stats.add(new Stat("HP", 25));
        tmp.stats.add(new Stat("Attack", 50));
        tmp.stats.add(new Stat("Defense", 55));

        pokemons.add(tmp = new Pokemon("Eevee", PokemonType.NORMAL, R.drawable.oddish));
        tmp.stats.add(new Stat("HP", 25));
        tmp.stats.add(new Stat("Attack", 50));
        tmp.stats.add(new Stat("Defense", 55));
        pokemons.add(tmp = new Pokemon("Meowth", PokemonType.NORMAL, R.drawable.oddish));
        tmp.stats.add(new Stat("HP", 25));
        tmp.stats.add(new Stat("Attack", 50));
        tmp.stats.add(new Stat("Defense", 55));
        pokemons.add(tmp = new Pokemon("Rattata", PokemonType.NORMAL, R.drawable.oddish));
        tmp.stats.add(new Stat("HP", 25));
        tmp.stats.add(new Stat("Attack", 50));
        tmp.stats.add(new Stat("Defense", 55));
    }

    private String name;
    private PokemonType type;
    private Integer imageId;

    public Pokemon(String name, PokemonType type, Integer imageId){
        this.name = name;
        this.type = type;
        this.imageId = imageId;
    }

    public Integer getImageId(){ return imageId; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PokemonType getType() {
        return type;
    }

    public void setType(PokemonType type) {
        this.type = type;
    }

}
