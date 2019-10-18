package maxim328a;
import java.util.Scanner;

public class App {
    public static void main (String[] args ){

        Scanner in = new Scanner(System.in);

        String name;
        String lastSerial;
        String favSerial;
        int age;
        char interestScale;
        int goalsScored;
        int gamesPlayed;
        float timeEveryDay;

        Hobby[] arr = {new Football(),new Football(),new Serials(),new Serials()};

        System.out.print("Input name of your team: ");
        name = in.nextLine();
        System.out.print("Input age: ");
        age = in.nextInt();
        System.out.print("Input: how do you like from 0 to 9 ");
        interestScale = in.next().trim().charAt(0);
        System.out.print("How many goals you scored?: ");
        goalsScored = in.nextInt();
        System.out.print("How many games you played?: ");
        gamesPlayed = in.nextInt();

        arr[0] = new Football(name,age,interestScale,goalsScored,gamesPlayed);
        arr[1] = new Football("School17Team",3,'8',36,52);

        System.out.print("Input name of your favourite serial: ");
        name = in.next();
        System.out.print("Input age: ");
        age = in.nextInt();
        System.out.print("Input: how do you like from 0 to 9 ");
        interestScale = in.next().trim().charAt(0);
        System.out.print("What last serial you watched?: ");
        lastSerial = in.next();
        System.out.print("How many time you spend for serials every day?: ");
        timeEveryDay = in.nextInt();

        arr[2] = new Serials(name,age,interestScale,lastSerial,timeEveryDay);
        arr[3] = new Serials("Supernatural",2,'9',"Shameless",timeEveryDay);

        for (Hobby num:arr) {
                num.tellAboutHobby();
        }
    }
}
