package lesson6;

public class IOSSmartphone extends Phone {

    private final String os = "iOS 15.4";
    private final String chargerType = "bad";
    private final String applicationStore = "App Store";

    //public IOSSmartphone() {
    //    setOs("15.4");
    //    setChargerType("Type C");
    //   setApplicationStore("App Store");
    //}

    @Override
    public void dialing() {
        System.out.println("iPhone...Dialing in progress!");
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