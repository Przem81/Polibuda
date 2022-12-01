import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int zaKtorymRazem = 0;
        int szukanaLiczba;
        int odpowiedzUsera;
        String slowoKlucz = "";

        Random sc = new Random();
        szukanaLiczba = sc.nextInt(2) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Komputer wylosował liczbę - Zgadnij jaką. Liczbę z zakresu 1-10");

        do {
            zaKtorymRazem++;
            System.out.println("Podaj Liczbę: ");
            odpowiedzUsera = scanner.nextInt();
            if (odpowiedzUsera > szukanaLiczba) {
                System.out.println("Niestety :( Poszukiwana liczba jest Mniejsza.");
            } else if (odpowiedzUsera < szukanaLiczba) {
                System.out.println("Niestety :( Poszukiwana liczba jest Większa.");
            } else if (zaKtorymRazem == 2) {
                slowoKlucz = "Mistrz!";
            } else if (zaKtorymRazem > 1) {
                slowoKlucz = "Bingo!";
            }
            System.out.println("Break czy nie break");

        } while (odpowiedzUsera != szukanaLiczba);

        System.out.println(slowoKlucz + " Szukana Liczba to: " + szukanaLiczba + ". Odgadłeś za " + zaKtorymRazem + " razem");
    }

}





