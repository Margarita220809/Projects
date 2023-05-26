package lesson7;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.name = "Asus";
        System.out.println(computer.name);
        computer.setName("Apple");
        System.out.println(computer.getName());

        Computer computer2 = new Computer();
        computer2.name = "HP";
        System.out.println(computer2.name);

        System.out.println(computer.plus(3, 5));
        System.out.println(computer.hello());
//        computer.setMouseInclude(true);
        System.out.println(computer.getMouseInclude());
    }
}
