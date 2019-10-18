package maxim328a;

public class Football extends Hobby {

    private int totalGoalsScored;
    private int gamesPlayed;

    public int getTotalGoalsScored() {
        return totalGoalsScored;
    }

    public void setTotalGoalsScored(int totalGoalsScored) {
        this.totalGoalsScored = totalGoalsScored;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public Football(String name, int age, char interestScale, int totalGoalsScored, int gamesPlayed) {
        super(name, age, interestScale);
        this.totalGoalsScored = totalGoalsScored;
        this.gamesPlayed = gamesPlayed;
    }

    public Football() {
    }

    @Override
    public void tellAboutHobby() {

        System.out.println("Team: " + super.getName() + ". Age: " + super.getAge() +
                ". IsterestScale: " + super.getInterestScale() + ". GamesPlayed: " +
                gamesPlayed + ". GoalsScored: " + totalGoalsScored);

    }

}
