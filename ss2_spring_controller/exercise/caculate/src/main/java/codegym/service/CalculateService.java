package codegym.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateService implements ICalculateService {
    @Override
    public String calculate(String operator, Double number1, Double number2) {
        String result = "";
        switch (operator) {
            case "Addition(+)":
                result += number1 + number2;
                break;
            case "Subtraction(-)":
                result += number1 - number2;
                break;
            case "Multiplication(*)":
                result += number1 * number2;
                break;
            case "Division(/)":
                if (number2 == 0) {
                    result += "Không thể chia được";
                } else {
                    result += number1 / number2;
                }
                break;
            default:
                break;
        }
        return result;
    }
}
