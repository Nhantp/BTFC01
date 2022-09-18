package FC_01.bt3;

public class WebStore extends Shop{
    private String internetAddress;
    private String programLanguage;

    public WebStore() {
    }

    public WebStore(String name, String internetAddress, String programLanguage) {
        super(name);
        this.internetAddress = internetAddress;
        this.programLanguage = programLanguage;
    }

    public String getInternetAddress() {
        return internetAddress;
    }

    public void setInternetAddress(String internetAddress) {
        this.internetAddress = internetAddress;
    }

    public String getProgramLanguage() {
        return programLanguage;
    }

    public void setProgramLanguage(String programLanguage) {
        this.programLanguage = programLanguage;
    }

    @Override
    public String toString() {
        return "WebStore{" +
                "internetAddress='" + internetAddress + '\'' +
                ", programLanguage='" + programLanguage + '\'' +
                '}';
    }
}
