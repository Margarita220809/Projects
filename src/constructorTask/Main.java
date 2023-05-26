package constructorTask;

public class Main {
    public static void main(String[] args) {
        Servis servis = new Servis("Szanowna kompresja");
        servis.readyForServis(new Contract(112233,
                new Human("Andrii", new Auto("Audi", 20000, 140000,
                        230000, 60000))),new City("kiev ", 60000));

    }

}
