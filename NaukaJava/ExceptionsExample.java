import Drivers.ChromeDriver;
import Drivers.FirefoxDriver;
import Drivers.WebDriver;

public class ExceptionsExample {
    public static void main(String[] args) {

       /* int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 3;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/
        WebDriver Driver = getDriver("sda");
        Driver.get();
        Driver.findElementBy();
    }
        private static WebDriver getDriver(String name) {
            if (name.equals("Chrome")) {
                return new ChromeDriver();
            } else if (name.equals("Firefox")) {
                return new FirefoxDriver();
            }
            return null;
        }
    }
