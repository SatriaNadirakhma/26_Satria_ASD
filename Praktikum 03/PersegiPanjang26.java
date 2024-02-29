public class PersegiPanjang26 {
    int panjang;
    int lebar;

    public PersegiPanjang26(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public int hitungLuas(int p, int l) {
        return p*l;
    }
    
    public int hitungKeliling(int p, int l) {
        return 2*(p+l);
    }

    public void cetakInfo() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + hitungLuas(panjang, lebar));
        System.out.println("Keliling: " + hitungKeliling(panjang, lebar));
    }
}