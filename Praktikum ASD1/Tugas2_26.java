import java.util.Scanner;

public class Tugas2_26 {
    static int kecepatan(int s, int t) {
        return s / t;
    }

    static int jarak(int v, int t) {
        return v * t;
    }

    static int waktu(int s, int v) {
        return s / v;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("======================");
        System.out.print("Masukkan Kecepatan = " );
        int v = input.nextInt();
        System.out.println("======================");

        System.out.println("======================");
        System.out.print("Masukkan Jarak = " );
        int s = input.nextInt();
        System.out.println("======================");

        System.out.println("======================");
        System.out.print("Masukkan Waktu = " );
        int t = input.nextInt();
        System.out.println("======================");

        System.out.println("======================");
        int hitungKecepatan = kecepatan(s, t);
        System.out.println("Hasil Kecepatan Adalah " + kecepatan(s, t));
        System.out.println("======================");
        int hitungJarak = jarak(v, t);
        System.out.println("Hasil Jarak Adalah " + jarak(v, t));
        System.out.println("======================");
        int hitungWaktu = waktu(s, v);
        System.out.println("Hasil Waktu Adalah " + waktu(s, v));
        System.out.println("======================");
    }
}
