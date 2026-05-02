import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numComentarios;

        System.out.println("Digite o número de comentários: ");
        // numComentarios = 5 \n -> só pega o número, mas o \n fica no buffer de String
        numComentarios = entrada.nextInt();
        // limpar o buffer do Scanner
        entrada.nextLine();

        String[] Comentarios = new String[numComentarios];

        for(int i = 0; i < Comentarios.length; i++){

            System.out.println("Digite o comentário[" + (i+1) +"]: ");
            Comentarios[i] = entrada.nextLine();

            if (Comentarios[i].contains("fdp") ||
                    Comentarios[i].contains("arrombado")){
                Comentarios[i] = "SPAM";
                System.out.println("Comentário bloquado!");
            }
        }

        entrada.close();
        for (int i = 0; i < Comentarios.length; i++){
            if (!Comentarios[i].contains("SPAM")){
                System.out.println("-----Comentário["+(i+1)+"]: "+Comentarios[i]);
            }
        }

    }
}
