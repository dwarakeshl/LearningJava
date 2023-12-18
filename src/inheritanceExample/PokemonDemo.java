package inheritanceExample;

public class PokemonDemo {
	 public static void main(String[] args) {
	        FirePokemon charmander = new FirePokemon("Charmander", 5, "Ember");
	        charmander.displayInfo();
	        charmander.attack();
	        charmander.useSpecialAbility();
	        charmander.levelUp();

	        System.out.println();

	        WaterPokemon squirtle = new WaterPokemon("Squirtle", 5, "Water Gun");
	        squirtle.displayInfo();
	        squirtle.attack();
	        squirtle.useSpecialAbility();
	        squirtle.levelUp();
	    }
	}

