package Drivers;

public class WebDriverTest {
    public static void main(String[] args) {

        WebDriver chrome = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();

        WebDriver firefox = new FirefoxDriver();
        WebDriver secondFirefox = new FirefoxDriver();
        WebDriver trhirdFirefox = new FirefoxDriver();

        WebDriver safari = new WebDriver() {
            @Override
            public void get() {
                System.out.println("Otwiera przegladarke Safari");
            }

            @Override
            public void findElementBy() {
                System.out.println("Znajduje element za pomoca przegladarki Safari");
            }
        };
        safari.get();
        safari.findElementBy();
    }
}
