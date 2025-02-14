package Lista03;
import java.util.Scanner;

public class pessoasfutebol {
    public static void main(String[] args){
        int soccer = 0, soccerconflag = 0, volleyball = 0,volleyballfem = 0, basketball = 0, runNumber = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Esporte Preferido (F - Futebol, V - Vôlei, B - Basquete): ");
        String sport = scanner.nextLine().toUpperCase(); //End with 'Z'
        System.out.println("Time de Futebol Preferido (SER, CON, LAG, ITA): ");
        String team = scanner.nextLine().toUpperCase();
        System.out.println("Seu Sexo: ");
        String sexo = scanner.nextLine().toUpperCase();

        while (!sport.equals("Z")  ){
            runNumber++;
            if (sport.equals("F")) {
                soccer++;
                if (team.equals("CON")) soccerconflag++;
            }

            if (sport.equals("VÔLEI")) volleyball++; if(sexo.equals("F")) volleyballfem++;

            System.out.println("Esporte Preferido (F - Futebol, V - Vôlei, B - Basquete): ");
            sport = scanner.nextLine(); //End with 'Z'
            System.out.println("Time de Futebol Preferido (SER, CON, LAG, ITA): ");
            team = scanner.nextLine();
            System.out.println("Seu Sexo: ");
            sexo = scanner.nextLine();
        }

        try {
            System.out.println("Porcentagem de Pessoas que gostam de Futebol: " + (soccer * 100) / runNumber + "%");
            System.out.println("Porcentagem de Pessoas que gostam do Conrinthians: " + (soccerconflag * 100) / soccer + "%");
        }
        catch (ArithmeticException e) {
            // Exception handler
            System.out.println("Não Há pessoas que gostem de futebol!");
        }

        try {
            System.out.println("Percentual das mulheres que preferem vôlei: " + (volleyballfem * 100) / volleyball + "%");
        }

        catch (ArithmeticException e) {
            // Exception handler
            System.out.println("Não Há pessoas que gostem de vôlei!");
        }
    }
}
