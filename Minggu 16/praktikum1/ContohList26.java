package praktikum1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContohList26 {
    public static void main(String[] args) {
        
        List<Object> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add("Cireng");
        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n", 
            l.get(0), l.size(), l.get(l.size() - 1));
        
        l.add(4);
        l.remove(0);
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n", 
        l.get(0), l.size(), l.get(l.size() - 1));

        //Modifikasi Nomor 2
        List<Integer> angka = new ArrayList<>();
        angka.add(1);
        angka.add(2);
        angka.add(3);
        angka.add(4);
        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n", 
            l.get(0), l.size(), l.get(l.size() - 1));
        
        l.add(5);
        l.remove(2);
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n", 
        l.get(0), l.size(), l.get(l.size() - 1));

        LinkedList<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");

        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
            names.get(0), names.size(), names.get(names.size() - 1));
        names.set(0, "My Kid");
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
            names.get(0), names.size(), names.get(names.size() - 1));
        System.out.println("Names: " + names.toString());

        //modifikasi nomor 4
        names.push("Mei-mei");
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
            names.get(0), names.size(), names.get(names.size() - 1));
        System.out.println("Names: " + names.toString());
        
    }
    
}