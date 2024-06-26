public class Handphone_26 {
    String imei;
    String merk;
    String brand;
    String operatingSystem;

    public Handphone_26() {}

    public Handphone_26(String imei, String merk, String brand, String operatingSystem) {
        this.imei = imei;
        this.merk = merk;
        this.brand = brand;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Handphone{" +
                "imei='" + imei + '\'' +
                ", merk='" + merk + '\'' +
                ", brand='" + brand + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
