import java.util.Random;

public class Atv82 {
    public static void main(String[] args) {
        //preencher matriz 4x4 com valores random
        //exibir matriz transposta

        Random r = new Random();

        int tamanho = 4;
        int[][] matriz = new int[tamanho][tamanho];
        int[][] matrizTransposta = new int[tamanho][tamanho];

        int linha = 0;
        int coluna = 0;
        for (int l = 0; l < tamanho; l++) {
            for (int c = 0; c < tamanho; c++) {
                matriz[l][c] = r.nextInt(9);

            }

        }

        System.out.println("=== Matriz ===");
        for (int[] num : matriz) {
            for (int mat : num) {
                System.out.print(mat + "  ");
            }
            System.out.println();
        }

        for (int l = 0; l < tamanho; l++) {
            for (int c = 0; c < tamanho; c++) {
                matrizTransposta[c][l] = matriz[l][c];
            }
            System.out.println();
        }

        System.out.println("=== Matriz Transposta ===");
        for (int l = 0; l < tamanho; l++) {
            for (int c = 0; c < tamanho; c++) {
                System.out.print(matrizTransposta[l][c] + "  ");
            }
            System.out.println();
        }


    }
}
