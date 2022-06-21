package lesson6;

public abstract class Phone {
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