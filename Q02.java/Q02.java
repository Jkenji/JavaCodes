import java.util.Scanner; // Importa a classe Scanner para entrada de dados
import java.util.Random; // Importa a classe Random para gerar números aleatórios
import java.util.Arrays; // Importa a classe Arrays para trabalhar com arrays

public class Q02 {
    // Método publico que determina se o jogador venceu a rodada
    public static boolean winRound(int vetor[], int vetor2[]) {
        // Classifica os arrays em ordem crescente
        Arrays.sort(vetor);
        Arrays.sort(vetor2);
        
        // Imprime os arrays classificados (para fins de depuração)
        System.out.printf("%s\n", Arrays.toString(vetor));
        System.out.printf("%s\n", Arrays.toString(vetor2));

        // Calcula o valor das cartas dos jogadores com base nas duas maiores cartas
        int cartas1 = (vetor[4] * 10) + vetor[3];
        int cartas2 = (vetor2[4] * 10) + vetor2[3];

        // Verifica qual jogador venceu com base nos valores das cartas
        if (cartas1 > cartas2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int vetor[] = new int[5]; // Declara um array para armazenar as cartas do jogador 1
        int vetor2[] = new int[5]; // Declara um array para armazenar as cartas do jogador 2
        Random gerador = new Random(); // Cria um objeto Random para gerar números aleatórios

        // Preenche o array do jogador 1 com números aleatórios de 0 a 8 e exibe as cartas
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(9);
            System.out.printf("%d  ", vetor[i]);
        }
        System.out.println(""); // Pula para a próxima linha após exibir as cartas

        // Preenche o array do jogador 2 com números aleatórios de 0 a 8 e exibe as cartas
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = gerador.nextInt(9);
            System.out.printf("%d  ", vetor2[i]);
        }
        System.out.println(""); // Pula para a próxima linha após exibir as cartas

        // Chama a função winRound para determinar o vencedor da rodada e exibe o resultado
        System.out.println(winRound(vetor, vetor2));
    }
}
