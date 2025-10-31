import java.util.Scanner;
public class TugasPersegi08 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nilai N (minimal 3) = ");
    int N = sc.nextInt();
    int[][] pola = new int[N][N];

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                pola[i][j] = N;
            } else {
                pola[i][j] = 0;
            }
        }
    }

    int i = 0;
    do {
        int j = 0;
        do {
            if (pola[i][j] == 0) {
                System.out.print("  ");
            } else {
                System.out.print(pola[i][j] + " ");
            }
            j++;
        } while (j < N);
        System.out.println();
         i++;
    } while (i < N);
    sc.close();
   }
}
