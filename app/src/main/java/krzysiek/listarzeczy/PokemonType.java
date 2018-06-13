package krzysiek.listarzeczy;

public enum PokemonType {
    NORMAL{
        @Override
        public String toString() {
            return "Normal";
        }
    }, FIRE{
        @Override
        public String toString() {
            return "Fire";
        }
    }, WATER{
        @Override
        public String toString() {
            return "Water";
        }
    }, GRASS{
        @Override
        public String toString() {
            return "Grass";
        }
    }
}
