package conversordemoedas;
import java.util.Scanner;
public class Conversor {
    public static void main(String[] args) {
        // valores em março-2025!!
        int real, euro, libra, dollar; 
        Scanner input = new Scanner(System.in);
        System.out.println("Qual moeda você deseja converter?\nOpções: Real, Euro, Libra e Dollar");
        String escolha = input.nextLine().toLowerCase();

        // teste para ver se a escolha está saindo todo em minusculo
        System.out.println(escolha);

    }
}