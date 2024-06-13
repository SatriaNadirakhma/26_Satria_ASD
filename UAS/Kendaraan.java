public class Kendaraan {
    String noTNKB;
    String nama;
    String jenis;
    int cc;
    int tahun;
    int bulanHarusBayar;

    public Kendaraan(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        this.noTNKB = noTNKB;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
    }

    public static Kendaraan[] daftarKendaraan() {
        Kendaraan[] kendaraanList = new Kendaraan[5];
        kendaraanList[0] = new Kendaraan("B1234XYZ", "Ali", "Motor", 150, 2020, 6);
        kendaraanList[1] = new Kendaraan("D5678ABC", "Budi", "Mobil", 2000, 2019, 12);
        kendaraanList[2] = new Kendaraan("E9101DEF", "Charlie", "Motor", 250, 2021, 3);
        kendaraanList[3] = new Kendaraan("F1213GHI", "Dewi", "Mobil", 1500, 2018, 9);
        kendaraanList[4] = new Kendaraan("G1415JKL", "Eka", "Motor", 125, 2022, 11);
        return kendaraanList;
    }

    public static void tampilDaftarKendaraan(Kendaraan[] kendaraanList) {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("|  Nomor TNKB  |      Nama      |  Jenis  |  CC Kendaraan  |  Tahun  |  Bulan Harus Bayar  |");
        System.out.println("--------------------------------------------------------------------------");
        for (Kendaraan k : kendaraanList) {
            if (k != null) {
                System.out.printf("| %-13s | %-13s | %-6s | %-14d | %-6d | %-18d |\n",
                                  k.noTNKB, k.nama, k.jenis, k.cc, k.tahun, k.bulanHarusBayar);
            }
        }
        System.out.println("--------------------------------------------------------------------------");
    }

}