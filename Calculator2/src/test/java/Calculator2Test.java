import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Calculator2Test extends Calculator2 {

    Calculator2 calculator = new Calculator2();

    @Test
    public void add() {
        double addition = number1 + number2;
        Assertions.assertEquals(calculator.addition(number1, number2), addition);
    }

    @Test
    public void sub() {
        double subtraction = number1 - number2;
        Assertions.assertEquals(calculator.subtraction(number1, number2), subtraction);
    }

    @Test
    public void mul() {
        double multiplication = number1 * number2;
        Assertions.assertEquals(calculator.multiplication(number1, number2), multiplication);
    }

    @Test
    public void addMin200_min200_Expect_min400() {
        double division = number1 / number2;
        Assertions.assertEquals(calculator.division(number1, number2), division);
    }
}

