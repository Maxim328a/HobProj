package maxim328a;

public class Serials extends Hobby {

    private String lastSerialWatched;
    private float timeSpendEveryDay;

    public String getLastSerialWatched() {
        return lastSerialWatched;
    }

    public void setLastSerialWatched(String lastSerialWatched) {
        this.lastSerialWatched = lastSerialWatched;
    }

    public float getTimeSpendEveryDay() {
        return timeSpendEveryDay;
    }

    public void setTimeSpendEveryDay(float timeSpendEveryDay) {
        this.timeSpendEveryDay = timeSpendEveryDay;
    }

    public Serials(String name, int age, char interestScale, String lastSerialWatched, float timeSpendEveryDay) {
        super(name, age, interestScale);
        this.lastSerialWatched = lastSerialWatched;
        this.timeSpendEveryDay = timeSpendEveryDay;
    }

    public Serials() {
    }

    @Override
    public void tellAboutHobby() {
        System.out.println("Favourite serial: " + super.getName() + ". Age: " + super.getAge() +
                ". IsterestScale: " + super.getInterestScale() + ". LastSerialWatched: " +
                lastSerialWatched + ". TimeSpendEveryDay: " + timeSpendEveryDay);
    }
}
