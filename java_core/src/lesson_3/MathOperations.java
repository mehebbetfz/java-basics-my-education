package lesson_3;

public class MathOperations {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 5;

		// +
		int r1 = x + y;
		System.out.println(r1);

		// -
		int r2 = x - y;
		System.out.println(r2);

		// *
		int r3 = x * y;
		System.out.println(r3);

		// / дробная часть при делении будет откинута
		y = 3;
		int r4 = x / y; 
		// double r4 = (double) x / y; для того чтоьы не откидывалось
		System.out.println(r4); // 3 вместо 3.333...

		// **
		int ext = x * x;
		System.out.println(ext);

		// +Инкремент/-Декремет
		x = x + 1;
		// x++
		// x += 10, *, /, -

		// %
		int n = 5;
		System.out.println(n % 2); // остаток 1

		// () используются для приоритета
		int z = 2 + 2 * 2;
		// int z = (2 + 2) * 2;
		System.out.println(z);



	}
}
