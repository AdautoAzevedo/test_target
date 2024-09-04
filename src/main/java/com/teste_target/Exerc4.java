package main.java.com.teste_target;

import java.util.HashMap;
import java.util.Map;

public class Exerc4 {
    private static double calculateTotalValue(Map<String, Double> stateValues) {
        double totalValue = 0;
        for (double value : stateValues.values()) {
            totalValue += value;
        }

        return totalValue;
    }

    private static void calculatePercentageByState(Map<String, Double> stateValues, double totalValue) {
        for (Map.Entry<String, Double> entry : stateValues.entrySet()) {
            String state = entry.getKey();
            double value = entry.getValue();
            double percentage = (value / totalValue) * 100;
            System.out.println(String.format("%s: %.2f%%", state, percentage));
        }
    }

    public static void main(String[] args) {
        Map<String, Double> stateValues = new HashMap<>();
        stateValues.put("SP", 67836.43);
        stateValues.put("RJ", 36678.66);
        stateValues.put("MG", 29229.88);
        stateValues.put("ES", 27165.48);
        stateValues.put("Outros", 19849.53);

        double totalValue = calculateTotalValue(stateValues);
        calculatePercentageByState(stateValues, totalValue);

    }    
}
