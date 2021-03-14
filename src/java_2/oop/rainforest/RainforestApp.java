package java_2.oop.rainforest;


public class RainforestApp {

	public static void main(String[] args) {

	//	You are exploring the rainforests of the Amazon.  You have observed many different types of wildlife on your excursion.  To jog your memory,  different kinds of Rainforest Animals that you observed are found in the following URL : https://www.ietravel.com/blog/amazon-rainforest-animals-beginners-guide-21-species.  Feel free to use additional resources for more animal ideas.

	//	Pick 6 rainforest creatures and model them using the RainforestCreature class. i.e. Instantiate 6 rainforest creatures. Each Rainforest Creature should have 1 unique characteristic , and 1 unique action that it can do in addition to any general characteristics and actions that Creatures can do in general.*/

/*		Instantiate all 6 rainforest creatures here, print to the console each Rainforest Creature as a String representation, and have them perform any actions defined in the RainforestCreature class.

		ex : RainforestCreature riverDolphin = new RiverDolphin("riverDolphin","Amazon","pink",new String[]{"fish","crabs","turtles"};
			System.out.println(riverDolphin); => RiverDolphin{ properties... }.
			riverDolphin.eat() => "The river dolphin is eating fish."

		choose your own characteristics and methods to model).

*/

		RainforestCreature spectacledOwl = new RainforestCreature("Spectacled Owl", "gray with white around the eyes", new String[]{"rodents", "Sloths"});
		spectacledOwl.prey();

		RainforestCreature tocoToucan = new RainforestCreature("Toco Toucan", "black and white with yellow beaks", new String[]{"fruit", "reptlies","small birds", "eggs" });
		tocoToucan.prey();

		RainforestCreature riverDolphin = new RainforestCreature("riverDolphin","pink",new String[]{"fish","crabs","turtles"});
		riverDolphin.prey();

		RainforestCreature poisonDartFrog = new RainforestCreature("Poison Dart Frog", "blue and yellow", new String[]{"small insects"});
		poisonDartFrog.prey();

		RainforestCreature riverTurtle = new RainforestCreature("River Turtle", "green", new String[]{"Plants", "Dead Fish" });
		riverTurtle.prey();

		RainforestCreature pygmyMarmoset = new RainforestCreature("Pygmy Marmoset", "brown", new String[]{"insects", "fruit", "tree sap" });
		pygmyMarmoset.prey();
	}

}
