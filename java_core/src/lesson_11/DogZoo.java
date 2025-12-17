package lesson_11;

public class DogZoo {
	// private Poodle poodle;
	// private Shepard shepard;

	private Dog dog1;
	private Dog dog2;

	// Оба конструктора будут работать
	public DogZoo(Dog dog1, Dog dog2) {
		this.dog1 = dog1;
		this.dog2 = dog2;
	}

	public DogZoo(Poodle poodle, Shepard shepard) {
		this.dog1 = poodle;
		this.dog2 = shepard;
	}
}
