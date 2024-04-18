import java.util.Scanner;
public class MainTransaksi26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner (System.in);

        Rekening26[] daftarRekening = Rekening26.inputDataRekening();
        Transaksi26[] daftarTransaksi = Transaksi26.inputDataTransaksi();

        int pilihan;
        do {
            System.out.println("1. Tampil data rekening");
            System.out.println("2. Tampil data transaksi");
            System.out.println("3. Mencari saldo > 500000");
            System.out.println("4. Sorting by name");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5): ");
            pilihan = sc26.nextInt();

            switch (pilihan) {
                case 1: 
                    Rekening26.tampilDataRekening(daftarRekening);
                    break;
                case 2: 
                    Transaksi26.tampilDataTransaksi(daftarTransaksi);
                    break;
                case 3: 
                    cariSaldoLebihDari500000(daftarTransaksi);
                    break;
                case 4: 
                    sortingByName(daftarRekening);
                    break;
                case 5:
                    System.exit(pilihan);
                default:
                    break;
            }
        } while (pilihan != 5);
}
    private static void cariSaldoLebihDari500000(Transaksi26[] daftarTransaksi) {
        System.out.println("Data Transaksi dengan Saldo Lebih dari 500000:");
        for (Transaksi26 transaksi : daftarTransaksi) {
            if (transaksi.saldo > 500000) {
                System.out.println(transaksi.saldo + transaksi.saldoAwal + transaksi.saldoAkhir + transaksi.tanggalTransaksi);
                System.out.println();
            }
        }
    }
    
    private static void sortingByName(Rekening26[] daftarRekening) {
        System.out.println("Data Rekening Diurutkan berdasarkan Nama:");
        for (int i = 0; i < daftarRekening.length - 1; i++) {
            for (int j = i + 1; j < daftarRekening.length; j++) {
                if (daftarRekening[i].nama.compareTo(daftarRekening[j].nama) > 0) {
                    Rekening26 temp = daftarRekening[i];
                    daftarRekening[i] = daftarRekening[j];
                    daftarRekening[j] = temp;
                }
            }
        }    
    }
}
