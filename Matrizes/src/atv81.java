import java.util.Scanner;

public class atv81 {
    public static void main(String[] args) {
        //preencha uma matriz 3x3 com valores informados pelo usuario
        //exibir a soma dos valores na diagonal

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        //    0   1   2}
        // 0  1   2   3}
        // 1  4   5   6}
        // 2  7   8   9}

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("Digite o valor para a Linha [" + l + "] Coluna [" + c + "]: ");
                matriz[l][c] = sc.nextInt();
            }
        }


        //Calculando a soma dos valores diagonal
        //O 3 é usado no for como limite, porque a matriz tem tamanho 3
        int somaDiagona = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagona = somaDiagona + matriz[i][i];
        }

        //Calculando diagonal invertida
        //O 2 é usado no cálculo da diagonal invertida, porque o último índice da matriz é sempre tamanho - 1
        int somaDiagonaInv = 0;
        for (int i = 2; i > 0; i--) {
            somaDiagonaInv = somaDiagonaInv + matriz[i][i]; // 2 é o índice máximo
        }

        //Calculando a soma de todos os valores
        int somaTototal = 0;
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                somaTototal = somaTototal + matriz[l][c];
            }
        }

        //Calculando a soma de primeira coluna
        int somaColuna = 0;
        for (int c = 0; c<3 ; c++){
            somaColuna = somaColuna + matriz[c][c];
        }


        System.out.println("Soma Diagonal da Matriz: " + somaDiagona);
        System.out.println("Soma Diagonal Invertida da Matriz: " + somaDiagonaInv);
        System.out.println("Soma Total da Matriz:" + somaTototal);
    }
}
