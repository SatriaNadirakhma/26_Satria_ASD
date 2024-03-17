package BruteForceDivideConquer;
public class Faktorial26 {
    public int nilai;

    public int faktorialBF(int n) {
        if (n == 1) {
            return 1;
        }
        return n * faktorialBF(n - 1);
    }
    

    public int faktorialDC(int n) {
        if (n==1) {
            return 1;
        }
        else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}