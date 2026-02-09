package atu.ie.calculatorweek2;

public class CalculationResult {

    private String operation;
    private double total;
    private String message;

    public CalculationResult() {
    }

    public CalculationResult(String operation, double total) {
        this.operation = operation;
        this.total = total;
        this.message = "Success";
    }

    public CalculationResult(String message) {
        this.message = message;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getMessage() {
        return message;
    }
}

