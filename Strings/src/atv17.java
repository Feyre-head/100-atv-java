import java.util.Scanner;

public class atv17 {
    public static void main(String[] args) {
        //receber 1 palavra e exibir cada letra separada (usar for para printar)
        //Scanner For CharAt()

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos separar todas as letras de uma palavra!");

        System.out.println("informe uma Palavra");
        String word = sc.nextLine();

        for (int i = 0; i < word.length() ; i++){
            char letter = word.charAt(i);
            System.out.println(letter);

        }

        sc.close();
    }
}
