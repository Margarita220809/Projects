package incaps;

public class Main {
    public static void main(String[] args) {
        Student ivan = new Student("Ivan", 45, true, "AQA");
        ivan.setName("Ivan");
        ivan.setAge(32);
        System.out.println(ivan.getAge() + "\n" + ivan.getName());
        ivan.getInfo();
        Student x = new Student();
        x.getInfo();
        Student alona = new Student("Alona", "developer", 32, false);
        alona.getInfo();

    }
}
