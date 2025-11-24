package lesson_4;

/**
 * Урок 4: Тернарный (условный) оператор в Java
 * 
 * Тернарный оператор — это краткая запись if-else в одну строку.
 * Синтаксис: условие ? значениеЕслиTrue : значениеЕслиFalse
 *
 * Самый частый и полезный оператор в реальной жизни после += и Stream API
 */
public class Ternary {

	public static void main(String[] args) {

		int price = 12_500;
		int age = 61;

		// Классический if-else (для сравнения)
		String discountMessage;
		if (price > 10_000) {
			discountMessage = "Скидка 10%!";
		} else {
			discountMessage = "Скидка не положена";
		}
		System.out.println("Длинный вариант: " + discountMessage);

		// Тот же самый код, но с тернарным оператором (короче и красивее)
		String shortMessage = price > 10_000
				? "Скидка 10%!"
				: "Скидка не положена";
		System.out.println("Тернарный вариант: " + shortMessage);

		// Реальная цена со скидкой в одну строку
		double finalPrice = price > 10_000 ? price * 0.9 : price;
		System.out.printf("Итого к оплате: %.2f руб.%n", finalPrice);

		// Вложенные тернарные операторы (читается сложнее, но бывает полезно)
		String clientCategory = age >= 60
				? "Пенсионер"
				: age >= 18
						? "Взрослый"
						: "Ребёнок";
		System.out.println("Категория клиента: " + clientCategory);

		// Лучшая практика 2025 года — вынос сложных условий в отдельную переменную
		boolean hasBigOrder = price > 10_000;
		boolean isVip = age > 60;

		String bonus = hasBigOrder || isVip
				? "Подарок в комплекте!"
				: "Спасибо за покупку!";
		System.out.println(bonus);

		// Тернарный оператор внутри String.format / printf
		System.out.printf("Статус: %s%n",
				price >= 15_000 ? "VIP-клиент" : "Обычный клиент");

		// Ещё один реальный пример — определение чётности
		int number = 42;
		System.out.println(number + " — " +
				(number % 2 == 0 ? "чётное" : "нечётное") + " число");
	}
}