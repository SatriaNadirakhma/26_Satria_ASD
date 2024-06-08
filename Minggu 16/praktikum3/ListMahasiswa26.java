package praktikum3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa26 {

    List<Mahasiswa26> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa26... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa26 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    //int linearSearch(String nim) {
    //  for (int i = 0; i < mahasiswas.size(); i++) {
    //        if (nim.equals(mahasiswas.get(i).nim)) {
    //            return i;
    //        }
    //    }
    //    return -1;
    //}

    int binarySearch(String nim) {
        Collections.sort(mahasiswas, Comparator.comparing(m -> m.nim));
        int index = Collections.binarySearch(mahasiswas, new Mahasiswa26(nim, "", ""), Comparator.comparing(m -> m.nim));
        return index;
    }

    public void sortAscending() {
        Collections.sort(mahasiswas, Comparator.comparing(m -> m.nim));
    }

    public void sortDescending() {
        Collections.sort(mahasiswas, Comparator.comparing((Mahasiswa26 m) -> m.nim).reversed());
    }

    public static void main(String[] args) {
        ListMahasiswa26 lm = new ListMahasiswa26();
        Mahasiswa26 m = new Mahasiswa26("201234", "Noureen", "021xx1");
        Mahasiswa26 m1 = new Mahasiswa26("201235", "Akhleema", "021xx2");
        Mahasiswa26 m2 = new Mahasiswa26("201236", "Shannum", "021xx3");
        //menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        //menampilkan list mahasiswa
        lm.tampil();
        //update mahasiswa
        lm.update(lm.binarySearch("201235"), new Mahasiswa26("201235", "Akhleema", "021xx2"));
        System.out.println("");
        lm.tampil();

        //sorting asc
        lm.sortAscending();
        System.out.println("Setelah sorting ascending:");
        lm.tampil();

        //sorting desc
        lm.sortDescending();
        System.out.println("Setelah sorting descending:");
        lm.tampil();
    }
}
