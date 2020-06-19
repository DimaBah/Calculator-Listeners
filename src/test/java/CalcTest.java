import listeners.CalcListener;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(value = CalcListener.class)
public class CalcTest {


    @BeforeClass
    public void init() {
        System.out.println("Calculator testing is started:");
    }

    @Test(dataProvider = "numbers")
    public void addiction(double x) {

        double expectedResult = 5;
        double actualResult = x + 1;
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void multiplication() {

        double expectedResult = 4;
        double actualResult = 2 * 2;
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void division() {

        double expectedResult = 1;
        double actualResult = 2 / 2;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Ignore("For reason")
    @Test()
    public void subtraction() {

        double expectedResult = 0;
        double actualResult = 2 - 2;
        Assert.assertEquals(actualResult, expectedResult);

    }

    @DataProvider(name = "numbers")
    public Object[][] numbers(){
        return new Object[][]{{4.0}, {3},  {2.5}, {4}};
    }
}
