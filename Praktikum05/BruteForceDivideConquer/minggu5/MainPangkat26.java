package BruteForceDivideConquer;
import java.util.Scanner;
public class MainPangkat26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner (System.in);
        System.out.println();
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc26.nextInt();

        Pangkat26 [] png = new Pangkat26[elemen];

        for (int i = 0; i < elemen; i++) {
            png [i] = new Pangkat26();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            png [i].nilai = sc26.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            png [i].pangkat = sc26.nextInt();
        }

        System.out.println();
        System.out.println("Hasil pangkat dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " +png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }

        System.out.println();
        System.out.println("Hasil pangkat dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " +png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }

        System.out.println();
    }
}
