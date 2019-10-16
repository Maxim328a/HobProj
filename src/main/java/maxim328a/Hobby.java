package maxim328a;

public class Hobby {

    private String name;
    private byte timesPerWeek;
    private short timesDonePerMounth;
    private int age;
    private long money;
    private float oneLessonDuration;
    private char interestScale;
    private double timeEachMounth;
    private boolean goingToContinue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getTimesDonePerMounth() {
        return timesDonePerMounth;
    }

    public void setTimesDonePerMounth(short timesDonePerMounth) {
        this.timesDonePerMounth = timesDonePerMounth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public float getOneLessonDuration() {
        return oneLessonDuration;
    }

    public void setOneLessonDuration(float oneLessonDuration) {
        this.oneLessonDuration = oneLessonDuration;
    }

    public char getInterestScale() {
        return interestScale;
    }

    public void setInterestScale(char interestScale) {
        this.interestScale = interestScale;
    }

    public double getTimeEachMounth() {
        return timeEachMounth;
    }

    public void setTimeEachMounth(double timeEachMounth) {
        this.timeEachMounth = timeEachMounth;
    }

    public boolean isGoingToContinue() {
        return goingToContinue;
    }

    public void setGoingToContinue(boolean goingToContinue) {
        this.goingToContinue = goingToContinue;
    }

    public byte getTimesPerWeek() {
        return timesPerWeek;
    }

    public void setTimesPerWeek(byte timesPerWeek) {
        this.timesPerWeek = timesPerWeek;
    }

    public Hobby(String name, byte timesPerWeek, short timesDonePerMounth, int age, long money, float oneLessonDuration, char interestScale, double timeEachMounth, boolean goingToContinue) {
        this.name = name;
        this.timesPerWeek = timesPerWeek;
        this.timesDonePerMounth = timesDonePerMounth;
        this.age = age;
        this.money = money;
        this.oneLessonDuration = oneLessonDuration;
        this.interestScale = interestScale;
        this.timeEachMounth = timeEachMounth;
        this.goingToContinue = goingToContinue;
    }

    public Hobby(String name, int age, long money, char interestScale) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.interestScale = interestScale;
    }

    public Hobby() {
        this.name = "UNKNOWN";
    }

    public void tellAboutHobby(){
        System.out.println("Hobby: " + name + ". Age: " + age + ". Money: " + money + ". IsterestScale: " + interestScale);
    }
}