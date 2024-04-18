public class Rekening26 {
    String noRekening;
    String nama;
    String namaIbu;
    String phone;
    String email;

    public Rekening26 (String a, String b, String c, String d, String e) {
        this.noRekening = a;
        this.nama = b;
        this.namaIbu = c;
        this.phone = d;
        this.email = e;
    }

    public static Rekening26[] inputDataRekening() {
        Rekening26[] dataRekening = new Rekening26[19];
        dataRekening[0] = new Rekening26("16030927 3084", "Wallace", "Chase Castro", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu");
        dataRekening[1] = new Rekening26("16100617 0573", "Darius", "Julian Daniel", "1-357-843-0547", "nec@lectusjusto.org");
        dataRekening[2] = new Rekening26("16240401 2243", "Fuller", "Finn Dunlap", "571-7062", "convallis@Vestibulumanteipsum.org");
        dataRekening[3] = new Rekening26("16270525 0112","Malcolm","Keane Floyd","623-0234","porttitor.tellus.non@Curabitur.ca");
        dataRekening[4] = new Rekening26("16971204 2416","Geoffrey","Stephen Pratt","1-683-416-8323","ut.pellentesque@luctusutpellentesque.com");
        dataRekening[5] = new Rekening26("16100727 8862","Rudyard","Charles Morales","650-5379","Proin.eget@velitegestaslacinia.ca");
        dataRekening[6] = new Rekening26("16460329 4259","Troy","Damon Guerra","897-7608","pede.Suspendisse.dui@a.ca");
        dataRekening[7] = new Rekening26("16320421 3437","Alec","Cooper Lee","792-4447","non@mus.com");
        dataRekening[8] = new Rekening26("16180729 7229","Walter","Seth Drake","863-8209","Pellentesque.ut.ipsum@neque.ca");
        dataRekening[9] = new Rekening26("16950313 6823","Simon","Burton Gates","592-6919","tellus.justo.sit@commodoauctor.net");
        dataRekening[10] = new Rekening26("16850708 3528","Kamal","Odysseus Salas","1-115-339-7678","dictum@nec.edu");
        return dataRekening;
    }    

    public static void tampilDataRekening(Rekening26[] daftarRekening) {
        System.out.println("Data Rekening:");
        for (Rekening26 rek : daftarRekening) {
            System.out.println(rek.noRekening + rek.nama + rek.namaIbu + rek.phone + rek.email);
        }
    }
}