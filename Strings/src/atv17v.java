import java.util.Scanner;

public class atv17v {
    public static void main(String[] args) {
        //receber uma palavra e exibir cada letra separadamente
        //Scanner metodo toCharArray() para converter palavra em array de char

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String word = sc.nextLine();

        char[] letterArray = word.toCharArray();

        for (char letter: letterArray){
            System.out.println(letter);
        }
        sc.close();
    }
}
