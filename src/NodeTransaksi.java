public class NodeTransaksi {
  TransaksiPengisian tp;
  NodeTransaksi next;

  public NodeTransaksi(TransaksiPengisian tp, NodeTransaksi next){
    this.tp=tp;
    this.next=next;
  }
}
