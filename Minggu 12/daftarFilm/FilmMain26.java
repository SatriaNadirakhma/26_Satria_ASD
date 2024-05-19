package daftarFilm;
import java.util.Scanner;

public class FilmMain26 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedListFilm26 data = new DoubleLinkedListFilm26();

        int pilihan = 0;
        int filmID, cari, indeks = 0;
        String judul;
        double rating;

        while (true) {
            System.out.println("================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Indeks Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("================================");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.print("ID Film: ");
                    filmID = sc.nextInt();
                    System.out.print("Judul Film: ");
                    judul = sc.next();
                    System.out.print("Rating Film: ");
                    rating = sc.nextDouble(); 

                    data.AddFirst(filmID, judul, rating);
                    break;
                
                case 2:
                    System.out.println("Masukkan Data Posisi Akhir");
                    System.out.print("ID Film:");
                    filmID = sc.nextInt();
                    System.out.print("Judul Film: ");
                    judul = sc.next();
                    System.out.print("Rating Film: ");
                    rating = sc.nextDouble();

                    data.AddLast(filmID, judul, rating);
                    break;

                case 3:
                    System.out.println("Masukkan Data Posisi Akhir");
                    System.out.print("ID Film:");
                    filmID = sc.nextInt();
                    System.out.print("Judul Film: ");
                    judul = sc.next();
                    System.out.print("Rating Film: ");
                    rating = sc.nextDouble();
                    System.out.print("Data film ini akan masuk di urutan ke-");
                    indeks = sc.nextInt();
                    data.Add(filmID, judul, rating, indeks);
                    break;

                case 4:

                    break;
                
                case 5:

                    break;
                
                case 6:

                    break;
                
                case 7:
                    data.print();
                    break;

                case 8:
                    System.out.println("Cari Data");
                    System.out.print("Masukkan ID Film yang dicari: ");
                    cari = sc.nextInt();
                    Film26 hasil = data.cariFilm(cari);

                    if (hasil != null) {
                        System.out.println("    ID Film = " +hasil.filmID);
                        System.out.println("    Judul Film = " +hasil.judul);
                        System.out.println("    Rating = " +hasil.rating);
                    } else {
                        System.out.println("Film dengan ID " + cari + " tidak ditemukan");
                    }
                    break;

                case 9:
                    
                    break;

                case 10:
                    System.out.println("Terima Kasih");
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
