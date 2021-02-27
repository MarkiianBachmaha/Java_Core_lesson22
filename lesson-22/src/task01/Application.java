package task01;

public class Application {

	public static void main(String[] args) {

		Pet cat = () -> System.out.println("ί κ³ς - Μÿσσσ-Μÿσσσ");
		Pet cow = () -> System.out.println("ί κξπξβΰ - Μσσσ-Μσσσ");
		Pet dog = () -> System.out.println("ί οερ - Γΰσσσ-Γΰσσσ");

		cat.makeSound();
		cow.makeSound();
		dog.makeSound();

	}

}