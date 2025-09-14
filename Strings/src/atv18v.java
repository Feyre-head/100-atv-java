import java.util.Scanner;

public class atv18v {
    public static void main(String[] args) {
        //trocando a ; e usando laço de repetição

        Scanner sc = new Scanner(System.in);

        //Pede a frase
        System.out.println("Digite a frase:");
        String phrase = sc.nextLine();


        StringBuilder newPhrase = new StringBuilder();

        //looping para add cada letra da palavra no no char
        for (int i = 0; i < phrase.length(); i++) {
            char letter = phrase.charAt(i);

            //se a letra for 'a' substitui pelo 'e' senao deixa a letra que tava
            if (letter == 'a') {
                newPhrase.append('e');
            } else {
                newPhrase.append(letter);
            }
        }

        System.out.println("Frase modificada: " + newPhrase);

        sc.close();
    }
}
