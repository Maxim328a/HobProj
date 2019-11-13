package maxim328a;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class AppTest {
    public static void main (final String[] args ){

        final Scanner scanner = new Scanner(System.in);
        final Logger logger = Logger.getLogger(AppTest.class);

        String name;
        String lastSerial;
        int age;
        char interestScale;
        int goalsScored;
        int gamesPlayed;
        float timeEveryDay;

        AbstractHobby[] arr = new AbstractHobby[4];

        System.out.print("Input name of your team: ");
        name = scanner.nextLine();
        System.out.print("Input age: ");
        age = scanner.nextInt();
        System.out.print("Input: how do you like from 0 to 9 ");
        interestScale = scanner.next().trim().charAt(0);
        System.out.print("How many goals you scored?: ");
        goalsScored = scanner.nextInt();
        System.out.print("How many games you played?: ");
        gamesPlayed = scanner.nextInt();

        arr[0] = new Football(name,age,interestScale,goalsScored,gamesPlayed);
        arr[1] = new Football("School17Team",3,'8',36,52);

        System.out.print("Input name of your favourite serial: ");
        name = scanner.next();
        System.out.print("Input age: ");
        age = scanner.nextInt();
        System.out.print("Input: how do you like from 0 to 9 ");
        interestScale = scanner.next().trim().charAt(0);
        System.out.print("What last serial you watched?: ");
        lastSerial = scanner.next();
        System.out.print("How many time you spend for serials every day?: ");
        timeEveryDay = scanner.nextInt();

        arr[2] = new Serials(name,age,interestScale,lastSerial,timeEveryDay);
        arr[3] = new Serials("Supernatural",2,'9',"Shameless",1.7f);

        for (final AbstractHobby num:arr) {
            try {
                num.tellAboutHobby();
            } catch (HobbyExeption hobbyExeption) {
                logger.error("Exeption here: ", hobbyExeption);
            }
        }
    }
}
