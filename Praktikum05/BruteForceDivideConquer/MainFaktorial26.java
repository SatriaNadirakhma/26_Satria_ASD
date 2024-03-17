package BruteForceDivideConquer;
import java.util.Scanner;
public class MainFaktorial26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.println();
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = sc26.nextInt();

        Faktorial26 [] fk = new Faktorial26[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial26();
            System.out.print("Masukkan nilai data ke-" + (i+1) + " : ");
            fk[i].nilai = sc26.nextInt();
        }

        System.out.println();
        System.out.println("Hasil faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println();
        System.out.println("Hasil faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println();
    }
}
