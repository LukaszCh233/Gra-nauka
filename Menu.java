package Company;

import java.util.Scanner;

public class Menu {

    public static void showMenu() {
        System.out.println("1 - START");
        System.out.println("2 - OPCJE");
        System.out.println("3 - STEROWANIE");
        System.out.println("4 - EXIT");
        System.out.println("Co chcesz zrobic?: ");

        Scanner scanner = new Scanner(System.in);
        int odp;
        odp = scanner.nextInt();
        if (odp == 1) {
            System.out.println("Start");
        } else if (odp == 2) {
            System.out.println("Opcje");
        } else if (odp == 3) {
            System.out.println("Sterowanie");
        } else if (odp == 4) {
            System.exit(4);
        }
    }
}








