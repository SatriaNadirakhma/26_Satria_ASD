package daftarFilm;

public class Film26 {
    int filmID;
    String judul;
    double rating;
    Film26 prev, next;

    Film26(int filmID, String judul, double rating, Film26 prev, Film26 next) {
            this.filmID = filmID;
            this.judul = judul;
            this.rating = rating;
            this.prev = prev;
            this.next = next;
        }
}
