package lesson_18;


// Вложенные не статические классы
public class Lesson_18 {
    public static void main(String[] args) {
        // Так нельзя
        Human.Heart heart = new Human.Heart(); // не получится


        // Так можно
        // Тоесть сначало создаем человека а потом сердце
        // Тут поная привязка
        Human human = new Human();
        human.new Heart();


        // А лучше сделать чтобы создание сердца происходило одновременно с Human
    }
}
