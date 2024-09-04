package main.java.com.teste_target;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Exerc3 {

    /* Coloquei a outra classe dentro desse mesmo arquivo para facilitar a leitura e avaliação. 
    Reconheço que em projetos reais, a melhor prática é separa-los*/


    public static void main(String[] args) {
       ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<DataEntry> entries = objectMapper.readValue(new File("public/data.json"), new TypeReference<List<DataEntry>>() {});
            double min = 0;
            double max = 0;
            double sum = 0;
            int count = 0;

            for (DataEntry entry : entries) {
                double valor = entry.getValor();
                if (valor > 0) {
                    if (valor < min) {
                        min = valor;
                    }
                    if (valor > max) {
                        max = valor;
                    }
                    sum += valor;
                    count++;
                }
            }

            
            double mean = sum / count;

            
            System.out.println("Minimum value: " + min);
            System.out.println("Maximum value: " + max);
            System.out.println("Mean value: " + mean);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /* Inner class */
    public class DataEntry {
        private int dia;
        private double valor;

        public int getDia() {
            return dia;
        }
        public void setDia(int dia) {
            this.dia = dia;
        }
        public double getValor() {
            return valor;
        }
        public void setValor(double valor) {
            this.valor = valor;
        }
    }


}


