public class BBM {
  String namaBBM;
  double hargaPerLiter;

  public BBM(String namaBBM, double hargaPerLiter){
    this.namaBBM=namaBBM;
    this.hargaPerLiter=hargaPerLiter;
  }

  public void tampilBBM() {
    System.out.printf("%-15s %-15.2f\n", namaBBM, hargaPerLiter);
  }

}
