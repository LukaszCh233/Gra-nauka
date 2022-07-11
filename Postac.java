package Company;

import java.util.Scanner;

public class Postac {
    String nazwa;
    String klasa;
    private AtrybutyPostaci atrybutyPostaci;

    public Postac(String nazwa, String klasa, AtrybutyPostaci atrybutyPostaci) {
        this.nazwa = nazwa;
        this.klasa = klasa;
        this.atrybutyPostaci = atrybutyPostaci;
    }

    public static Postac tworzeniePostaci() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwe postaci:");
        String nazwa = scanner.nextLine();
        System.out.println("Nazwa postaci to: " + nazwa);
        System.out.println();
        System.out.println("Wybierz klase: elf, wojownik, mag");
        String klasa = scanner.nextLine();

        AtrybutyPostaci atrybutyPostaci = wybierzKlase(klasa);
        System.out.println(atrybutyPostaci);

       return new Postac(nazwa, klasa, atrybutyPostaci);
    }

    private static AtrybutyPostaci wybierzKlase(String klasa) {
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

