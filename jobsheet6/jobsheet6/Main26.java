package jobsheet6;
import java.util.Scanner;
public class Main26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);

        DaftarMahasiswaBerprestasi26 list = new DaftarMahasiswaBerprestasi26();
        Mahasiswa26 m1 = new Mahasiswa26("Upin", 2010, 10, 3.5);
        Mahasiswa26 m2 = new Mahasiswa26("Ipin", 2010, 10, 3.5);
        Mahasiswa26 m3 = new Mahasiswa26("Ehsan", 2011, 11, 3.4);
        Mahasiswa26 m4 = new Mahasiswa26("Fizi", 2012, 10, 3.3);
        Mahasiswa26 m5 = new Mahasiswa26("Susanti", 2013, 11, 3.9);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan IPK");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc selection berdasarkan ipk");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc insertion berdasarkan ipk");
        list.insertionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc insertion berdasarkan ipk");
        list.insertionSortDescending();
        list.tampil();
    }
}
