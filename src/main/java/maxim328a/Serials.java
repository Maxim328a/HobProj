/**
 *
 *
 * Maxim Sitalo
 */
package maxim328a;

public class Serials extends AbstractHobby {

    /**Maxim Sitalo*/
    private String lastSerialWatched;
    /**Maxim Sitalo*/
    private float timeSpendEveryDay;

    public String getLastSerialWatched() {
        return lastSerialWatched;
    }

    public void setLastSerialWatched(final String lastSerialWatched) {
        this.lastSerialWatched = lastSerialWatched;
    }

    public float getTimeSpendEveryDay() {
        return timeSpendEveryDay;
    }

    public void setTimeSpendEveryDay(final float timeSpendEveryDay) {
        this.timeSpendEveryDay = timeSpendEveryDay;
    }

    /**Maxim Sitalo*/

    public Serials(final String name, final int age, final char interestScale, final String lastSerialWatched, final float timeSpendEveryDay) {
        super(name, age, interestScale);
        this.lastSerialWatched = lastSerialWatched;
        this.timeSpendEveryDay = timeSpendEveryDay;
    }

    /**Maxim Sitalo*/
    public Serials() {
        super();
    }

    @Override
    public void tellAboutHobby() throws HobbyExeption {
        if(timeSpendEveryDay > 24){
            throw new HobbyExeption("Time can not be more than 24 hours");
        }
        System.out.println("Favourite serial: " + super.getName() + ". Age: " + super.getAge() +
                ". IsterestScale: " + super.getInterestScale() + ". LastSerialWatched: " +
                lastSerialWatched + ". TimeSpendEveryDay: " + timeSpendEveryDay);

    }
}
