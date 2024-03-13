package soal_method;

import java.util.Scanner;

public class Soal_Method2 {


    // Method untuk menghitung jumlah bilangan ganjil di antara batasAwal dan batasAkhir
    public static int jumlahBilanganGanjil(int batasAwal, int batasAkhir) {
        int jumlah = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                jumlah++;
            }
        }
        return jumlah;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Soal 2
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();
        int jumlahGanjil = jumlahBilanganGanjil(batasAwal, batasAkhir);
        System.out.println("Banyaknya bilangan ganjil dari " + batasAwal + " sampai " + batasAkhir + " adalah: " + jumlahGanjil);

    }
}
