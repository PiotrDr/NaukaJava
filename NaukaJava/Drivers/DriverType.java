package Drivers;

public enum DriverType {

    CHROME("chrome", "/NaukaJava/ChromeDriver.exe"),
    FIREFOX("firefox", "/NaukaJava/FirefoxDriver.exe");

    String name;
    String path;

     DriverType(String name, String path) {
        this.name = name;
        this.path = path;
    }
}
