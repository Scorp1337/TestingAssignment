package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculator {


    Map<String, Integer> multipliers = new HashMap<>() {{
        put("mm", 1);
        put("cm", 10);
        put("dm", 100);
        put("m", 1000);
        put("km", 1000000);
    }};

    //"10 cm + 1 m - 10 mm"


    public int calculate(String input, String outputType) {
        String[] tokens = input.split(" ");

        int sign = 1;
        int resultMm =0;
        String currentNumber = "";
        for (String token : tokens) {
            if (token.equals("+")) {
                sign = 1;
            } else if (token.equals("-")) {
                sign = -1;
            } else if (multipliers.containsKey(token)) {
               int value =  Integer.parseInt(currentNumber) * sign;
               int currentMultiplier = multipliers.get(token);
               resultMm += value * currentMultiplier;
            } else {
                currentNumber = token;
            }
        }
        Integer finalResult = resultMm / multipliers.get(outputType);
        return finalResult;
    }
}
