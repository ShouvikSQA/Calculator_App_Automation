package Screens;

import Config.SetUp;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {
    AndroidDriver driver;
    public final String Package_Name ="com.google.android.calculator";

    @FindBy(id= Package_Name + ":id/clr")
    public WebElement btnClear;
    @FindBy(id= Package_Name + ":id/eq")
    public WebElement btnEqual;
    @FindBy(id=Package_Name + ":id/result_final")
    public WebElement txtResult;
    @FindBy(id= Package_Name +":id/const_pi")
    public WebElement btnPI;


    public CalcScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String calculateSeries(String series) {
        String data = "";
        for (int i = 0; i < series.length(); i++) {
            char ch = series.charAt(i);
            if (ch == '+') {
                driver.findElement(By.id(Package_Name +":id/op_add")).click();
            }
            else if (ch == '-') {
                driver.findElement(By.id(Package_Name +":id/op_sub")).click();
            }
            else if (ch == '*') {
                driver.findElement(By.id(Package_Name +":id/op_mul")).click();
            }
            else if (ch == '/') {
                driver.findElement(By.id(Package_Name +":id/op_div")).click();
            }
            else if (ch == '^'){
                driver.findElement(By.id(Package_Name +":id/op_pow")).click();
            }

            else if (Character.isDigit(ch)) {
                driver.findElement(By.id(Package_Name +":id/digit_" + ch)).click();
            }

            else {

                    data += series.charAt(i);


                if(data.equals("pi")){
                    btnPI.click();
                    System.out.println(data);
                    data="";

                }
            }

        }
        btnEqual.click();
        return txtResult.getText();

    }
}
