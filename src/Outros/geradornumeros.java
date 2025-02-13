package Outros;
import java.util.Random;

public class geradornumeros {
    public static void main(String[] args) {
    int bigger = 0, smaller = 0, minorfive = 0, flag = 0;
    Random random = new Random();
    //Stating Loop
    int input = random.nextInt(100);
    while (input != 10){
        //Storing Loop
        flag++;
        //Verifying numbers
        if (bigger < input) bigger = input;
        if (smaller > input || smaller == 0) smaller = input;
        if (input < 5) minorfive++;
        //Gen New Number
        input = random.nextInt(100);
        }

    System.out.println("Sum of biggest and minor number is: " + (bigger + smaller));
    System.out.println("Percent off number above 5: " + ((minorfive * flag) / 100) + "%");
    }
}