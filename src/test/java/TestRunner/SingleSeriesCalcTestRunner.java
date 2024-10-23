package TestRunner;

import Config.SetUp;
import Screens.CalcScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleSeriesCalcTestRunner extends SetUp {
    @Test( description = "Check The single Mathematical Equation Gives Correct Result or Not")
    public void doSeries() {
        CalcScreen calScreen = new CalcScreen(driver);
        String actualResult = calScreen.calculateSeries("100/10*5-10+60");
        String expectedResult = "100";
        Assert.assertEquals(actualResult, expectedResult);
    }

}
