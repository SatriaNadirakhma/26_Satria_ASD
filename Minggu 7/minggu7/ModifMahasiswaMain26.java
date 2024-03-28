package minggu7;

import java.util.Scanner;

public class ModifMahasiswaMain26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = scanner.nextInt();

        ModifPencarianMhs26 data = new ModifPencarianMhs26();

        System.out.println("-------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("-------------------------------------------------------");
            System.out.print("Nim\t : ");
            int nim = scanner.nextInt();
            scanner.nextLine(); // membersihkan buffer
            System.out.print("Nama\t : ");
            String nama = scanner.nextLine();
            System.out.print("Umur\t : ");
            int umur = scanner.nextInt();
            System.out.print("IPK\t : ");
            double ipk = scanner.nextDouble();

            Mahasiswa26 m = new Mahasiswa26(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println();
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("____________________________________________");
        System.out.println("____________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        scanner.nextLine(); // membersihkan buffer
        System.out.print("Nama : ");
        String cari = scanner.nextLine();

        System.out.println("Menggunakan binary Search");
        int[] posisi = data.FindBinarySearchNama(cari);
        if (posisi.length == 0) {
            System.out.println("Data dengan nama " + cari + " tidak ditemukan.");
        } else {
            System.out.println("Data dengan nama " + cari + " ditemukan pada indeks:");
            for (int idx : posisi) {
                System.out.println(idx);
            }
            if (posisi.length > 1) {
                System.out.println("Peringatan: Ada lebih dari satu hasil yang ditemukan!");
            }
        }
    }
}