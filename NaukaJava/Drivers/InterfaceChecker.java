package Drivers;

import Drivers.ChromeDriver;
import Drivers.FirefoxDriver;

public class InterfaceChecker {
    public static void main(String[] args) throws NoValidBrowserName {
        WebDriver Driver = getDriver("Firefoxdsa");
        Driver.get();
        Driver.findElementBy();
       /* FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get();
        firefoxDriver.findElementBy();*/
    }

    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if (name.equals("Chrome")) {
            return new ChromeDriver();
        } else if (name.equals("Firefox")) {
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("No valid browser name.");
    }
}
