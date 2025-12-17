package lesson_12;

public class Lesson_12 {
	public static void main(String[] args) {
		Sounding cat = new Cat();
		cat.makeSound();


		// Метод ниже создает класс Bird имплементирует интерфейс Sounding инициализирует методы из интерфейса а в конце удаляет класс Bird и все это за кадром

		Sounding bird = () -> System.out.println("Make sound");
		bird.doSomething();


	}
}
