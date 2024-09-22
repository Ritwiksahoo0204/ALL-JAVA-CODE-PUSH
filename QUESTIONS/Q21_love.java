public class Q21_love{
    public static void main(String[] args) {
        int n = 6; // size of the heart
        
        // Upper part of the heart
        for (int i = n / 2; i <= n; i += 2) {
            // Print spaces
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }
            // Print the left side of the heart
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces between the two halves
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print the right side of the heart
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the heart (Inverted triangle)
        for (int i = n; i >= 1; i--) {
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
