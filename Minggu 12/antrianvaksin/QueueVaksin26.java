package antrianvaksin;

public class QueueVaksin26 {
    NodeV26 head;
    NodeV26 tail;
    int size;

    public boolean isEmpty() {
        return size == 0;
    }
    
    public QueueVaksin26() {
        head = null;
        tail = null;
        size = 0;
    }

    public void enqueue(int nomorAntrian, String nama) {
        NodeV26 newNode = new NodeV26(nomorAntrian, nama);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
            return;
        }
        String nama = head.nama;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println( nama + " telah selesai divaksinasi.");
    }

    public void data() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
            return;
        }
        System.out.println("+++++++++++++++++++++++");
        System.out.println("DAFTAR PENGANTRI VAKSIN");
        System.out.println("+++++++++++++++++++++++");
        System.out.println("");
        System.out.println("| Nomor | Nama |");
        NodeV26 current = head;
        while (current != null) {
            System.out.printf("| %-6d| %-5s|%n", current.nomorAntrian, current.nama);
            current = current.next;
        }
    }

    public int getSize() {
        return size;
    }
}
