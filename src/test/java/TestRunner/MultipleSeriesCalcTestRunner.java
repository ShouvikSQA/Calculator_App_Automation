package TestRunner;

import Config.MathematicalDataSet;
import Config.SetUp;
import Screens.CalcScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleSeriesCalcTestRunner extends SetUp {
     @Test(dataProviderClass = MathematicalDataSet.class ,dataProvider = "MathematicalData" , description = "Check if  multiple Given  Mathematical Equation Gives Correct Result or Not")
    public void doMultipleSeries(String series, String expected_val) {
        CalcScreen calScreen = new CalcScreen(driver);
        String actualResult = calScreen.calculateSeries(series);

        int indx = actualResult.indexOf(".");
        if(indx != -1){
            actualResult = actualResult.substring(0, indx+3);
        }
        Assert.assertEquals(actualResult, expected_val);
        calScreen.btnClear.click();
    }

}
