package lesson_12;

@FunctionalInterface
public interface Sounding {
	// Я не могу создать еще методы так как это функциональный интерфейс
	void makeSound();

	// Но дефольтные добавлять можно

	default void doSomething() {
		System.out.println("Do");
	}
}
