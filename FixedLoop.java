public class MyClass {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Correct usage: Exits the loop when i is 5
            }
            if (i == 8) {
                continue; // Correct usage: Skips the print for i=8
            }
            System.out.println(i);
        }
    }
}