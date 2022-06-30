package lesson6;

abstract class Phone {

   /* public Phone() {
        setOs();
        setChargerType();
        setApplicationStore();
    }*/

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


    public IOSSmartphone(String os, String chargerType, String applicationStore) {
        this.os = os;
        this.chargerType = chargerType;
        this.applicationStore = applicationStore;
        setOs();
        setChargerType();
        setApplicationStore();
    }


    @Override
    public void setOs() {
    }

    @Override
    public void setChargerType() {
    }

    @Override
    public void setApplicationStore() {
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

    public AndroidSmartphone(String os, String chargerType, String applicationStore) {
        this.os = os;
        this.chargerType = chargerType;
        this.applicationStore = applicationStore;
        setOs();
        setChargerType();
        setApplicationStore();
    }

    @Override
    public void setOs() {
    }

    @Override
    public void setChargerType() {
    }

    @Override
    public void setApplicationStore() {
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