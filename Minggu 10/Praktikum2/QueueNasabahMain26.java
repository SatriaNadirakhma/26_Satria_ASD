package Praktikum2;

import java.util.Scanner;
public class QueueNasabahMain26 {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian paling belakang");
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc26.nextInt();
        QueueNasabah26 antri = new QueueNasabah26(jumlah);

        int pilih;

        do {
            menu();
            pilih = sc26.nextInt();
            sc26.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc26.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc26.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc26.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc26.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc26.nextDouble();
                    Nasabah26 nb = new Nasabah26(norek, nama, alamat, umur, saldo);
                    sc26.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                Nasabah26 data = antri.Dequeue();
                if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) 
                        && data.umur != 0 && data.saldo != 0) {
                    System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " 
                            + data.alamat + " " + data.umur + " " + data.saldo);
                    break;
                }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 | pilih == 4 || pilih == 5);
    }
}
