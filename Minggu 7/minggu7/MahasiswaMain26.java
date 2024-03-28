package minggu7;

import java.util.Scanner;
public class MahasiswaMain26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc26.nextInt();

        PencarianMhs26 data = new PencarianMhs26();

        System.out.println("-------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("-------------------------------------------------------");
            System.out.print("Nim\t : ");
            int nim = sc26.nextInt();
            System.out.print("Nama\t : ");
            String nama = sc26.nextLine();
            System.out.print("Umur\t : ");
            int umur = sc26.nextInt();
            System.out.print("IPK\t : ");
            double ipk = sc26.nextDouble();

            Mahasiswa26 m = new Mahasiswa26(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println();
        System.out.println("Data keseluruhan Majasiswa : ");
        data.tampil();

        System.out.println("____________________________________________");
        System.out.println("____________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan NIM Mahasiswa yang dicari: ");
        System.out.print("NIM : ");
        int cari = sc26.nextInt();
        System.out.println("Menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);

        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("===========================================");
        System.out.println("Menggunakan binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}