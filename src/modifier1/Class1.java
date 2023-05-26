package modifier1;

public class Class1 {
    public String publicString = "publicString";
    private String privateString = "privateString";
    protected String protectedString = "protectedString";
    String defaultString = "defaultString";

    public static void main(String[] args) {
        Class1 class1 = new Class1();
        System.out.println(class1.privateString);
    }
}
