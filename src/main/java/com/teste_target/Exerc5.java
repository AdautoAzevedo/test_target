package main.java.com.teste_target;

public class Exerc5 {

    //Reverse transforming the String into a charArray
    private static String reverseString(String s){
        char[] charArray = s.toCharArray();

        int left = 0;
        int right = charArray.length - 1;

        while (left<right) {
            char aux = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = aux;

            left++;
            right--;
        }

        return new String(charArray);
    }

    //Reverse using the StringBuilder class
    private static String usingStringBuilder(String s) {
        return new StringBuilder(s).reverse().toString();
    }


    public static void main(String[] args) {
        String s = "String to be reversed";

        System.err.println(reverseString(s));
        System.err.println(usingStringBuilder(s));

    }
}
