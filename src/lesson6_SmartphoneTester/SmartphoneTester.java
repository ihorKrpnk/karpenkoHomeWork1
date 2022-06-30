package lesson6_SmartphoneTester;

public class SmartphoneTester {
    public static void main(String[] args) {
        IOSSmartphone iOSSmartphone = new IOSSmartphone("iOS", "bad", "App Store");
        iOSSmartphone.dialing();
        System.out.println("OS: " + iOSSmartphone.getOs() +
                "\nCharger Type: " + iOSSmartphone.getChargerType() +
                "\nApplication store: " + iOSSmartphone.getApplicationStore());
        AndroidSmartphone androidSmartphone = new AndroidSmartphone("Android", "bad", "Google Play");
        androidSmartphone.dialing();
        System.out.println("OS: " + androidSmartphone.getOs() +
                "\nCharger Type: " + androidSmartphone.getChargerType() +
                "\nApplication store: " + androidSmartphone.getApplicationStore());
    }
}
