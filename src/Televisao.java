import java.util.Scanner;

public class Televisao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean finalizar = false;
        boolean estado = true;
        int canal = 0;

        do {
            System.out.println("O que deseja fazer?");
            System.out.println("1 -> ligar/desligar");
            System.out.println("2 -> mudar de canal");
            System.out.println("3 -> sair");

            System.out.println("Estado da TV: " + (estado ? "Ligada " : "Desligada ") + " Canal: " + canal);
            int acao = sc.nextInt();

            if (acao == 1) {
                estado = !estado;
            } 
            
            else if (acao == 2) {
                if (!estado) {
                    System.out.println("A TV está desligada. Ligue para mudar de canal.");
             }else{
                    System.out.print("Digite o canal (0 a 999): ");
                    canal = sc.nextInt();
                    if (canal > 999 || canal < 0) {
                        System.out.println("Insira um canal válido.");
                    }
                }
            } else if (acao == 3) {
                finalizar = true;
            } 
            else {
                System.out.println("Opção inválida.");
            }

        }while (!finalizar);

        sc.close();
        System.out.println("Programa encerrado.");
    }
}
