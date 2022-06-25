package lesson6;

abstract class Phone {
    public void dialing() {
        // System.out.println("Dialing in progress");
    }

    public abstract String setOs();

    public abstract String setChargerType();

    public abstract String setApplicationStore();

    public String getPhoneInfo() {
        return "OS: " + setOs() +
                "\nCharger type: " + setChargerType() +
                "\nApplication store: " + setApplicationStore();
    }
}

class IOSSmartphone extends Phone {
    @Override
    public void dialing() {
        System.out.println("iPhone...Dialing in progress!");
    }

    @Override
    public String setOs() {
        return "iOS 15.4";
    }

    @Override
    public String setChargerType() {
        return "bad";
    }

    @Override
    public String setApplicationStore() {
        return "App Store";
    }
}

class AndroidSmartphone extends Phone {
    @Override
    public void dialing() {
        System.out.println("Android...Dialing in progress!");
    }

    @Override
    public String setOs() {
        return "Android 12";
    }

    @Override
    public String setChargerType() {
        return "bad";
    }

    @Override
    public String setApplicationStore() {
        return "Google Play Market";
    }
}

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