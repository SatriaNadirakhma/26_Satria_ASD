import java.util.ArrayList;
import java.util.Iterator;

public class HandphoneCollection_26 {
    private ArrayList<Handphone_26> handphones;

    public HandphoneCollection_26() {
        this.handphones = new ArrayList<>();
    }

    public void add(Handphone_26 handphone) {
        handphones.add(handphone);
    }

    public void delete(String imei) {
        Iterator<Handphone_26> iterator = handphones.iterator();
        while (iterator.hasNext()) {
            Handphone_26 handphone = iterator.next();
            if (handphone.imei.equals(imei)) {
                iterator.remove();
                return;
            }
        }
    }

    public Handphone_26 get(String imei) {
        for (Handphone_26 handphone : handphones) {
            if (handphone.imei.equals(imei)) {
                return handphone;
            }
        }
        return null;
    }

    public void printAll() {
        for (Handphone_26 handphone : handphones) {
            System.out.println(handphone);
        }
    }
}
