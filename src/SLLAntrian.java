public class SLLAntrian {
    NodeAntrian head,tail;
    int size;

    public SLLAntrian(){
        tail = head = null;
        size = 0;
    }

    public boolean IsEmpty(){
        return size == 0;
    }

    public void tambahDataKendaraan(Kendaraan kendaraan){

        NodeAntrian newNode = new NodeAntrian(kendaraan, null);

        if (IsEmpty()) {
            head=tail=newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }

        size++;
        System.out.println(">> Kendaraan masuk ke dalam antrian");
    }

    public int cekSisaAntrian() {
        return size;
    }

    public void layaniKendaraan() {

        if (IsEmpty()) {
            System.out.println("Antrian masih kosong!");
            return;
        } else if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }

        size--;
    }

    public void lihatAntrian() {

        if (IsEmpty()) {
            System.out.println("Antrian masih kosong!");
            return;
        }

        NodeAntrian tmp = head;

        while (tmp != null) {
            tmp.kendaraan.tampilKendaraan();
            tmp = tmp.next;
        }
    }
}
