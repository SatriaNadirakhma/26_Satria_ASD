package antrianvaksin;

public class NodeV26 {
    int nomorAntrian;
    String nama;
    NodeV26 next;
    NodeV26 prev;

    public NodeV26 (int nomorAntrian, String nama) {
        this.nomorAntrian = nomorAntrian;
        this.nama = nama;
        this.next = null;
        this.prev = null;
    }
}
