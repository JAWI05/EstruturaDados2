import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número de doações recebidas: ");
        int numDoacoes = entrada.nextInt();

        double[] valorDoacao = new double[numDoacoes];
        double ValorTotal = 0;
        int cont = 0;

        for (int i = 0; i < numDoacoes; i++){

            System.out.println("Digite o valor da "+(i+1)+"º doação: ");
            valorDoacao[i] = entrada.nextDouble();

            ValorTotal = ValorTotal + valorDoacao[i];

            if (valorDoacao[i] > 100){
                cont++;
            }
        }

        System.out.println("Tiveram "+(cont)+" doações acima de R$100.");
        if (ValorTotal > 5000){
            System.out.println("A meta foi atingida!");
        }
    }
}
