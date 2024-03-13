package soal_method;

import java.util.Scanner;

public class Soal_Method1 {

    // Method untuk menjumlahkan deret 1+2+3+...+N
    public static int jumlahDeret(int N) {
        int hasil = 0;
        for (int i = 1; i <= N; i++) {
            hasil += i;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Soal 1
        System.out.print("Masukkan nilai N untuk menjumlahkan deret 1+2+3+...+N: ");
        int N = input.nextInt();
        int hasilDeret = jumlahDeret(N);
        System.out.println("Hasil penjumlahan deret = " + hasilDeret);
        
    }
}
