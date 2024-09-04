package main.java.com.teste_target;

public class Exerc1 {
    public static void main(String[] args) {
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K++;
            SOMA = SOMA + K;
        }

        System.err.println(SOMA);
    }
}
