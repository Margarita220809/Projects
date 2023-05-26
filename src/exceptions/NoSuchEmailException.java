package exceptions;

public class NoSuchEmailException extends Exception{
    public String getMessage(){
        return "This mail is busy";
    }
}
