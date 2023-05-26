package exceptions;

public class Main {
    public void insert2() throws NoSuchEmailException{
        InsertName insertName = new InsertName();
        insertName.insertName();
    }
    public static void main(String[] args) {
        InsertName insertName = new InsertName();
        try{
            insertName.insertName();
        }catch(NoSuchEmailException te){
            System.out.println(te.getMessage());
        }

    }
}
