# Calculator App Automation With Appium
## Project Summary
In this project i have automated the Google Calculator APK  using Selenium, TestNG, and Appium in IntelliJ IDEA, with testing conducted on the Android Studio emulator.
I have generated the Allure Report for test visualization of the test suites.


## Technology Used:
* Tool: _Selenium Webdriver_
* App Automation Framework: _Appium_
* Testing Framework: _TestNG_
*  Reporting Framework: _Allure_
* IDE: _Intellij, Android Studio_

## Problem Scenario

1. Automate any series for calculator app. Pass the series as a parameter to your test method. 
For an example:

   100/10*5-10+60

   pseudocode for your test function can be look like:

   public void doSeries(){
   calcuateSeries("100/10*5-10+60");
   }

2. write another function where following series will be calculated from csv file. 

   //data.csv

   50+40-30/2+20 //assert 50 

   10*2/2+10-20 // assert 0 

   4pi2^3 // assert 100.53

## How to Run the Project
1. Clone the project
2. Open android studio go to Profile or debug APK option and open Google Calculator APK
3. Run the emulator device and go to cmd type : ````adb devices````
4. Type ````appium```` to run Apprium server
5. Go to Appium inspector and set the capability builder.
6. Now open the project in intellij idea. Go to command prompt and write : ````gradle clean test```` to run the project
7. To generate Allure Report: Write the following commands in the command prompt
   
  *  _````allure generate allure-reports --clean -output````_
  *  _````allure serve allure-results````_


## Test Allure Report Screenshot:

### Single Series Run Output
![image](https://github.com/user-attachments/assets/80f5e9ad-5c2a-4806-83c2-044195a6d904)
![image](https://github.com/user-attachments/assets/fd46e9f2-10e3-482d-a4f7-7664bafbcc73)

### Multiple Series Run Output
![image](https://github.com/user-attachments/assets/ea5e8a34-f580-41d2-85b3-8e4401a4b251)
![image](https://github.com/user-attachments/assets/58a8cd55-4e38-422d-b10f-42e1e2e434bc)

## Project Output Video
[Click Here To See The Automation Script Running Video ](https://drive.google.com/file/d/1PqhlEb7Kle08k-iGb9N2evpEZwfrndCo/view?usp=sharing)





