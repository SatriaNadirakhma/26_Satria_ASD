package tugas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main26 {
    static Scanner sc26 = new Scanner(System.in);

    static List<MataKuliah26> daftarMatakuliah = new ArrayList<>();
    static List<Mahasiswa26> daftarMahasiswa = new ArrayList<>();

    public static void main(String[] args) {

        tambahMatakuliah(new MataKuliah26("ASD", "Algoritma Struktur Data", 5));
        tambahMatakuliah(new MataKuliah26("BSD", "Basis Data", 6));
        tambahMatakuliah(new MataKuliah26("MTK", "Matematika Lanjut", 2));
        tambahMatakuliah(new MataKuliah26("SISOP", "Sistem Operasi", 1));

        tambahMahasiswa(new Mahasiswa26("23411", "Afril", "08123"));
        tambahMahasiswa(new Mahasiswa26("23412", "Alfin", "08124"));
        tambahMahasiswa(new Mahasiswa26("23413", "Annisa", "0815"));
        tambahMahasiswa(new Mahasiswa26("23414", "Aqil", "0816"));

        int pilihan = 0;

        do {
            System.out.println("************************************************************************");
            System.out.println("                SISTEM PENGOLAHAN DATA NILAI MAHASISWA");
            System.out.println("************************************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.println("************************************************************************");
            System.out.print("pilih : ");
            pilihan = sc26.nextInt();

            switch (pilihan) {
                case 1:
                    inputNilai();
                    break;

                case 2:
                    tampilNilai();
                    break;

                case 3:
                    cariNilaiMahasiswa();
                    break;

                case 4:
                    urutDataNilai();
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("************************************************************************");
                    System.out.println("                      Masukkan Pilihan Yang Benar");
                    System.out.println("************************************************************************");
                    break;
            }

        } while (pilihan != 6);
    }

    static void inputNilai() {

        tampilMatakuliah();

        System.out.print("Masukkan Kode Matakuliah    : ");
        String kodeMatkul = sc26.next();
        MataKuliah26 matakuliah = cariMatakuliahByKode(kodeMatkul);

        tampilMahasiswa();

        if (matakuliah != null) {
            System.out.print("Masukkan NIM Mahasiswa      : ");
            String nimMahasiswa = sc26.next();
            Mahasiswa26 mahasiswa = cariMahasiswaByNIM(nimMahasiswa);
            if (mahasiswa != null) {
                System.out.print("Masukkan Nilai              : ");
                double nilai = sc26.nextDouble();

                Nilai26 nilaiObjek = new Nilai26(mahasiswa, matakuliah, nilai);
                mahasiswa.tambahNilai(nilaiObjek);
                System.out.println("Nilai berhasil diinputkan untuk Mahasiswa " + mahasiswa.getNama());
            } else {
                System.out.println("Mahasiswa dengan NIM " + nimMahasiswa + " tidak ditemukan.");
            }
        } else {
            System.out.println("Matakuliah dengan kode " + kodeMatkul + " tidak ditemukan.");
        }

    }

    static void tampilNilai() {

        tampilMahasiswa();

        System.out.print("Masukkan NIM Mahasiswa      : ");
        String nimMahasiswa = sc26.next();
        Mahasiswa26 mhs = cariMahasiswaByNIM(nimMahasiswa);

        if (mhs != null) {

            System.out.println("************************************************************************");
            System.out.println("| NIM\t| Nama Mahasiswa\t| Mata Kuliah\t\t| SKS\t| Nilai\t|");

            for (Nilai26 nilai : mhs.getNilaiList()) {
                System.out.println(nilai);
            }

            System.out.println("-------------------------------------------------------------------------");

        } else {
            System.out.println("Mahasiswa dengan NIM " + nimMahasiswa + " tidak ditemukan.");
        }

    }

    static void tampilMahasiswa() {

        System.out.println("************************************************************************");
        System.out.println("| NIM\t\t\t| Nama Mahasiswa\t\t| Nomor\t\t\t|");
        System.out.println("************************************************************************");

        for (Mahasiswa26 mhs : daftarMahasiswa) {
            System.out.println(mhs);
        }

        System.out.println("************************************************************************");

    }

    static void tampilMatakuliah() {
        System.out.println("************************************************************************");
        System.out.println("| kode\t| Nama Matkul\t\t\t\t| SKS\t|");
        System.out.println("************************************************************************");

        for (MataKuliah26 matkul : daftarMatakuliah) {
            System.out.println(matkul);
        }
        System.out.println("************************************************************************");
    }

    static MataKuliah26 cariMatakuliahByKode(String kode) {

        for (MataKuliah26 matkul : daftarMatakuliah) {
            if (matkul.getKode().equals(kode)) {
                return matkul;
            }
        }
        return null;

    }

    static Mahasiswa26 cariMahasiswaByNIM(String nim) {

        for (Mahasiswa26 mhs : daftarMahasiswa) {
            if (mhs.getNim().equals(nim)) {
                return mhs;
            }
        }
        return null;

    }

    static void cariNilaiMahasiswa() {

        tampilMahasiswa();

        System.out.print("Masukkan NIM Mahasiswa      : ");
        String nim = sc26.next();

        Mahasiswa26 mahasiswa = cariMahasiswaByNIM(nim);

        if (mahasiswa != null) {

            System.out.println("************************************************************************");
            System.out.println("| NIM\t| Nama Mahasiswa\t| Mata Kuliah\t\t| SKS\t| Nilai\t|");
            System.out.println("************************************************************************");
            
            for (Nilai26 nilai : mahasiswa.getNilaiList()) {
                System.out.println(nilai);
            }

            System.out.println("************************************************************************");
        
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }

    }

    static void urutDataNilai() {

        List<Nilai26> semuaNilai = new ArrayList<>();

        for (Mahasiswa26 mhs : daftarMahasiswa) {
            semuaNilai.addAll(mhs.getNilaiList());
        }

        Collections.sort(semuaNilai, new Comparator<Nilai26>() {
            @Override
            public int compare(Nilai26 n1, Nilai26 n2) {
                return Double.compare(n2.getNilai(), n1.getNilai());
            }
        });

        System.out.println("************************************************************************");
        System.out.println("| NIM\t| Nama Mahasiswa\t| Mata Kuliah\t\t| SKS\t| Nilai\t|");
        System.out.println("************************************************************************");

        for (Nilai26 nilai : semuaNilai) {
            System.out.println(nilai);
        }

        System.out.println("************************************************************************");

    }


    static void tambahMatakuliah(MataKuliah26 matkul) {
        daftarMatakuliah.add(matkul);
    }

    static void tambahMahasiswa(Mahasiswa26 mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }
}