package java_2.oop.rainforest;

import java.util.Arrays;

public class RainforestCreature extends Creature {
	//your code here
    String species, color;
    String[] prey;
    public RainforestCreature(String species, String color, String[] prey) {
        this.species = species;
        this.color = color;
        this.prey = prey;
    }

    @Override
    public void prey() {
        System.out.println(species + " are " + color + " they like to eat " + Arrays.toString(prey));
    }
}
