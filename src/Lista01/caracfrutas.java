import java.util.Scanner;

public class caracfrutas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] fruits = new String[5];

        String input;

        int StartABFruits = 0;
        int EndAUFruits = 0;
        int odd = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a fruit: ");
            input = scanner.nextLine();
            fruits[i] = input;
        }

        for (int x = 0; x < fruits.length; x++) {

            char firstchar = Character.toUpperCase(fruits[x].charAt(0));
            if (firstchar == 'A' || firstchar == 'B') {
                StartABFruits = StartABFruits + 1;
            }

            char lastchar = Character.toUpperCase(fruits[x].charAt(fruits[x].length() - 1));
            if (lastchar == 'A'|| lastchar == 'U') {
                EndAUFruits = EndAUFruits + 1;
            }

            if (fruits[x].length()%2 == 0) {
                odd = odd + 1;
            }

        }

        System.out.println("Fruits that start with A or B: " + StartABFruits);
        System.out.println("Fruits that end with A or U: " + EndAUFruits);
        System.out.println("Fruits with an odd number of characters: " + odd);
    }

}
