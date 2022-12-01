import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int losowanie;
        int odpowiedz;
        Random sc = new Random();
        losowanie = sc.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Komputer wylosował liczbę -Zgadnij jaką. Liczbę z zakresu 1-10");
        do {
            i++;
            System.out.println("Podaj Liczbę: ");
            odpowiedz = scanner.nextInt();
            if (odpowiedz > losowanie) {
                System.out.println("Niestety :( Poszukiwana liczba jest Mniejsza.");
            } else if (odpowiedz < losowanie) {
                System.out.println("Niestety :( Poszukiwana liczba jest Większa.");
            } else if (i==1) {
                System.out.println("Mistrz");
            }

        } while (odpowiedz != losowanie);
        System.out.println("Bingo Szukana Liczba to: " + losowanie + " Odgadłeś za " + i + " razem");

    }

}





