package Gfg;

public class vtilted {
    public static void vi(int n) {
        int i, j;
        
        // First half: descending stars
        for (i = 1; i <= n; i++) {
            for (j = n; j >= i; j--) {
                System.out.print("*");  // No spaces between stars
            }
            System.out.println();  // Move to the next line after each row
        }
        
        // Second half: ascending stars
        for (i = 2; i <= n; i++) {  // Start from 2 to avoid middle repetition
            for (j = 1; j <= i; j++) {
                System.out.print("*");  // No spaces between stars
            }
            System.out.println();  // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        int n = 5;
        vi(n);
    }
}
