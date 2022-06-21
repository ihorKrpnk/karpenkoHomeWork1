package lesson6;

public class AndroidSmartphone extends Phone {

    private final String os = "Android 12";
    private final String chargerType = "bad";
    private final String applicationStore = "Google Play Market";

    // public AndroidSmartphone() {
    //     setOs("Android 9.0");
    //     setChargerType("USB C");
    //     setApplicationStore("Google Play");
    // }

    @Override
    public void dialing() {
        System.out.println("Android...Dialing in progress!");
    }

    @Override
    public String setOs() {
        return os;
    }

    @Override
    public String setChargerType() {
        return chargerType;
    }

    @Override
    public String setApplicationStore() {
        return applicationStore;
    }
}