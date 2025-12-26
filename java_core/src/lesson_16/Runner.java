package lesson_16;

public class Runner {
	public static void main(String[] args) {

		// Это называется анонимный класс тоесть вместо того чтобы создавать дополнительный класс Dog И имплементировать в него интерфей я просто создаю анонимный класс
		Alive a = new Alive() {
			@Override
			public void eat() {
				throw new UnsupportedOperationException("Unimplemented method 'eat'");
			}
		};

		a.eat();
	}
}
