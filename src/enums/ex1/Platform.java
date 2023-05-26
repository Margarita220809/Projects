package enums.ex1;

public enum Platform {
    IOS("IOS"), ANDROID("ANDROID");
    String name;

    Platform(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
