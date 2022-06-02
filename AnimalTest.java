package hw8Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.AnimalInfo(); // Parent class

		Mammal mammal = new Mammal();
		mammal.mammalInfo(); // single inheritance
		mammal.AnimalInfo();

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.AnimalInfo();

		Birds birds = new Birds(); // child class
		birds.birdsInfo();
		birds.AnimalInfo();

		Dog dog = new Dog();
		dog.dogInfo(); // multilevel inheritance
		dog.mammalInfo();
		dog.AnimalInfo();

		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.AnimalInfo();

		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.AnimalInfo();

		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.AnimalInfo();

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.AnimalInfo(); // Hierarchical inheritance
	}
}
