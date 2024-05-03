package Praktikum09;

public class MainPoint26 {
    public static void main(String[] args) {
        LinkedListPoint26 hunt = new LinkedListPoint26();

        // Add points to the scavenger hunt
        hunt.addPoint("Siapa bapak pendidikan Indonesia", "Ki Hajar Dewantara");
        hunt.addPoint("Gedung terkenal dan menjadi ikon di kota Bandung", "Gedung Sate");
        hunt.addPoint("Apa nama brand yang menemani editor dalam kreatifitas mereka?", "Adobe");

        // Start the scavenger hunt
        hunt.startHunt();
    }
}