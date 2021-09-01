package Tugas14;
import java.util.Scanner;

public class tugas14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int rows = scanner.nextInt();

        System.out.println("");

        // Pattern atas
        for (int i = 1; i <= rows; i++) {
            // kiri
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // spasi ditengah
            for (int k = i * 2; k <= rows * 2 - 2; k++) {
                System.out.print(" ");
            }
            // kanan
            for (int l = i; l > 0; l--) {
                if (l != rows) {
                    System.out.print(l);
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= rows - 1; i++) {
            // Kiri
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(j);
            }
            // spasi tengah
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(" ");
            }
            // Kanan
            for (int l = rows - i; l >= 1; l--) {
                System.out.print(l);
            }

            System.out.println();
        }
    }
}