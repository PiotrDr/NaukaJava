package Drivers;

import Drivers.WebDriver;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwiera przegladarke Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduje element za pomoca przegladarki Chrome");
    }
}
