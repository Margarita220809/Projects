package Ex23;

import enums.ex1.DayOfWeek;

public class Person {
    int salary;
    String name;
    int countOfFriends;

    public Person(int salary, String name, int countOfFriends) {
        this.salary = salary;
        this.name = name;
        this.countOfFriends = countOfFriends;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfFriends() {
        return countOfFriends;
    }

    public void setCountOfFriends(int countOfFriends) {
        this.countOfFriends = countOfFriends;
    }
    public void isDayOff(DaysOfWeek daysOfWeek) throws NoWeekendsExeption{
        if(daysOfWeek.equals(DaysOfWeek.SATURDAY)|| daysOfWeek.equals(DaysOfWeek.SUNDAY)){
            System.out.println("Finally days off");
        }else {
            throw new NoWeekendsExeption();
        }
    }
    private void isSalaryEnough() throws LowSalaryExceptions{
        if(salary < 5000){
            throw new LowSalaryExceptions();
        }else {
            System.out.println("U have enough money");
        }
    }
    private void doYouHaveFriends() throws NoFriendsException{
        if (countOfFriends <= 0){
            throw  new NoFriendsException();
        }else
            System.out.println("U have friends");
    }
    public void canIhaveParty(DaysOfWeek daysOfWeek)throws NoWeekendsExeption, LowSalaryExceptions, NoFriendsException{
        isDayOff(daysOfWeek);
        isSalaryEnough();
        doYouHaveFriends();
        System.out.println("Hurra Party!!!!!");
    }
}
