package codegym.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateService implements ICalculateService {
    @Override
    public String calculate(String operator, String number1, String number2) {
        String result = "";
      try {
          Double input1 = Double.parseDouble(number1);
          Double input2 = Double.parseDouble(number2);
          switch (operator) {
              case "Addition(+)":
                  result += input1 + input2;
                  break;
              case "Subtraction(-)":
                  result += input1 - input2;
                  break;
              case "Multiplication(*)":
                  result += input1 * input2;
                  break;
              case "Division(/)":
                  if (input2 == 0) {
                      result += "Không thể chia được";
                  } else {
                      result += input1 / input2;
                  }
                  break;
              default:
                  break;
          }
      }catch (NumberFormatException e){
          result  += "NumberFormat Exception";
      }

        return result;
    }
}
