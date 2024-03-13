package soal_method;

import java.util.Scanner;

public class Soal_Method3 {

    // Method untuk menghitung faktorial n
    public static int faktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            int hasil = 1;
            for (int i = 1; i <= n; i++) {
                hasil *= i;
            }
            return hasil;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Soal 3
        System.out.print("Masukkan nilai n untuk menghitung faktorial: ");
        int n = input.nextInt();
        int hasilFaktorial = faktorial(n);
        System.out.println(n + "! = " + hasilFaktorial);
    }
}
