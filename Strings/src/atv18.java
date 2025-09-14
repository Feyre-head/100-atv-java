import java.util.Scanner;

public class atv18 {
    public static void main(String[] args) {
        //receba uma frase e substituia todas as letras 'a' por 'e' usando replace
        //Scanner ; replace ; sout

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String phrase = sc.nextLine();

        String newPhrase = phrase.replace('a', 'e');

        System.out.println(newPhrase);

        sc.close();
    }
}
