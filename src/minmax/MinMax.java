// vstupem je řada čísel zakončená nulou
// výstupem je maximum a minimum
package minmax;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.print("Vlož číslo: ");
        int cislo = vstup.nextInt();
        while (cislo != 0) {
            if (cislo > max) {
                max = cislo;
            }
            if (cislo < min) {
                min = cislo;
            }
            System.out.print("Vlož číslo: ");
            cislo = vstup.nextInt();
        }
        System.out.println("Nejmenší číslo: "+min);
        System.out.println("Největší číslo: "+max);
    }
}
