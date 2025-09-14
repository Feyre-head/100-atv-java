import java.util.Scanner;

public class atv20 {
    public static void main(String[] args) {
        //ler uma palavra e verificar se é palíndromo (ser lida de trás para frente)
        //replaceAll("\\s+","")  remover espaço em branco
        // toLowerCase
        //For para percorrer metade da palavra

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma Palavra para verificar se ela é um Palíndromo:");
        String paliWord = sc.nextLine();

        String formattedWord = paliWord.replace("\\s", "").toLowerCase();

        System.out.println(formattedWord);
        boolean pali = true;


        //p a l v r a
        //0 1 2 3 4 5
        //percorre a palavra vendo se os caracteres coincidem
        for (int i = 0; i < formattedWord.length() / 2; i++) {
            char a = formattedWord.charAt(i);
            char b = formattedWord.charAt(formattedWord.length() - i - 1);
            if (a != b) {
                pali = false;
                break;
            }
        }
        if (pali) {
            System.out.println("A palavra " + paliWord + " é um Pálíondromo");
        } else {
            System.out.println("A palavra " + paliWord + " não é um Palíondromo");
        }

        sc.close();


    }
}
