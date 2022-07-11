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

        Elf elf = new Elf();
        Wojownik wojownik = new Wojownik();
        Mag mag = new Mag();

        if (klasa.equals("elf"))
            System.out.println("Wybrałeś elfa" + " Bron: " + elf.bron + " HP: " + elf.hp + " SILA: " + elf.sila + " Szybkosc: " + elf.szybkosc);
        if (klasa.equals("wojownik"))
            System.out.println("Wybrałeś wojownika" + " Bron: " + wojownik.bron + " HP: " + wojownik.hp + " SILA: " + wojownik.sila + " Szybkosc: " + wojownik.szybkosc);
        if (klasa.equals("mag"))
            System.out.println("Wybrałeś maga" + " Bron: " + mag.bron + " HP: " + mag.hp + " SILA: " + mag.sila + " Szybkosc: " + mag.szybkosc);


    }


}

