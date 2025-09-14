import java.util.Scanner;

public class atv19 {
    public static void main(String[] args) {
        //receba um nome e verifica se comeaça com a
        //lowerCase e startsWith

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um nome:");
        String name = sc.nextLine();

        //converte para facilitar verificação
        String lowerCase = name.toLowerCase();

        if (lowerCase.startsWith("a")){
            System.out.println(name + " começa com A");
        }else {
            System.out.println(name + " não começa com A");
        }

    }
}
