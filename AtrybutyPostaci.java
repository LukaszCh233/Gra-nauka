package Company;

public class AtrybutyPostaci {
    String bron;
    int hp;
    int sila;
    double szybkosc;

    public AtrybutyPostaci(String bron, int hp, int sila, double szybkosc) {
        this.bron = bron;
        this.hp = hp;
        this.sila = sila;
        this.szybkosc = szybkosc;
    }

    @Override
    public String toString() {
        return " Bron: " + bron + " HP: " + hp + " SILA: " + sila + " Szybkosc: " + szybkosc;
    }
}
