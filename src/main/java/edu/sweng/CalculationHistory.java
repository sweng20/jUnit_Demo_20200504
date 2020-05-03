package edu.sweng;

import java.util.ArrayList;
import java.util.List;

public class CalculationHistory {

    private final List<CompletedCalculation> calculations = new ArrayList<>();

    public void append(CompletedCalculation calculation) {
        calculations.add(calculation);
    }

    public int getHistorySize() {
        return calculations.size();
    }

    // other methods, e.g., getter

}
