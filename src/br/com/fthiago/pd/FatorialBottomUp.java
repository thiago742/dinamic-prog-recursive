package br.com.fthiago.pd;

public class FatorialBottomUp {

    public static long fatorial(int n) {
    	
        long[] dp = new long[n + 1];
        
        dp[0] = 1;
        
        for (int i = 1; i <= n; i++) {
            dp[i] = i * dp[i - 1];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 7;

        System.out.println("Fatorial de " + numero1 + " é: " + fatorial(numero1));
        System.out.println("Fatorial de " + numero2 + " é: " + fatorial(numero2)); 
    }
}