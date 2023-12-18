package inheritanceExample;

// Base class
public class Pokemon {
	 private String name;
	    private int level;
	    private String specialAbility;

	    public Pokemon(String name, int level, String specialAbility) {
	        this.name = name;
	        this.level = level;
	        this.specialAbility = specialAbility;
	    }

	    public String getName() {
	        return name;
	    }

	    public void attack() {
	        System.out.println(name + " attacks!");
	    }

	    public void levelUp() {
	        System.out.println(name + " leveled up!");
	        level++;
	    }

	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Level: " + level);
	    }

	    public void useSpecialAbility() {
	        System.out.println(getName() + " uses special ability: " + specialAbility);
	    }
	}

