import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Kendaraan kendaraan = new Kendaraan();
        SLLAntrian sll = new SLLAntrian();
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
            switch (pilih) {
                case 1:
                    System.out.print("Input Plat Nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("Input Jenis Kendaraan: ");
                    String jenis = sc.nextLine();
                    System.out.print("Input Merk: ");
                    String merk = sc.nextLine();
                    kendaraan = new Kendaraan(plat,jenis,merk);
                    System.out.println(">>Kendaraan masuk ke dalam antrian");
                    break;
            
                default:
                    break;
            }
        } while (true);
    }
}
