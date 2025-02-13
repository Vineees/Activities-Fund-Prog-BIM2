package Lista02;
import java.util.Random;

public class radarestancia {
    public static void main(String[] args) {
        Random rand = new Random();
        int morningflag = 0, normaltax = 0 , altertax = 0, bigafternooon = 0;
        for (int i = 0; i < 100; i++) {
            int speed = rand.nextInt(200);
            if (i < 50){
                if (speed > 100) {
                    morningflag = morningflag + 1;
                    System.out.println("First IF");
                    if (speed < 140){
                        normaltax = normaltax + 1;
                    } else {
                        altertax = altertax + 1;
                    }
                }
            } else {
                if (bigafternooon < speed || bigafternooon == 0){
                    bigafternooon = speed;
                }

                if (speed > 100 && speed < 140){
                    normaltax = normaltax + 1;
                } else {
                    altertax = altertax + 1;
                }
            }
        }
        System.out.println("Cars Above 100Km/H: " + morningflag);
        System.out.println("Biggest Speed Afternoon: " + bigafternooon + "Km/H");
        System.out.println("Total Tax: R$:" + ((normaltax * 100) + (altertax * 200)));
    }
}
