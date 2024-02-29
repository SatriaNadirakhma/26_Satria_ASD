import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        Mahasiswa[] arrayOfInformasiMhs14 = new Mahasiswa[3];

        double total,rataRata;

        for (int i = 0; i < 3; i++) {
            arrayOfInformasiMhs14[i] = new Mahasiswa();
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama mahasiswa: ");
            arrayOfInformasiMhs14[i].nama = sc26.nextLine();
            System.out.print("Masukkan nim mahasiswa: ");
            arrayOfInformasiMhs14[i].nim = sc26.nextInt();
            System.out.print("Masukkan jenis kelamin Mahasiswa: ");
            arrayOfInformasiMhs14[i].jenisKelamin = sc26.next();
            System.out.print("Masukkan Ipk Mahasiswa: ");
            arrayOfInformasiMhs14[i].Ipk = sc26.nextDouble();

            sc26.nextLine();

        }
        System.out.println();
        System.out.println();

            for (int i = 0; i < 3; i++) {
                System.out.println("Mahasiswa ke-" + (i+1));
                System.out.println("Nama: " + arrayOfInformasiMhs14[i].nama);
                System.out.println("Nim: " + arrayOfInformasiMhs14[i].nim);
                System.out.println("Jenis kelamin: " + arrayOfInformasiMhs14[i].jenisKelamin);
                System.out.println("Ipk: " + arrayOfInformasiMhs14[i].Ipk);
    
            }
            total = 0;
            for (int i = 0; i < arrayOfInformasiMhs14.length; i++) {
                total = total+ arrayOfInformasiMhs14[i].Ipk;
            }
            rataRata = total / arrayOfInformasiMhs14.length;

            System.out.println("Rata-rata IPK Mahasiswa: " + rataRata);
        }
    }