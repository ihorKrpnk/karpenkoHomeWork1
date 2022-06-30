package lesson6_SmartphoneTester;

public abstract class Phone {

    abstract void setOs(String os);

    abstract void setChargerType(String chargerType);

    abstract void setApplicationStore(String applicationStore);

    public void dialing() {
        System.out.println("Dialing in progress");
    }
}
