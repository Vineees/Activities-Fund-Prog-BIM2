import java.util.Random;

public class geradorvetor {
    public static void main(String[] args) {
        int minor = 0;
        int[] arrayV = new int[5], arrayM = new int[5];

        Random random = new Random();

        System.out.print("V: ");
        for (int i = 1; i < 5; i++) {
            arrayV[i] = random.nextInt(20);

            if (arrayV[i] < minor || minor == 0) {
                minor = arrayV[i];
            }
            System.out.print(arrayV[i] + " ");
        }

        System.out.println(" ");
        System.out.print("M: ");
        for (int i = 1; i < 5; i++) {
            arrayM[i] = arrayV[i] * minor;
            System.out.print(arrayM[i] + " ");
        }

        System.out.println(" ");
        System.out.println("Minor: " + minor);


    }
}
