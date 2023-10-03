import java.util.Scanner; // Importa a classe Scanner para entrada de dados
import java.util.regex.Matcher; // Importa a classe Matcher para realizar correspondências de padrões
import java.util.regex.Pattern; // Importa a classe Pattern para representar expressões regulares

public class Q03 {
    // Método que converte letras em números em uma string
    public static String LetraParaNumero(String texto) {
        // Substitui letras maiúsculas por números com base na regra especificada
        texto = texto.replaceAll("A", "2");
        texto = texto.replaceAll("B", "2");
        texto = texto.replaceAll("C", "2");
        texto = texto.replaceAll("D", "3");
        texto = texto.replaceAll("E", "3");
        texto = texto.replaceAll("F", "3");
        texto = texto.replaceAll("G", "4");
        texto = texto.replaceAll("H", "4");
        texto = texto.replaceAll("I", "4");
        texto = texto.replaceAll("J", "5");
        texto = texto.replaceAll("K", "5");
        texto = texto.replaceAll("L", "5");
        texto = texto.replaceAll("M", "6");
        texto = texto.replaceAll("N", "6");
        texto = texto.replaceAll("O", "6");
        texto = texto.replaceAll("P", "7");
        texto = texto.replaceAll("Q", "7");
        texto = texto.replaceAll("R", "7");
        texto = texto.replaceAll("S", "7");
        texto = texto.replaceAll("T", "8");
        texto = texto.replaceAll("U", "8");
        texto = texto.replaceAll("V", "8");
        texto = texto.replaceAll("W", "9");
        texto = texto.replaceAll("X", "9");
        texto = texto.replaceAll("Y", "9");
        texto = texto.replaceAll("Z", "9");
        return texto; // Retorna a string com letras convertidas em números
    }

    public static void main(String[] args) {
        // Define dois padrões de expressões regulares para números de telefone
        String padrao1 = "[0-9|A-Z]{4}-[0-9|A-Z]{4}-[0-9|A-Z]{4}";
        String padrao2 = "\\([0-9|A-Z]{2}\\)[0-9|A-Z]{4}-[0-9|A-Z]{4}";

        String numero; // Declara uma variável para armazenar o número de telefone
        Scanner input = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados

        System.out.println("Digite um número telefonico: ");
        numero = input.next(); // Lê o número de telefone fornecido pelo usuário

        // Verifica se o número corresponde a um dos padrões definidos
        if (numero.matches(padrao1) || numero.matches(padrao2)) {
            // Chama a função LetraParaNumero para converter letras em números
            numero = LetraParaNumero(numero);
            System.out.println(numero); // Exibe o número de telefone convertido
        } else {
            System.out.println("Numero invalido"); // Exibe uma mensagem se o número não corresponder aos padrões
        }

        input.close(); // Fecha o objeto Scanner
    }
}
