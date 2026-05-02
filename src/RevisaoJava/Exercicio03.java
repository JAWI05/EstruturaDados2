import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número de lanches que você consome por dia: ");
        int numLanches = in.nextInt();
        in.nextLine();

        String[] lanches = new String[numLanches];
        double[] calorias = new double[numLanches];

        double totalCalorias = 0;

        for (int i = 0; i < lanches.length; i++){

            System.out.println("Digite o "+(i+1)+"° lanche: ");
            lanches[i] = in.nextLine();

            System.out.println("Digite as calorias: ");
            calorias[i] = in.nextDouble();
            in.nextLine();

            totalCalorias = totalCalorias + calorias[i];
        }

        for (int i = 0; i < lanches.length; i++){
            System.out.println((i+1)+"° lanche: "+lanches[i]+" com "+calorias[i]+" calorias.");
        }

        if (totalCalorias >= 2000){
            System.out.println("O seu consumo ultrapassou 2000 calorias! " +
                    "É recomendado mudar a sua dieta.");
        }
    }
}
