package constructorTask;

public class Servis {
    private String name;

    public Servis(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void readyForServis(Contract contract, City city){
        int lastTOdistance = contract.getHuman().getAuto().getLastTOdistance();
        int currentDistance = contract.getHuman().getAuto().getCurrentTOdistance();
        int futureDistance = contract.getHuman().getAuto().getFutureTOdistance();
        int distanceForTO = futureDistance - lastTOdistance;
        int currentKM = currentDistance - lastTOdistance;
        int distanceForCity = city.getDistanceToGet() * 2;
        if (currentKM + distanceForCity <= distanceForTO){
            System.out.println("Szanowny " + contract.getHuman().getName() + ".");
            System.out.println("Jedź do " + city.getName() + ". Ale nie zapomnij, że według umowy "
                    + contract.getIdContract() + "obsługujesz samochód u nas." + "Wasza " + getName());
        }else {
            System.out.println("Szanowny " + contract.getHuman().getName() + ".");
            System.out.println("Przed tym jak jechać do miasta " + city.getName() + "musicie zrobić TO.");
        }

    }
}
