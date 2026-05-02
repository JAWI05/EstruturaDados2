import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numDias;
        System.out.println("Digite o número de dias do mês que deseja processar: ");
        numDias = in.nextInt();

        double[] valorVendas_dia = new double[numDias];

        double valorTotal = 0;
        double mediaVendas;

        double valorMaior = 0;
        int cont = 0;

        for (int i = 0; i < valorVendas_dia.length; i++){

            System.out.println("Digite quanto arrecadou de vendas no dia "+ (i+1)+": ");
            valorVendas_dia[i] = in.nextDouble();

            valorTotal = valorTotal + valorVendas_dia[i];

            if (valorMaior < valorVendas_dia[i]){
                valorMaior = valorVendas_dia[i];
                cont++;
            }
        }

        mediaVendas = valorTotal / valorVendas_dia.length;

        System.out.println("A soma de "+numDias+" dias do mês é de: "+valorTotal);
        System.out.println("A média desses valores é de: "+mediaVendas);
        System.out.println("O "+cont+"° dia teve mais venda.");
    }
}