package conversordemoedas;
import java.util.Scanner;
public class Conversor {
    public static void main(String[] args) {
        // valores em março-2025!!
        double real = 0.0;
        double dollar = 0.0;
        double euro = 0.0;
        double libra = 0.0;
        double qtd = 0.0;
        String moeda = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Qual moeda você deseja converter?\nOpções: Real, Euro, Libra e Dollar.");
        String escolha = input.nextLine().toLowerCase();

        // teste para ver se a escolha está saindo todo em minusculo
        switch (escolha)
        {
            case "real":
                real = 1;
                dollar = 0.1745;
                euro = 0.1623;
                libra = 0.1354;
                moeda = "Reais";
                break;

            case "dollar":
                real = 5.7270;
                dollar = 1;
                euro = 0.9301;
                libra = 0.7759;
                moeda = "Dollars";
                break;

            case "euro":
                real = 6.1614;
                dollar = 1.0751;
                euro = 1;
                libra = 0.8343;
                moeda = "Euros";
                break;

            case "libra":
                real = 7.3863;
                dollar = 1.2888;
                euro = 1.1987;
                libra = 1;
                moeda = "Libras";
                break;

            default:
                System.out.println("Moeda inválida...");
                break;
        }

        System.out.println("Insira a quantidade: ");
        qtd = input.nextDouble();
        System.out.println(qtd + " " + moeda + " convertido para:\nReal: " + (qtd * real) + "R$" + "\nDollar: " + (qtd * dollar));




    }
}