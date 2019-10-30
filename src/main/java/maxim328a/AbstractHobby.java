/**@author Maxim Sitalo*/
package maxim328a;

public abstract class AbstractHobby {

    /**@author Maxim Sitalo*/
    private String name;
    private int age;
    private char interestScale;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public char getInterestScale() {
        return interestScale;
    }

    /**@author Maxim Sitalo*/
    public void setInterestScale(final char interestScale) {
        this.interestScale = interestScale;
    }

    /**@author Maxim Sitalo*/
    public AbstractHobby(final String name, final int age,  final char interestScale) {
        this.name = name;
        this.age = age;
        this.interestScale = interestScale;
    }

    /**@author Maxim Sitalo*/
    public AbstractHobby() {
        this.name = "UNKNOWN";
    }

    /**@author Maxim Sitalo*/
    public abstract void tellAboutHobby() throws HobbyExeption;

}