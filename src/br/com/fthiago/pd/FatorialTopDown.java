package br.com.fthiago.pd;

import java.util.HashMap;
import java.util.Map;

public class FatorialTopDown {

    private static Map<Integer, Long> valor = new HashMap<>();

    public static long fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (valor.containsKey(n)) {
            return valor.get(n);
        }
        long resultado = n * fatorial(n - 1);
        
        valor.put(n, resultado);
        return resultado;
    }

    public static void main(String[] args) {
        int numero1 = 100;
        int numero2 = 7;

        System.out.println("Fatorial de " + numero1 + " é: " + fatorial(numero1)); 
        System.out.println("Fatorial de " + numero2 + " é: " + fatorial(numero2));
    }
}