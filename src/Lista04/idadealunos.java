package Lista04;

import java.util.Random;
import java.util.Scanner;

public class idadealunos {
    public static void main(String[] args){
        int[] V = new int[10], P = new int[10], I = new int[10];
        int medV = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 1; i < 10; i++) {
            V[i] = random.nextInt(15) + 4;

            medV = medV + P[i];
            if ((V[i] % 2) != 0 ) {
                P[i] = V[i];
            } else I[i] = V[i];
        }

        for (int i = 0; i < 10; i++) {
            if()
        }
    }

}
