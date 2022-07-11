package Company;

import java.util.Scanner;

public class Postac {
    String nazwa;
    String klasa;

    Postac() {
    }

    public Postac(String nazwa, String klasa) {
        this.nazwa = nazwa;
        this.klasa = klasa;
    }

    void tworzeniePostacji() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwe postaci:");
        nazwa = scanner.nextLine();
        System.out.println("Nazwa postaci to: " + nazwa);
        System.out.println();
        System.out.println("Wybierz klase: elf, wojownik, mag");
        klasa = scanner.nextLine();


        if (klasa.equals("elf")) {
            Elf elf = new Elf();
            System.out.println("Wybrałeś elfa" + elf);
        } else if (klasa.equals("wojownik")) {
            Wojownik wojownik = new Wojownik();
            System.out.println("Wybrałeś wojownika" + wojownik);
        } else if (klasa.equals("mag")) {
            Mag mag = new Mag();
            System.out.println("Wybrałeś maga" + mag);
        }
    }
}

