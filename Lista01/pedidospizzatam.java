import java.util.Scanner;

public class pedidospizzatam {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int multfactor = 0;
        int total;

        System.out.print("Insira a Quandidade de Pizzas: ");
        int pizza = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Tamanho Pizza: ");
        String size = scanner.nextLine();



        switch (size){
            case "p":
            case "P":
                multfactor = 15;
                break;
            case "m":
            case "M":
                multfactor = 20;
                break;
            case "g":
            case "G":
                multfactor = 25;
                break;
            default:
                System.out.println("Escolha um Tamanho Valido!!");
                break;
        }
        total = pizza * multfactor;
        System.out.println("Total: R$ " + total);

    }
}
