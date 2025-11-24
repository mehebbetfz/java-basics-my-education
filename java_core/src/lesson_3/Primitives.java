package lesson_3;

public class Primitives {
	public static void main(String[] args) {
		// 1 byte - 8 bit

		// byte - 1 byte
		// 0111 1111 -> первый 0 это определение -+ так если теперь преобразовать это 10ичное число в цифру мы получим мин и максимум 1 byte

		byte b1 = 5; 
		System.out.println(b1);

		// short - 2 byte

		// int - 4 byte

		// long - 8 byte

		// double - 64 bit
		double d1 = 1.565765746764576758658;
		System.out.println(d1);

		// float - 32 bit
		float f1 = 0.3356746746574565678567F;
		System.out.println(f1);

		// Отличие между float и double в том что у этих числел разные уровни точности
		
		// double может быть максимум 16 цифр после точки остальное будет округлятся
		// float может быть максимум 6 цифр после точки остальное будет округлятся

		// char - character (символ) - 16 bit
		// у каждого character есть его кодовый номер в таблице юникода
		char l1 = 'Z' + 1;
		System.out.println(l1); // Другой символ

		char l2 = 70;
		System.out.println(l2); // F

		// Символы дополнения
		char dl1 = '\n'; // next line
		char dl2 = '\t'; // tab
		char dl3 = '\\'; // экранирование



		
	}
}
