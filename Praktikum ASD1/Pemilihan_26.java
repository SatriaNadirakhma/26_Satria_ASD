import java.util.Scanner;

public class Pemilihan_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hasil Nilai Akhir Mahasiswa Semester 1");
        System.out.println("======================================");
        System.out.println("Nama  : Satria Rakhmadani");
        System.out.println("Kelas : SIB 1E");
        System.out.println("NIM   : 2341760106");
        System.out.println("======================================");

        System.out.print("Masukkan nilai tugas: ");
        int nilaiTugas = input.nextInt();
        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("nilai tidak valid");
            return;
        }

        System.out.print("Masukkan nilai kuis: ");
        int nilaiKuis = input.nextInt();
        if (nilaiKuis < 0 || nilaiKuis > 100) {
            System.out.println("nilai tidak valid");
            return;
        }

        System.out.print("Masukkan nilai UTS: ");
        int nilaiUTS = input.nextInt();
        if (nilaiUTS < 0 || nilaiUTS > 100) {
            System.out.println("nilai tidak valid");
            return;
        }

        System.out.print("Masukkan nilai UAS: ");
        int nilaiUAS = input.nextInt();
        if (nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("nilai tidak valid");
            return;
        }

        //Persentase : Tugas 20%, Kuis 20%, UTS 30%, UAS 40%
        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

        System.out.println("Nilai Akhir: " + nilaiAkhir);

        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        System.out.println("Nilai Huruf: " + nilaiHuruf);

        if (nilaiHuruf == "A" || nilaiHuruf == "B" || nilaiHuruf == "C") {
            System.out.println("LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }
    }
}
