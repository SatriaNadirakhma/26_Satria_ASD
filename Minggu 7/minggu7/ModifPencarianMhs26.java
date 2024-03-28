package minggu7;

import java.util.ArrayList;
import java.util.Arrays;

public class ModifPencarianMhs26 {
    Mahasiswa26 listMhs[] = new Mahasiswa26[5];
    int idx;

    void tambah(Mahasiswa26 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil() {
        for (Mahasiswa26 m : listMhs) {
            m.tampil();
            System.out.println("-------------------------------------------------------");
        }
    }

    public int[] FindBinarySearchNama(String cari) {
        ArrayList<Integer> positions = new ArrayList<>();
        for (int i = 0; i < idx; i++) {
            if (listMhs[i].nama.equalsIgnoreCase(cari)) {
                positions.add(i);
            }
        }
        int[] result = new int[positions.size()];
        for (int i = 0; i < positions.size(); i++) {
            result[i] = positions.get(i);
        }
        return result;
    }
}

