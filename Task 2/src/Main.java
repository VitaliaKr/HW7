public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println("Уволен айтишник с id " + i);
            }
            i++;
        }
    }
}
