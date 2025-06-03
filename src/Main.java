import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int pilih;

        System.out.println();

        do {
            System.out.println("===== Sistem Antrian SPBU =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Lihat Antrian ");
            System.out.println("3. Cek Sisa Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("6. Sort Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

        } while (true);
    }
}
