package BruteForceDivideConquer;
public class Latihan26 {
    public static double sqrtBruteForce(double number) {
        if (number < 0) return Double.NaN; 
        
        double sqrt = 0;
        while (sqrt * sqrt <= number) {
            sqrt += 0.001;
        }
        return Math.floor(sqrt - 0.001);
    }
    

    public static double sqrtDivideConquer(double number) {
        if (number < 0) return Double.NaN; 
        return sqrtDivideConquer(number, 0, number);
    }

    private static double sqrtDivideConquer(double number, double low, double high) {
        double epsilon = 0.00001; 
        
        double mid = (low + high) / 2;
        double square = mid * mid;
        
        if (Math.abs(square - number) <= epsilon || square == number) return mid;
        
        if (square < number) return sqrtDivideConquer(number, mid, high);
        else return sqrtDivideConquer(number, low, mid);
    }
}
