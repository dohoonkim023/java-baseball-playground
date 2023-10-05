import Calculator.Domain.Calculator;
import Calculator.Domain.Expression;
import Calculator.Domain.Splitter;
import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Calculator calculator = new Calculator(new Expression(input), new Splitter());
        System.out.println(calculator.calculate());
    }
}
