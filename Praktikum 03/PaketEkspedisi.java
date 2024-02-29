import java.util.Scanner;

public class PaketEkspedisi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ekspedisi[] arrayOfPaket = new Ekspedisi[3];

        for (int i = 0; i < 3; i++) {
            arrayOfPaket[i] = new Ekspedisi();
            System.out.println("Masukkan data paket ekspedisi ke-" + (i + 1));
            System.out.print("Masukkan nama penerima: ");
            arrayOfPaket[i].namaPenerima = scanner.nextLine();
            System.out.print("Masukkan panjang paket: ");
            arrayOfPaket[i].panjang = scanner.nextDouble();
            System.out.print("Masukkan lebar paket: ");
            arrayOfPaket[i].lebar = scanner.nextDouble();
            System.out.print("Masukkan tinggi paket: ");
            arrayOfPaket[i].tinggi = scanner.nextDouble();

            scanner.nextLine(); // membersihkan buffer
        }

        System.out.println("\nData Paket Ekspedisi:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Paket ke-" + (i + 1));
            System.out.println("Nama Penerima: " + arrayOfPaket[i].namaPenerima);
            System.out.println("Panjang: " + arrayOfPaket[i].panjang);
            System.out.println("Lebar: " + arrayOfPaket[i].lebar);
            System.out.println("Tinggi: " + arrayOfPaket[i].tinggi);
            System.out.println("Volume: " + arrayOfPaket[i].hitungVolume() + " cm^3");
        }
    }
}
