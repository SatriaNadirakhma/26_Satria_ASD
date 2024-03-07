public class TransaksiBarang26 {
    private Barang26[] barangs;
    private int[] pembelian;

    public TransaksiBarang26(Barang26[] barangs) {
        this.barangs = barangs;
        this.pembelian = new int[barangs.length];
    }

    public void tampilkanBarang() {
        System.out.println("Daftar Barang: ");
        for (Barang26 barang : barangs) {
            System.out.println(barang.kode + " | " + barang.nama + " | " + barang.harga + " | " + barang.stok);
        }
    }

    public void beli(String kode, int jumlah) {
        for (int i = 0; i < barangs.length; i++) {
            if (barangs[i].kode.equals(kode)) {
                if (barangs[i].stok >= jumlah) {
                    pembelian[i] += jumlah;
                    barangs[i].kurangiStok(jumlah);
                    System.out.println("Pembelian berhasil: " + barangs[i].nama + " sejumlah " + jumlah);
                } else {
                    System.out.println("Stok " + barangs[i].nama + " tidak mencukupi.");
                }
                return;
            }
        }
    }

    public void tampilkanPembelian () {
        System.out.println("Barang yang Dibeli:");
        for (int i = 0; i < barangs.length; i++) {
            if (pembelian[i] > 0) {
                System.out.println(barangs[i].kode + " | " + barangs[i].nama + " | Harga: Rp" + barangs[i].harga + " | Jumlah: " + pembelian[i]);
            }
        }
    }
}
