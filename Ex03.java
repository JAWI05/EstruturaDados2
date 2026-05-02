import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de lanches que você cinsome por dia: ");
        int numLanches = entrada.nextInt();

        String[] lanches = new String[numLanches];
        double[] calorias = new double[numLanches];

        for (int i = 0; i < numLanches; i++){

            System.out.print("Digite o "+(i+1)+" lanche e as calorias: ");

        }
    }
}
