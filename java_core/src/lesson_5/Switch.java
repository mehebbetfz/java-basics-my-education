public class Switch {
    public static void main(String[] args) {
        int dayOfWeek = 1;


        switch(dayOfWeek) {
            case 1:
                System.out.print("Day 1");
            break;
            case 2:
                System.out.print("Day 2");
            break;
            default:
                System.out.print("Day 3");
        }

        switch(dayOfWeek) {
            case 1 -> System.out.print("Day 1");
            case 2 -> System.out.print("Day 2");
            default -> System.out.print("Day 3");
        }
    }
}
