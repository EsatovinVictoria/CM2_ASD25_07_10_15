import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Kendaraan kendaraan = new Kendaraan();
        BBM bbm = new BBM();

        SLLAntrian sll = new SLLAntrian();
        SLLBBM sbb = new SLLBBM();
        SLLTransaksi stt = new SLLTransaksi();

        int pilih;

        sbb.tambahDataBBM(new BBM("Pertalite", 10000));
        sbb.tambahDataBBM(new BBM("Pertamax", 12400));
        sbb.tambahDataBBM(new BBM("Biosolar",6800));
        sbb.tambahDataBBM(new BBM("Dexlite",13400));

        do {
            System.out.println();

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

            System.out.println();

            switch (pilih) {
                case 1:
                    while (true) {
                        System.out.print("Input Plat Nomor: ");
                        String plat = sc.nextLine();
    
                        System.out.print("Input Jenis Kendaraan: ");
                        String jenis = sc.nextLine();
    
                        System.out.print("Input Merk: ");
                        String merk = sc.nextLine();

                        if (plat==""||jenis==""||merk=="") {
                            System.out.println("input tidak boleh kosong");
                        } else {
                            kendaraan = new Kendaraan(plat,jenis,merk);
                            sll.tambahDataKendaraan(kendaraan);
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("-- Antrian Kendaraan --");
                    System.out.printf("%-15s %-15s %-15s\n","Plat Nomor","jenis","Merk");
                    sll.lihatAntrian();
                    break;

                case 3:
                    System.out.println(">> Sisa Antrian: "+sll.cekSisaAntrian());
                    break;

                case 4:
                    if (sll.IsEmpty()) {
                        System.out.println("Antrian Masih Kosong!");
                    } else {
                        System.out.println("Kendaraan: "+ sll.head.kendaraan.platNomor);
                        sbb.ListBBM();
    
                        while (true) {
                            System.out.print("pilih BBM: ");
                            String namaBBM = sc.nextLine();
                            
                            System.out.print("Masukkan jumlah liter: ");
                            double liter = sc.nextDouble();
                            sc.nextLine();
                            
                            BBM cariBBM = sbb.cariBBM(namaBBM);
    
                            if (cariBBM != null) { 
                                stt.dataTransaksi(sll.head.kendaraan, cariBBM, liter);
                                sll.layaniKendaraan();
                                break;
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("-- Riwayat Transaksi --");
                    stt.tampilTransaksi();
                    break;

                case 6:
                    System.out.println("-- Pengurutan Riwayat Transaksi --");
                    stt.transaksiASC();
                    break;

                case 0:
                System.exit(0);
                    break;
                default:

                    System.out.println("--menu tidak tersedia--");
                    break;
            }
        } while (true);
    }
}