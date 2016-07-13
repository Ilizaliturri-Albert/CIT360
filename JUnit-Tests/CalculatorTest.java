import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void addsExpression() {

  	//isolate
    Calculator calculator = new Calculator();

    //call
    int sum = calculator.add("1+2+3");

    //ensure
    assertEquals(6, sum);
  }
  @Test
  public void subtractsExpression() {

  	//isolate
    Calculator calculator = new Calculator();

    //call
    int result = calculator.subtract("3-2-1");

    //ensure
    assertEquals(0, result);
  }
  @Test
  public void multipliesExpression() {

  	//isolate
    Calculator calculator = new Calculator();

    //call
    int result = calculator.multiply("3*2*1");

    //ensure
    assertEquals(6, result);
  }
  @Test
  public void multipliesExpression() {

  	//isolate
    Calculator calculator = new Calculator();

    //call
    int result = calculator.divide("6/2");

    //ensure
    assertEquals(3, result);
  }
  @Test
  public void deleteExpression() {

  	//isolate
    Calculator calculator = new Calculator();

    //call
    int result = calculator.delete("6");

    //ensure
    assertNull(result);
  }
  @Test
  public void deleteExpression() {

  	//isolate
    Calculator calculator = new Calculator();

    //call
    int result = calculator.delete("6");

    //ensure
    assertNull(result);
  }
  @Test
  public void checkExpression() {

  	//isolate
    Calculator calculator = new Calculator();

    //call
    int result = calculator.check("6,6");

    //ensure
    assertTrue(result);
  }
}
