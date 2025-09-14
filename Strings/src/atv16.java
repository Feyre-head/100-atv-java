import java.util.Scanner;

public class atv16 {
    public static void main(String[] args) {
        //Ler duas palavras e concatenar

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos Concatenar Palavras!");

        System.out.println("Informe a primeira palavra:");
        String firstWord = sc.nextLine();

        System.out.println("Informe a segunda palvra:");
        String secondWord = sc.nextLine();

        String result = firstWord + " " + secondWord;

        System.out.println(result);
    }
}
