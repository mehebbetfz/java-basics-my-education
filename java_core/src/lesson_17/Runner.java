package lesson_17;

// Вложенные статические классы
public class Runner {
	public static void main(String[] args) {
		Human h = new Human();

		Human.Passport p = new Human.Passport("27362jbsd", PassportType.FOREIGN);

		h.setPassport(p);
	}
}
