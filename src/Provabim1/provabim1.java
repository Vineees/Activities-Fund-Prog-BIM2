import java.util.Random;
import java.util.Scanner;

public class provabim1 {
    public static void main(String[] args) {
        int minorAge = 0;
        //Starting User Reading


        for (int i = 0; i < 5; i++) {
            //Gem Randon Number

            //Gera Idade
            int age = creterandon(81) + 10;
            //Gera Filhos
            int sons = creterandon(5);

            //System.out.println("Idade: " + age);
            //System.out.println("Q.Filhos: " + sons);

            //Veirifying If is Minor age
            if (((minorAge) > age ) || (minorAge >= 0)){
                minorAge = age;
            }
        }
    }

    public static int creterandon(int i) {
        Random rand = new Random(i);
        int a = Math.abs(rand.nextInt());
        System.out.println(a);
        return a;
    }
}
