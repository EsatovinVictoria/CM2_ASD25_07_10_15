public class TransaksiPengisian {
  Kendaraan kendaraan;
  BBM bbm;
  double liter;
  double totalBayar;

  public TransaksiPengisian(Kendaraan kendaraan, double liter){
    this.kendaraan=kendaraan;
    this.liter=liter;
  }

  public void riwayTransaksi() {
    System.out.printf("%-15s %-15s %-15s %-15.2f\n", kendaraan.platNomor, kendaraan.tipe, bbm.namaBBM, (bbm.hargaPerLiter * liter));
  }
}