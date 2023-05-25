package Drivers;

import Drivers.ChromeDriver;
import Drivers.FirefoxDriver;

import java.sql.Driver;

public class InterfaceChecker {
    public static void main(String[] args){
        DriverType[] DriverTypes = DriverType.values();
        for(int i=0; i<DriverTypes.length; i++) {
            System.out.println(DriverTypes[i].name);
            System.out.println(DriverTypes[i].path);
        }
        WebDriver Driver = getDriver(DriverType.CHROME);
        Driver.get();
        Driver.findElementBy();
    }

    private static WebDriver getDriver(DriverType type){
        if (type.name.equals("chrome")) {
            System.out.println(type.path);
            return new ChromeDriver();
        }
        System.out.println(type.path);
            return new FirefoxDriver();
    }
}
