package lesson_19;

public class Human {
    private String name;
    private int year;

    Human(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
