
public class Calculator {

    public int add(String expression) {
        int sum = 0;
        for (String summand : expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }

    public int subtract(String expression) {
        int result = 0;
        for (String summand : expression.split("\\-"))
            result -= Integer.valueOf(summand);
        return result;
    }

    public int multiply(String expression) {
        int result = 0;
        for (String products : expression.split("\\*"))
            result *= Integer.valueOf(products);
        return result;
    }

    public int divide(String expression) {
        int result = 0;
        for (String products : expression.split("\\/"))
            result *= Integer.valueOf(products);
        return result;
    }

    public int delete(String expression) {
        return null;
    }

    public int check(String expression) {
        List result = new ArrayList();
        for (String number : expression.split("\\,"))
            result.add(number);

        return result.get(0) == result.get(1);
    }
}
