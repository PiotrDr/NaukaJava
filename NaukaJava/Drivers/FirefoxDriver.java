package Drivers;

import Drivers.WebDriver;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwiera przegladarke Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduje element za pomoca przegladarki Firefox");
    }
}
