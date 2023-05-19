import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/calculator.feature"})
public class CalculatorTest extends AbstractTestNGCucumberTests {

}
