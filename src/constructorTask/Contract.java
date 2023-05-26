package constructorTask;

public class Contract {
    private int idContract;
    private Human human;

    public Contract(int idContract, Human human) {
        this.idContract = idContract;
        this.human = human;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }
}
