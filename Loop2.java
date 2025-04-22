package For;

import java.util.Scanner;

public class Loop2 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter case number");

        System.out.println("                ");

        System.out.println("2- *");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");

        System.out.println("                   ");

        System.out.println("3- *****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");

        System.out.println("                   ");

        System.out.println("4- *");
        System.out.println("    *");
        System.out.println("     *");
        System.out.println("      *");
        System.out.println("       *");

        System.out.println("                 ");

        System.out.println("5-     *");
        System.out.println("      *");
        System.out.println("     *");
        System.out.println("    *");
        System.out.println("   *");

        System.out.println("6-  *    ");
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println(" ******* ");

        System.out.println("                 ");

        System.out.println("  *  ");
        System.out.println(" * * ");
        System.out.println("*   *");
        System.out.println(" * * ");
        System.out.println("  *  ");

        int ch = S.nextInt();
        for (int i = 1; i <= 5; i++) {
            switch (ch) {
                case 1:
                    System.out.print("*");
                    break;
                case 2:
                    System.out.println("*");
                    break;
                case 3:
                    System.out.println("*****");
                    break;
                case 4:
                    if (i == 1) {
                        System.out.println("*");
                    }
                    if (i == 2) {
                        System.out.println(" *");
                    }
                    if (i == 3) {
                        System.out.println("  *");
                    }
                    if (i == 4) {
                        System.out.println("   *");
                    }
                    if (i == 5) {
                        System.out.println("    *");
                    }
                    ;
                    break;

                case 5:
                    if (i == 1) {
                        System.out.println("      *");
                    }
                    if (i == 2) {
                        System.out.println("     *");
                    }
                    if (i == 3) {
                        System.out.println("    *");
                    }
                    if (i == 4) {
                        System.out.println("   *");
                    }
                    if (i == 5) {
                        System.out.println(" *");
                    }
                    ;
                    break;
                case 6:
                    if (i == 1) {
                        System.out.println("    *    ");
                    }
                    if (i == 2) {
                        System.out.println("   ***   ");
                    }
                    if (i == 3) {
                        System.out.println("  *****  ");
                    }
                    if (i == 4) {
                        System.out.println(" ******* ");
                    }
                    if (i == 5) {
                        System.out.println("*********");
                    }
                    ;
                    break;
                case 7:
                    if (i == 1) {
                        System.out.println("  *  ");
                    }
                    if (i == 2) {
                        System.out.println(" * * ");
                    }
                    if (i == 3) {
                        System.out.println("*   *");
                    }
                    if (i == 4) {
                        System.out.println(" * * ");
                    }
                    if (i == 5) {
                        System.out.println("  *  ");
                    }
                    ;
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }

        }
    }
}
