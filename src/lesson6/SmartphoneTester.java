package lesson6;

abstract class Phone {

    public Phone() {
        setOs();
        setChargerType();
        setApplicationStore();
    }

    public abstract void setOs();

    public abstract void setChargerType();

    public abstract void setApplicationStore();

    public void dialing() {
        System.out.println("Dialing in progress");
    }
}

class IOSSmartphone extends Phone {

    private String os;
    private String chargerType;
    private String applicationStore;

    @Override
    public void setOs() {
        os = "iOS";
    }

    @Override
    public void setChargerType() {
        chargerType = "bad";
    }

    @Override
    public void setApplicationStore() {
        applicationStore = "App Store";
    }

    public String getOs() {
        return os;
    }

    public String getChargerType() {
        return chargerType;
    }

    public String getApplicationStore() {
        return applicationStore;
    }
}

class AndroidSmartphone extends Phone {
    private String os;
    private String chargerType;
    private String applicationStore;


    @Override
    public void setOs() {
        os = "Android 9.0";
    }

    @Override
    public void setChargerType() {
        chargerType = "bad";
    }

    @Override
    public void setApplicationStore() {
        applicationStore = "Google Play Market";
    }

    public String getOs() {
        return os;
    }

    public String getChargerType() {
        return chargerType;
    }

    public String getApplicationStore() {
        return applicationStore;
    }
}

public class SmartphoneTester {
    public static void main(String[] args) {
        IOSSmartphone iOSSmartphone = new IOSSmartphone();
        iOSSmartphone.dialing();
        System.out.println("OS: " + iOSSmartphone.getOs() +
                "\nCharger Type: " + iOSSmartphone.getChargerType() +
                "\nApplication store: " + iOSSmartphone.getApplicationStore());
        AndroidSmartphone androidSmartphone = new AndroidSmartphone();
        androidSmartphone.dialing();
        System.out.println("OS: " + androidSmartphone.getOs() +
                "\nCharger Type: " + androidSmartphone.getChargerType() +
                "\nApplication store: " + androidSmartphone.getApplicationStore());
    }
}