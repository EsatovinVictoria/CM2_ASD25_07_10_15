public class SLLBBM {
        NodeBBM head,tail;
        int size;
    
        public SLLBBM(){
            tail = head = null;
            size = 0;
        }
    
        public boolean IsEmpty(){
            return size == 0;
        }
    
        public void tambahDataBBM(BBM bbm){
            NodeBBM newNode = new NodeBBM(bbm, null);
            if (IsEmpty()) {
                head=tail=newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        public void ListBBM() {
            if (IsEmpty()) {
                System.out.println("Antrian masih kosong!");
                return;
            }
            NodeBBM tmp = head;
            while (tmp != null) {
                tmp.bbm.tampilBBM();
                tmp = tmp.next;
            }
            System.out.println();
        }

        public BBM cariBBM(String key) {
            NodeBBM tmp = head;
            boolean isFound;

            while (tmp != null) {
                if (tmp.bbm.namaBBM.equalsIgnoreCase(key)) {
                    isFound = true;
                    return tmp.bbm;
                }
                tmp = tmp.next;
            }

            System.out.println("Nama BBM tidak ditemmukan!");
            return null;
        }

    }
