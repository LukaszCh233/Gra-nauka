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

    void tworzeniePostaci() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwe postaci:");
        nazwa = scanner.nextLine();
        System.out.println("Nazwa postaci to: " + nazwa);
        System.out.println();
        System.out.println("Wybierz klase: elf, wojownik, mag");
        klasa = scanner.nextLine();

        AtrybutyPostaci atrybutyPostaci = wybierzKlase(klasa);
        System.out.println(atrybutyPostaci);
    }

    private AtrybutyPostaci wybierzKlase(String klasa) {
        if (klasa.equals("elf")) {
            System.out.println("Wybrałeś elfa");
            return new Elf();
        } else if (klasa.equals("wojownik")) {
            System.out.println("Wybrałeś wojownika");
            return new Wojownik();
        } else if (klasa.equals("mag")) {
            System.out.println("Wybrałeś maga");
            return new Mag();
        }
        return null;
    }
}

