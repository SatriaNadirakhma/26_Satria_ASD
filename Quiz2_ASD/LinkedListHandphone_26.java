public class LinkedListHandphone_26 {
    private Node_26 head;

    public LinkedListHandphone_26() {
        this.head = null;
    }

    public void add(Handphone_26 data) {
        Node_26 newNode = new Node_26(data);
        if (head == null) {
            head = newNode;
        } else {
            Node_26 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void delete(String imei) {
        if (head == null) {
            return;
        }
        if (head.data.imei.equals(imei)) {
            head = head.next;
            return;
        }
        Node_26 current = head;
        while (current.next != null && !current.next.data.imei.equals(imei)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public Handphone_26 get(String imei) {
        Node_26 current = head;
        while (current != null) {
            if (current.data.imei.equals(imei)) {
                return (Handphone_26) current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void printAll() {
        Node_26 current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
