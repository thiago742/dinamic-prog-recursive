package br.com.fthiago.recursive;


public class FatorialCalc {

    public static long fatorialRec(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * fatorialRec(n - 1);
        }
    }
    
    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 7;

        System.out.println("Fatorial de " + numero1 + " é: " + fatorialRec(numero1)); 
        System.out.println("Fatorial de " + numero2 + " é: " + fatorialRec(numero2)); 
    }
}
