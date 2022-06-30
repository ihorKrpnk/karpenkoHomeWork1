package lesson6_SmartphoneTester;

public abstract class Phone {

    public abstract void setOs(String os);

    public abstract void setChargerType(String chargerType);

    public abstract void setApplicationStore(String applicationStore);

    public void dialing() {
        System.out.println("Dialing in progress");
    }
}
