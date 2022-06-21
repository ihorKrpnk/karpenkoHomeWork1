package lesson6;

public class SmartphoneTester {
    public static void main(String[] args) {
        IOSSmartphone iOSSmartphone = new IOSSmartphone();
        iOSSmartphone.dialing();
        System.out.println(iOSSmartphone.getPhoneInfo());
        AndroidSmartphone androidSmartphone = new AndroidSmartphone();
        androidSmartphone.dialing();
        System.out.println(androidSmartphone.getPhoneInfo());
    }
}