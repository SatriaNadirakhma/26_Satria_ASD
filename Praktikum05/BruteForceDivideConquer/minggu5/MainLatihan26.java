package BruteForceDivideConquer;
public class MainLatihan26 {
    public static void main(String[] args) {
        double number = 16; // Ganti dengan bilangan yang ingin diakarkan
        
        // Menggunakan algoritma Brute Force
        double bruteForceSqrt = Latihan26.sqrtBruteForce(number);
        System.out.println("Akar menggunakan Brute Force: " + bruteForceSqrt);
        
        // Menggunakan algoritma Divide Conquer
        double divideConquerSqrt = Latihan26.sqrtDivideConquer(number);
        System.out.println("Akar menggunakan Divide Conquer: " + divideConquerSqrt);
    }
    
}