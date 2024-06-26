import java.util.Scanner;

public class MainCollectionHandphone_26 {
    public static void main(String[] args) {
        HandphoneCollection_26 collection = new HandphoneCollection_26();
        collection.add(new Handphone_26("8090123", "S23 Ultra", "Samsung", "Android"));
        collection.add(new Handphone_26("8090124", "13 Pro Max", "iPhone", "iOS"));
        collection.add(new Handphone_26("8090125", "Xperia 1", "Sony", "Android"));
        collection.add(new Handphone_26("8090125", "Note 40 Pro", "Infinix", "Android"));

        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambahkan Handphone");
            System.out.println("2. Hapus Handphone");
            System.out.println("3. Pilih Handphone");
            System.out.println("4. Tampilkan Seluruh Handphones");
            System.out.println("5. Keluar");
            System.out.print("Masukkan Pilihan (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("IMEI: ");
                    String imei = scanner.nextLine();
                    System.out.print("Merk: ");
                    String merk = scanner.nextLine();
                    System.out.print("Brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Operating System: ");
                    String operatingSystem = scanner.nextLine();
                    collection.add(new Handphone_26(imei, merk, brand, operatingSystem));
                    break;
                case 2:
                    System.out.print("Masukkan IMEI Handphone: ");
                    imei = scanner.nextLine();
                    collection.delete(imei);
                    break;
                case 3:
                    System.out.print("Masukkan IMEI Handphone: ");
                    imei = scanner.nextLine();
                    Handphone_26 handphone = collection.get(imei);
                    if (handphone != null) {
                        System.out.println(handphone);
                    } else {
                        System.out.println("Handphone tidak tersedia!");
                    }
                    break;
                case 4:
                    collection.printAll();
                    break;
                case 5:
                    System.out.println("Terima Kasih...");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia, pilih pilihan yang tertera!");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
