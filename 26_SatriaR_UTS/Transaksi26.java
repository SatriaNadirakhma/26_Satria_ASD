public class Transaksi26 {
    double saldo;
    double saldoAwal;
    double saldoAkhir;
    String tanggalTransaksi;
    String type;

    public Transaksi26 (double a, double b, double c, String d, String e) {
        this.saldo = a;
        this.saldoAwal = b;
        this.saldoAkhir = c;
        this.tanggalTransaksi = d;
        this.type = e;
    }

    public static Transaksi26[] inputDataTransaksi() {
        Transaksi26[] dataTransaksi = new Transaksi26[19];
        dataTransaksi[0] = new Transaksi26(898214,494048,3587,"2021-03-09 07:54:42","");
        dataTransaksi[1] = new Transaksi26(205420,200162,775880,"2021-06-25 10:23:00","");
        dataTransaksi[2] = new Transaksi26(838632,350929,328316,"2021-09-18 23:00:04","");
        dataTransaksi[3] = new Transaksi26(230659,204434,690503,"2022-02-02 19:10:34","");
        dataTransaksi[4] = new Transaksi26(770592,334245,444267,"2020-08-11 13:36:56","");
        dataTransaksi[5] = new Transaksi26(685302,451002,376442,"2020-05-23 07:34:53","");
        dataTransaksi[6] = new Transaksi26(816129,851403,597842,"2021-07-18 19:41:20","");
        dataTransaksi[7] = new Transaksi26(989609,333823,802752,"2022-02-01 01:13:11","");
        dataTransaksi[8] = new Transaksi26(297103,396116,779589,"2021-07-03 01:09:49","");
        dataTransaksi[9] = new Transaksi26(66190,259150,619774,"2021-09-09 03:57:30","");
        dataTransaksi[10] = new Transaksi26(234301,278309,547922,"2021-08-24 13:18:39","");
        return dataTransaksi;
    }

    public static void tampilDataTransaksi(Transaksi26[] daftarTransaksi) {
        System.out.println("Data Transaksi:");
        for (Transaksi26 transaksi : daftarTransaksi) {
            System.out.println(transaksi.saldo + transaksi.saldoAwal + transaksi.saldoAkhir + transaksi.tanggalTransaksi);
            System.out.println();
        }
    }
}
