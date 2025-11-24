package lesson_4;

public class Scope {

    /**
     * Точка входа в программу.
     * Показывает, как работает область видимости локальных переменных
     * и почему {@code oldPrice} недоступна после блока if.
     *
    */
    public static void main(String[] args) {

        // Исходная цена товара
        double price = 10_000.0;

        // Проверяем, превышает ли цена 9000
        if (price > 9_000) {
            // oldPrice видна ТОЛЬКО внутри этого блока {}
            double oldPrice = price;     // ← переменная живёт только здесь
            price *= 0.95;               // даём скидку 5%

            System.out.println("Старая цена: " + oldPrice);
            System.out.println("Новая цена после скидки: " + price);
        }

        // Попытка использовать oldPrice за пределами блока if
        // Это НЕ СКОМПИЛИРУЕТСЯ!
        // System.out.println(oldPrice); // Ошибка: cannot find symbol

        // price видна здесь, потому что объявлена в методе main
        System.out.println("Финальная цена снаружи блока: " + price);
    }
}
