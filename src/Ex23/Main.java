package Ex23;

public class Main {
    public static void main(String[] args) throws NoFriendsException,NoWeekendsExeption, LowSalaryExceptions{
        Person Ivan = new Person(7000, "Ivan", 5);
        Ivan.canIhaveParty(DaysOfWeek.SATURDAY);
/*        try{
            Ivan.canIhaveParty(DaysOfWeek.SATURDAY);
        }catch (NoWeekendsExeption|NoFriendsException|LowSalaryExceptions e){
                    Can be both
//            System.out.println(e.getMessage());
//            e.printStackTrace();
        }*/



    }
}
