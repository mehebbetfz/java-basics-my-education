package lesson_4;

public class BooleanLogic {
	public static void main(String[] args) {
		boolean isBoughtBread = false;
		boolean isBoughtMilk = true;


		// And - &&

		if (isBoughtBread && isBoughtMilk) {
			System.out.println("Bread");
		} else {
			System.out.println("No bread");
		}

		// Or - ||

		if (isBoughtBread || isBoughtMilk) {
			System.out.println("Bread");
		} else {
			System.out.println("No bread");
		}

		// Reverse - !
		
		if (isBoughtBread && !isBoughtMilk) {
			System.out.println("Bread");
		} else {
			System.out.println("No bread");
		}

	}
}
