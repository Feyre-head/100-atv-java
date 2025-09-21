import java.util.Scanner;

public class Atv35 {
    public static void main(String[] args) {
        //ler3 num

        Scanner sc = new Scanner(System.in);

        int tamanho = 3;
        int[] numeros = new int[tamanho];
        for (int c = 0; c < 3; c++) {
            System.out.println("Informe o " + (1 + c) + " número:");
            numeros[c] = sc.nextInt();
        }

        // 1
        if (numeros[0] <= numeros[1] && numeros[0] <= numeros[2]) {
            System.out.print(numeros[0] + " ");
            if (numeros[1] <= numeros[2]) {
                System.out.print(numeros[1] + " " + numeros[2]);
            } else {
                System.out.print(numeros[2] + " " + numeros[1]);
            }
            // 2
        } else if (numeros[1] <= numeros[0] && numeros[1] <= numeros[2]) {
            System.out.print(numeros[1] + " ");
            if (numeros[0] <= numeros[2]) {
                System.out.print(numeros[0] + " " + numeros[2]);
            } else {
                System.out.print(numeros[2] + " " + numeros[0]);

            }
            //3
        } else {
            System.out.print(numeros[2]);
            if (numeros[0] <= numeros[1]) {
                System.out.print(numeros[0] + " " + numeros[1]);
            } else {
                System.out.print(numeros[1] + " " + numeros[0]);
            }

        }

        sc.close();
    }

}


