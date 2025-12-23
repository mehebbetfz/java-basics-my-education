public class Lesson_4 {
	public static void main(String[] args) {
		Cat cat = new Cat();

		// Получение информации о классе из обьекта
		Class<? extends Cat> catClass = cat.getClass();

		System.out.println(catClass.getName());
	}
}
