import java.util.Scanner;

public class inveter4num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reverse = "";

        System.out.println("Insira Um Número:");
        System.out.println(input.length());

        for (int i = (input.length() - 1); i >= 0 ; i--) {
            reverse += input.charAt(i);
        }
        System.out.println("Número Invertido: " + reverse);
    }
}
