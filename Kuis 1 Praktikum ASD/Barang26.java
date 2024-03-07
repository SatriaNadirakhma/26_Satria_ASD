public class Barang26 {

    public String kode;
    public String nama;
    public int harga;
    public int stok;

    public Barang26(String kode, String nama, int hrg, int stok){
        kode = kode;
        nama = nama;
        harga = harga;
        stok = stok;
    }

    public void kurangiStok(int jumlah) {
        stok -= jumlah;
    }
}