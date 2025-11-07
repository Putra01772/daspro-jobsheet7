import java.util.Scanner;

public class PembayaranParkirNo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int jenis;                
        int durasi;         
        int total = 0;        

        final int TARIF_MOBIL = 3000;  
        final int TARIF_MOTOR = 2000;   
        final int TARIF_MAKS = 12500;  
        
        System.out.println("=== Program Penghitung Total Pembayaran Parkir ===");
        System.out.println("Tarif: Mobil = Rp 3.000/jam | Motor = Rp 2.000/jam | Maks = Rp 12.500 (>5 jam)");
        
        do {
            System.out.print("\nMasukkan jenis kendaraan (1=Mobil, 2=Motor, 0=Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += TARIF_MAKS; 
                    System.out.println("Biaya parkir: Rp " + TARIF_MAKS + " (tarif maksimal)");
                } else if (jenis == 1) {
                    int biaya = durasi * TARIF_MOBIL;
                    total += biaya;
                    System.out.println("Biaya parkir mobil: Rp " + biaya);
                } else if (jenis == 2) {
                    int biaya = durasi * TARIF_MOTOR;
                    total += biaya;
                    System.out.println("Biaya parkir motor: Rp " + biaya);
                }

            } else if (jenis != 0) {
                System.out.println("Jenis kendaraan tidak valid! Silakan masukkan angka 1, 2, atau 0.");
            }

        } while (jenis != 0);
        
        System.out.println("\n=== Rekapitulasi Pembayaran Parkir ===");
        System.out.println("Total seluruh pembayaran parkir hari ini: Rp " + total);
        
        sc.close();
    }
}
