package Calculator.Domain;

public class Splitter {

    public String[] splitExpression(Expression expression) {
        return expression.getExpression().split(" ");
    }

}
