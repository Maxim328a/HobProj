/**Maxim Sitalo*/
package maxim328a;

public class Football extends AbstractHobby {

    /**Maxim Sitalo*/
    private int totalGoalsScored;

    /**Maxim Sitalo*/
    private int gamesPlayed;

    public int getTotalGoalsScored() {
        return totalGoalsScored;
    }

    public void setTotalGoalsScored(final int totalGoalsScored) {
        this.totalGoalsScored = totalGoalsScored;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(final int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    /**Maxim Sitalo*/
    public Football(final String name, final int age, final char interestScale, final int totalGoalsScored, final int gamesPlayed) {
        super(name, age, interestScale);
        this.totalGoalsScored = totalGoalsScored;
        this.gamesPlayed = gamesPlayed;
    }

    /**Maxim Sitalo*/
    public Football() {
        super();
    }


    @Override
    public void tellAboutHobby() {

        System.out.println("Team: " + super.getName() + ". Age: " + super.getAge() +
                ". IsterestScale: " + super.getInterestScale() + ". GamesPlayed: " +
                gamesPlayed + ". GoalsScored: " + totalGoalsScored);

    }

}
