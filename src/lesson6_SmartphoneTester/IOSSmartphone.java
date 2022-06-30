package lesson6_SmartphoneTester;

class IOSSmartphone extends Phone {

    private String os;
    private String chargerType;
    private String applicationStore;


    public IOSSmartphone(String os, String chargerType, String applicationStore) {
        setOs(os);
        setChargerType(chargerType);
        setApplicationStore(applicationStore);
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }

    public void setApplicationStore(String applicationStore) {
        this.applicationStore = applicationStore;
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
