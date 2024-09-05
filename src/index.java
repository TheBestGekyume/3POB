import java.util.Scanner;
import java.text.DecimalFormat;
public class index {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");


        System.out.println("Entrada String: ");

        String teste = scanner.nextLine();

        System.out.println("Entrada Numero: ");

        double num = scanner.nextDouble();

        System.out.print("Saida: " + teste + "\t" + df.format(num));

    }
}
