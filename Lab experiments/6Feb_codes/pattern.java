public class pattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            if (i % 2 != 0) {                  // If i is odd, the program prints ?.
                                               // If i is even, the program prints #.
                for (int j = 1; j <= (2 * i - 1); j++) { // number of symbols printed in each row follows the formula : 2*i-1
                                                         // ensures the count increases in an odd-numbered sequence: 1, 3, 5, 7, 9.
                    System.out.print("?"); // prints ? for odd rows
                }
            } 
            else {
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}