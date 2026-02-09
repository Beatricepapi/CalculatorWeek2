package atu.ie.calculatorweek2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public CalculationResult calculate(
            @RequestParam double num1,
            @RequestParam double num2,
            @RequestParam String operation) {

        switch (operation.toLowerCase()) {

            case "add":
                return new CalculationResult("add", num1 + num2);

            case "subtract":
                return new CalculationResult("subtract", num1 - num2);

            case "multiply":
                return new CalculationResult("multiply", num1 * num2);

            case "divide":
                if (num2 == 0) {
                    return new CalculationResult("Cannot divide by zero");
                }
                return new CalculationResult("divide", num1 / num2);

            default:
                return new CalculationResult("Invalid operation");
        }
    }
}
