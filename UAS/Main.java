import java.util.Scanner;

public class Main {

    private static Kendaraan[] kendaraanList = Kendaraan.daftarKendaraan();

    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        int pilihan = 0;

        do {
            System.out.println("**********************");
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi Berdasar nama pemilik");
            System.out.println("5. Keluar");
            System.out.print("Pilih(1-5):");
            pilihan = sc26.nextInt();

            switch (pilihan) {
                case 1:
                    Kendaraan.tampilDaftarKendaraan(kendaraanList);
                    break;
                
                case 2:
                    transaksi.bayarPajak();
                    break;

                case 3:
                System.out.println("------------------------");
                System.out.println("Daftar Transaksi Pembayaran Pajak");
                System.out.println("------------------------");
                    
                    
                    break;

                case 4:
                    
                    break;
                
                case 5:
                    System.exit(0);
                    break;
            
                default:
                    System.out.println("********************");
                    System.out.println("Pilih pilihan yang tersedia");
                    System.out.println("********************");
                    break;
            }

        } while (pilihan != 6);
    }
}
