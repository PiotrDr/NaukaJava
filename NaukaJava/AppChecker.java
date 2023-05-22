public class AppChecker {
    public static void main(String[] args) {

        AndroidApp AndroidApp = new AndroidApp("Calculator");
        AndroidApp.appInfo();
        AndroidApp.runAndroidApp();

        IphoneApp IphoneApp = new IphoneApp("Calculator");
        IphoneApp.runIphoneApp();
        IphoneApp.appInfo();
    }
}
