import java.util.Scanner;

class Osoba {

    String imie;
    String nazwisko;

    int wiek;

    public Osoba(String imie, int wiek, String nazwisko) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;

    }
    public void wyswietlinfo() {
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wiek: " + wiek);
    }

}
    public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("podaj imie:");
    String imie = sc.nextLine();
    System.out.println("podaj nazwisko:");
    String nazwisko = sc.nextLine();
    System.out.println("podaj wiek:");
    int wiek = sc.nextInt();

    Osoba osoba = new Osoba(imie, wiek, nazwisko);

    osoba.wyswietlinfo();
    sc.close();


        }

}
