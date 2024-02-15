import java.util.Scanner;

public class Perulangan_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan Nomor Induk Mahasiswa: ");
        String nomorIndukMahasiswa = input.nextLine();
        
        int n = Integer.parseInt(nomorIndukMahasiswa.substring(nomorIndukMahasiswa.length() - 2));
        
        System.out.println("Deretan Bilangan:");
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                System.out.print(" ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}
