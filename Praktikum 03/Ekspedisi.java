public class Ekspedisi {
    public String namaPenerima;
    public double panjang;
    public double lebar;
    public double tinggi;
    
    public Ekspedisi() {
    
    }
    
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
    
}
