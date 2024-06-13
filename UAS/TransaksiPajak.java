import java.util.Scanner;

public class TransaksiPajak {
    int kode;
    long nominalBayar;
    long denda;
    int bulanBayar;
    Kendaraan kendaraan;

    private static TransaksiPajak[] transaksiList = new TransaksiPajak[100]; // Misalkan kita batasi array untuk menyimpan transaksi

    private static int transaksiCount = 0;

    public TransaksiPajak(int kode, long nominalBayar, long denda, int bulanBayar, Kendaraan kendaraan) {
        this.kode = kode;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.kendaraan = kendaraan;

    }

    public void bayarPajak() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("Masukkan Data Pembayaran");
        System.out.println("------------------------");

        System.out.print("Masukkan Nomor TNBK: ");
        String noTNBK = sc.nextLine();
        System.out.println("Masukkan Bulan Bayar: ");
        int bulanBayar = sc.nextInt();

    }

    public void tampilTransaksi() {

    }
}
