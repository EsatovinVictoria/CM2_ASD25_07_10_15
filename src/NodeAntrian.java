public class NodeAntrian {

    Kendaraan kendaraan;
    NodeAntrian next;

    public NodeAntrian(Kendaraan kendaraan, NodeAntrian next){
        this.kendaraan = kendaraan;
        this.next = next;
    }
}