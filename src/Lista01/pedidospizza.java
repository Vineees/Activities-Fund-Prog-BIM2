package Lista01;
import java.util.Scanner;

public class pedidospizza {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a Quandidade de Pizzas: ");
        int pizza = scanner.nextInt();

        System.out.println("Insira a Quandidade de Refrigerantes: ");
        int soda = scanner.nextInt();

        int total = (pizza * 40) + (soda * 8);
        System.out.println("Total: R$ " + total);
    }
}
