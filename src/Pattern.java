/**
 * @class: Pattern
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 6, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 *
 * Description:
 */

public class Pattern {
    public static void main(String[] args) {
        int rows = 6; // Number of rows for the pattern
        int i = rows;

        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // Move to the next line
            i--;
        }
    }
}
