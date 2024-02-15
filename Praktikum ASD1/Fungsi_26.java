public class Fungsi_26 {
    
    static final int HARGA_AGLONEMA = 75000;
    static final int HARGA_KELADI = 50000;
    static final int HARGA_ALOCASIA = 60000;
    static final int HARGA_MAWAR = 10000;

    static int[][] stockBunga = {
            {10, 5, 15, 7}, //RoyalGarden1
            {6, 11, 9, 12}, //RoyalGarden2
            {2, 10, 10, 5}, //RoyalGarden3
            {5, 7, 12, 9}  //RoyalGarden4
    };

    public static void main(String[] args) {
        // Hitung pendapatan setiap cabang jika semua bunga habis terjual
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatanCabang = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatanCabang += stockBunga[i][j] * getHargaBunga(j);
                stockBunga[i][j] = 0; // Set stock bunga menjadi 0 karena semua terjual
            }
            System.out.println("Pendapatan Cabang " + (i + 1) + ": Rp " + pendapatanCabang);
        }

        // Tampilkan jumlah stock setiap jenis bunga pada cabang RoyalGarden
        System.out.println("\nJumlah Stock Setiap Jenis Bunga pada Cabang RoyalGarden:");
        for (int i = 0; i < stockBunga[0].length; i++) {
            int totalStock = 0;
            for (int j = 0; j < stockBunga.length; j++) {
                totalStock += stockBunga[j][i];
            }
            System.out.println(getNamaBunga(i) + ": " + totalStock);
        }

        // Pengurangan stock karena bunga mati
        int[][] totalBunga;
        stockBunga[0][0] -= 1; // Aglonema berkurang 1
        stockBunga[1][1] -= 2; // Keladi berkurang 2
        stockBunga[2][2] -= 0; // Alocasia tidak berkurang
        stockBunga[3][3] -= 5; // Mawar berkurang 5
    }

    // Fungsi untuk mendapatkan harga bunga berdasarkan indeks jenis bunga
    static int getHargaBunga(int index) {
        switch (index) {
            case 0:
                return HARGA_AGLONEMA;
            case 1:
                return HARGA_KELADI;
            case 2:
                return HARGA_ALOCASIA;
            case 3:
                return HARGA_MAWAR;
            default:
                return 0;
        }
    }

    // Fungsi untuk mendapatkan nama bunga berdasarkan indeks jenis bunga
    static String getNamaBunga(int index) {
        switch (index) {
            case 0:
                return "Aglonema";
            case 1:
                return "Keladi";
            case 2:
                return "Alocasia";
            case 3:
                return "Mawar";
            default:
                return "";
        }
    }
}
