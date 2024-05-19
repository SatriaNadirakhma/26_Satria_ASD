package daftarFilm;

public class DoubleLinkedListFilm26 {
    Film26 head;
    int size;

    public DoubleLinkedListFilm26() {
        head = null;
        size = 0;
    }

    public boolean IsEmpty() {
        return head == null;
    }

    public void AddFirst(int filmID, String judul, double rating) {
        if (IsEmpty()) {
            head = new Film26(filmID, judul, rating, null, null);
        } else {
            Film26 newNode = new Film26(filmID, judul, rating, null, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void AddLast(int filmID, String judul, double rating) {
        if (IsEmpty()) {
            AddFirst(filmID, judul, rating);
        } else {
            Film26 current = head;
            
            while (current.next != null) {
                current = current.next;
            }
            
            Film26 newNode = new Film26(filmID, judul, rating, current, null);
            current.next = newNode;
            size++;
        }
    }

    public void Add(int filmID, String judul, double rating, int index) throws Exception {
        if (IsEmpty()) {
            AddFirst(filmID, judul, rating);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index diluar batas");
        } else {
            Film26 current = head;
            int i = 0;

            while (i < index) {
                current = current.next;
                i++;
            }

            if (current.prev == null) {
                Film26 newNode = new Film26(filmID, judul, rating, null, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Film26 newNode = new Film26(filmID, judul, rating, current.prev, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public void print() {
        if (IsEmpty()) {
            Film26 tmp = head;

            while (tmp != null) {
                System.out.println("ID Film: " +tmp.filmID);
                System.out.println("Judul Film: " +tmp.judul);
                System.out.println("Rating: " +tmp.rating);

                tmp = tmp.next;
            }
        } else {
            System.out.println("Daftar Film Masih Kosong");
        }
    }

    public Film26 cariFilm(int cari) {
        Film26 current = head;

        while (current != null) {
            if (current.filmID == cari) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}
