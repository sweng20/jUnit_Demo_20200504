package edu.sweng;

public class Calculator {

    private CalculationHistory history;

    public Calculator(CalculationHistory history) {
        this.history = history;
    }


    public double add(double a, double b) {
        double result = a + b;
        history.append(new CompletedCalculation("add", a, b, result));
        return result;
    }

    public double sub(double a, double b){
        double result = a - b;
        history.append(new CompletedCalculation("sub", a, b, result));
        return result;
    }

}
