package jobsheet6;

public class HotelService26 {
    Hotel26 rooms[] = new Hotel26[5];
    int idx;

    void tambah(Hotel26 h) {
        if (idx<rooms.length) {
            rooms[idx] = h;
            idx++;

        } else {
            System.out.println("Data Sudah Penuh!");

            }
        }

        void tampil(){
            for (Hotel26 h : rooms) {
                h.tampil();
                System.out.println("------------------------------------");
            }
        }

        void bubbleSort() {
            for (int i = 0; i < rooms.length - 1; i++) {
                for (int j = 1; j < rooms.length - i; j++) {
                    if (rooms[j].bintang > rooms[j-1].bintang) {
                        Hotel26 tmp = rooms[j];
                        rooms[j] = rooms [j - 1];
                        rooms[j - 1] = tmp;
                    }
                }
            }
        }

        void bubbleSort2() {
            for (int i = 0; i < rooms.length - 1; i++) {
                for (int j = 1; j < rooms.length - i; j++) {
                    if (rooms[j].harga < rooms[j - 1].harga) {
                        Hotel26 tmp = rooms[j];
                        rooms[j] = rooms[j - 1];
                        rooms[j - 1] = tmp;
                    }
                }
            }
        }

        void selectionSort() {
            for (int i = 0; i < rooms.length - 1; i++) {
                int idxMax = i; 
                for (int j = i + 1; j < rooms.length; j++) {
                    if (rooms[j].bintang > rooms[idxMax].bintang) { 
                    idxMax = j;
                    }
                }
            Hotel26 tmp = rooms[idxMax];
            rooms[idxMax] = rooms[i];
            rooms[i] = tmp;
            }
        }

        void selectionSort2() {
            for (int i = 0; i < rooms.length - 1; i++) {
                int idxMin = i; 
                for (int j = i + 1; j < rooms.length; j++) {
                    if (rooms[j].harga < rooms[idxMin].harga) {
                    idxMin = j;
                    }
                }
            
            Hotel26 tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
            }
        }   
}