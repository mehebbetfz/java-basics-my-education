public class Array {
    public static void main(String[] args) {

        upperFor:
        for (int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if (j == 5) {
                    break upperFor;
                }
            }
        }


    }
}