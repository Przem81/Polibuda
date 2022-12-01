import java.util.Scanner;

public class RLE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj text");
        String text = scanner.nextLine();
        String encodedText = encodeWithRLE(text);
        System.out.println("text po zakodowaniu: " + encodedText);
    }

    static String encodeWithRLE(String text) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        char checkingChar = text.charAt(0);


        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (checkingChar == currentChar) {
                counter++;
            } else {
                sb.append(checkingChar).append(counter);
                counter = 1;
                checkingChar = currentChar;
            }
        }
        sb.append(checkingChar).append(counter);
        return sb.toString();
    }
}
