public class Buku26 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        } else {
            System.out.println("Stok habis");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal() {
        return harga * stok;
    }

    int hitungDiskon() {
        int hargaTotal = hitungHargaTotal();
        if (hargaTotal > 150000) {
            return (int) 0.12 * hargaTotal;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            return (int) 0.05 * hargaTotal;
        } else {
            return 0;
        }
    }

    double hitungHargaBayar() {
        return hitungHargaTotal() - hitungDiskon();
    }

    public static void main(String[] args) {
        Buku26 buku1 = new Buku26();
        buku1.judul = "The Principles Of Power";
        buku1.pengarang = "Dion Yulianto";
        buku1.halaman = 200;
        buku1.stok = 10;
        buku1.harga = 50000;

        System.out.println("Informasi Buku: ");
        buku1.tampilInformasi();
        buku1.terjual(10);
        buku1.restock(15);
        buku1.gantiHarga(75000);

        System.out.println("Informasi Terbaru Buku: ");
        buku1.tampilInformasi();
        buku1.hitungHargaTotal();
        buku1.hitungDiskon();
        buku1.hitungHargaBayar();
        
        System.out.println("Informasi Terbaru Buku: ");
        buku1.tampilInformasi();

        System.out.println("Harga Total: " + buku1.hitungHargaTotal());
        System.out.println("Diskon: " + buku1.hitungDiskon());
        System.out.println("Harga Bayar Setelah Diskon: " + buku1.hitungHargaBayar());
    }

    public Buku26() {

    }

    public Buku26(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}