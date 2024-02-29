import java.util.Scanner;
public class PersegiPanjangDemo26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        PersegiPanjang26[] arrayOfPersegiPanjang = new PersegiPanjang26[3];
        int panjang, lebar;

        for (int i = 0; i < 3; i++) {

            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc26.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc26.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang26(panjang, lebar);

        }

        for (int i = 0; i < 3; i++) {
            arrayOfPersegiPanjang[i].cetakInfo();
        }
    }
}
