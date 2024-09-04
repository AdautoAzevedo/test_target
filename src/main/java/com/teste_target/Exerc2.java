package main.java.com.teste_target;

public class Exerc2 {

    private static String isFibonacci(int num) {
        if (num <= 0) {
            return "Number is not in the Fibonacci sequence";
        }

        int a = 0, b = 1;

        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        if (b == num || a == num) {
            return "Number is in the Fibonacci sequence";
        } else {
            return "Number is not in the Fibonacci sequence";
        }
    }
    
    public static void main(String[] args) {
        int fiboNumber = 34;
        int number = 234;

        System.err.println(isFibonacci(fiboNumber));
        System.err.println(isFibonacci(number));
    }
}
