package maxim328a;

public abstract class Hobby {

    private String name;
    private int age;
    private char interestScale;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getInterestScale() {
        return interestScale;
    }

    public void setInterestScale(char interestScale) {
        this.interestScale = interestScale;
    }

    public Hobby(String name, int age,  char interestScale) {
        this.name = name;
        this.age = age;
        this.interestScale = interestScale;
    }

    public Hobby() {
        this.name = "UNKNOWN";
    }

    public abstract void tellAboutHobby();
//        System.out.println("Hobby: " + name + ". Age: " + age + ". IsterestScale: " + interestScale);


//    public String toString()
//    {
//        return "Obj [name = " + name +
//                ";  Age = " + age +
//                ";  InterestScale = " + interestScale + "]";
//    }

}