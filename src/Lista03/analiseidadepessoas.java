package Lista03;
import java.util.Scanner;

public class analiseidadepessoas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int idade,runNumber = 0, adultflag = 0, uncleflag = 0;

        System.out.println("Insira uma Idade: ");
        idade = scanner.nextInt();

        while (idade > 0){
            runNumber++;
            if (idade >= 18 && idade <= 65) adultflag++;
            if (idade >= 65) uncleflag++;

            System.out.println("Insira uma Idade: ");
            idade = scanner.nextInt();
        }

        System.out.println("Porcentagem de Adultos: " + (adultflag * 100) / runNumber + "%");
        System.out.println("Porcentagem de Idosos: " + (uncleflag * 100) / runNumber + "%");
    }
}
