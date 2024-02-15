public class Tugas1_26 {
    public static void main(String[] args) {
        // Array pertama berisi kode plat mobil
        char[] KODE = {'L', 'M', 'N', 'P', 'S', 'W', 'A', 'G', 'G', 'H'};

        // Array kedua berisi nama kota per huruf yang berpasangan dengan kode plat mobil
        char[][] KOTA = {
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'D', 'U', 'R', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'B', 'A', 'N', 'Y', 'U', 'W', 'A', 'N', 'G', 'I'},
            {'J', 'O', 'M', 'B', 'A', 'N', 'G'},
            {'G', 'R', 'E', 'S', 'I', 'K'},
            {'M', 'A', 'D', 'I', 'U', 'N'},
            {'B', 'L', 'I', 'T', 'A', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'}
        };

        // Menampilkan isi dari array KODE dan KOTA
        System.out.println("Isi dari array KODE:");
        for (char kode : KODE) {
            System.out.print(kode + " ");
        }
        System.out.println("\n");

        System.out.println("Isi dari array KOTA:");
        for (int i = 0; i < KOTA.length; i++) {
            for (int j = 0; j < KOTA[i].length; j++) {
                System.out.print(KOTA[i][j]);
            }
            System.out.println();
        }
    }
}

