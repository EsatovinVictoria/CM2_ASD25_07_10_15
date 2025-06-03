public class SLLTransaksi {
  NodeTransaksi head,tail;
  int size;

  public SLLTransaksi(){
    head=tail=null;
    size=0;
  }

  public boolean isEmpty15() {
    return size == 0;
  }

  public void dataTransaksi(Kendaraan kendaraan, BBM bbm,double perLiter){
    TransaksiPengisian inputLayanan = new TransaksiPengisian(kendaraan,bbm, perLiter);
    NodeTransaksi ndInput = new NodeTransaksi(inputLayanan, null);
    if (isEmpty15()) {
      head=tail=ndInput;
    } else {
      tail.next=ndInput;
      tail=ndInput;
    }
  }

  public void tampilTransaksi(){
    if (isEmpty15()) {
      System.out.println("Antrian kosong");
    } else {
      NodeTransaksi tmp = head;
      System.out.println("-- Riwayat Transaksi --");
      System.out.printf("%-15s %-15s %-15s %-15s", "Plat Nomor", "Jenis", "Jenis BBM", "Total");
      while (tmp!=null) {
        tmp.tp.riwayTransaksi();
        tmp=tmp.next;
      }
    }
  }

  public void transaksiASC(){
    if (head==null||head.next==null) {
      return;
    }
    boolean swap;
    do {
      swap=false;
      NodeTransaksi current = head;
      while (current.next!=null) {
        if (current.tp.kendaraan.platNomor.compareTo(current.next.tp.kendaraan.platNomor)>0) {
          TransaksiPengisian tmp = current.tp;
          current.tp=current.next.tp;
          current.next.tp = tmp;
          swap=true;
        }
        current=current.next;
      }
    } while (swap);
  }
}
