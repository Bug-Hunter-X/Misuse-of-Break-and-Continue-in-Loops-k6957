public class MyClass {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            if (i == 8) {
                continue; // Skip the rest of the loop body
            }
        }
    }
}