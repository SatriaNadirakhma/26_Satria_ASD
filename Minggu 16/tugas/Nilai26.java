package tugas;

public class Nilai26 {
    Mahasiswa26 mahasiswa;
    MataKuliah26 matakuliah;
    double nilai;

    public Nilai26(Mahasiswa26 mahasiswa, MataKuliah26 matakuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
        this.nilai = nilai;
    }

    public Mahasiswa26 getMahasiswa() {
        return mahasiswa;
    }

    public MataKuliah26 getMatakuliah() {
        return matakuliah;
    }

    public double getNilai() {
        return nilai;
    }

    @Override

    public String toString() {
        return "| " + mahasiswa.getNim() + "\t| " + mahasiswa.getNama() + "\t\t| " +
                matakuliah.getNamaMatkul() + "\t| " + matakuliah.getSks() + "\t| " +
                nilai + "\t|";
    }
}
