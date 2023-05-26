package interfaces.ex1;

public class Main {
    public static void main(String[] args) {
        Child child  = new Child();
        Student student = new Student();
        child.listen();
        student.listen();
        child.breathe();
        student.breathe();
    }
}
