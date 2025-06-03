public class SLLAntrian {
    Node head,tail;
    int size;

    public SLLAntrian(){
        tail = head = null;
        size = 0;
    }

    public boolean IsEmpty(){
        return size == 0;
    }

    public void tambahData(Kendaraan kendaraan){
        Node newNode = new Node(kendaraan, null);
        if (IsEmpty()) {
            head=tail=newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
}
