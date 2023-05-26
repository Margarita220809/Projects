package musicconcert;

public class Person {
    private int money;
    private String name;

    public Person(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void GoToConcert(){
        if (money < Groups.METALIC.getCost()){
            System.out.println(name + " be at home");
        } else if (money < Groups.ACDC.getCost()) {
            System.out.println(name + " u can go to " + Groups.METALIC.getName());
        } else if (money < Groups.QUEEN.getCost()) {
            System.out.println(name + " u can go to " + Groups.METALIC.getName()
                    + " and " + Groups.ACDC.getName());
        }else
        {
            System.out.println("U can go to any concert");
        }
    }
}
