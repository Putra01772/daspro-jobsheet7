import java.util.Scanner;

public class PengelolaBioskopNo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;              
        int totalTiketTerjual = 0;     
        double totalPenjualan = 0;  
   
        final double HARGA_TIKET = 50000; 
        
        System.out.println("=== Program Penjualan Tiket Bioskop ===");
        System.out.println("Harga tiket: Rp " + (int)HARGA_TIKET);
        System.out.println("Masukkan 0 untuk mengakhiri input.\n");
        
        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid! Jumlah tiket tidak boleh negatif.\n");
                continue;
            }

            double hargaTotal = jumlahTiket * HARGA_TIKET;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double potongan = hargaTotal * diskon;
            double hargaAkhir = hargaTotal - potongan;

            System.out.println("Jumlah tiket: " + jumlahTiket);
            System.out.println("Diskon: " + (int)(diskon * 100) + "%");
            System.out.println("Total bayar: Rp " + (int)hargaAkhir + "\n");

            totalTiketTerjual += jumlahTiket;
            totalPenjualan += hargaAkhir;
        }

        System.out.println("\n=== Rekapitulasi Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual : " + totalTiketTerjual);
        System.out.println("Total penjualan     : Rp " + (int)totalPenjualan);
        sc.close();
    }
}
