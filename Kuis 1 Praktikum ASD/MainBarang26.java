import java.util.Scanner;
public class MainBarang26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner (System.in);

        Barang26[] barangs = {
            new Barang26("K01" , "Sabun", 1000, 5),
            new Barang26("K02" , "Pasta Gigi", 2000, 10),
            new Barang26("K03" , "Biore", 3000, 23),
            new Barang26("K04" , "Shampoo", 4000, 55),
            new Barang26("K05" , "Sikat Gigi", 5000, 65),
        };

        TransaksiBarang26 transaksiBarang = new TransaksiBarang26(barangs);

        System.out.println("======================");
        System.out.println("TOKO SAHABAT SEJAHTERA");
        System.out.println("======================");
        System.out.println(" ");

        while (true) {
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilkan Pembelian");
            System.out.println("4. Keluar");
            System.out.print("Pilih[1-4]: ");
            int pilihan = sc26.nextInt();

            switch (pilihan) {
                case 1:
                transaksiBarang.tampilkanBarang();
                    break;

                case 2:
                do {
                    System.out.println("Masukkan Kode Barang: ");
                    String kode = sc26.next();
                    System.out.println("Apakah akan belanja kembali (Y/N): ");
                } while (sc26.next().equalsIgnoreCase("Y"));
                    break;

                case 3:
                transaksiBarang.tampilkanPembelian();
                    break;

                case 4:
                    System.out.println("PEMBELIAN BERHASIL, TERIMA KASIH SUDAH BERBELANJA");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid");;
            }
        }
    }
}
