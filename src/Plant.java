public class Plant {
    private String name;
    private int germinationInWeeks;

    public Plant(String name, int germinationInWeeks){
        setName(name);
        setGerminationInWeeks(germinationInWeeks);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGerminationInWeeks() {
        return germinationInWeeks;
    }

    public void setGerminationInWeeks(int germinationInWeeks) {
        this.germinationInWeeks = germinationInWeeks;
    }
}
