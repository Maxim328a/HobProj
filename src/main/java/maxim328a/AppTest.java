package maxim328a;
import maxim328a.collections.*;

import java.io.IOException;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class AppTest {

    public static void runTest() {
        final Scanner scanner = new Scanner(System.in);
        int answer1 = 0, answer2 = 0;
        long[][] stat = new long[5][3];

        do {
            Menu.printMainMenu();
            answer1 = scanner.nextInt();
            switch (answer1){
                case 1:
                    Menu.printAdditionalMenu();
                    answer2 = scanner.nextInt();
                    stat[answer1 - 1][answer2 - 1] = ArrayListTesting.testArrayList(answer2);
                    break;
                case 2:
                    Menu.printAdditionalMenu();
                    answer2 = scanner.nextInt();
                    stat[answer1 - 1][answer2 - 1] = LinkedListTest.testLinkedList(answer2);
                    break;
                case 3:
                    Menu.printAdditionalMenu();
                    answer2 = scanner.nextInt();
                    stat[answer1 - 1][answer2 - 1] = HashMapTest.testHashMap(answer2);
                    break;
                case 4:
                    Menu.printAdditionalMenu();
                    answer2 = scanner.nextInt();
                    stat[answer1 - 1][answer2 - 1] = HashSetTest.testHashSet(answer2);
                    break;
                case 5:
                    Menu.printAdditionalMenu();
                    answer2 = scanner.nextInt();
                    stat[answer1 - 1][answer2 - 1] = TreeSetTest.testTreeSet(answer2);
                    break;
                case 6:
                    System.out.println(stat[0][0] + "   " + stat[0][1] + "   " + stat[0][2] + "\n" +
                            stat[1][0] + "   " + stat[1][1] + "   " + stat[1][2] + "\n" +
                            stat[2][0] + "   " + stat[2][1] + "   " + stat[2][2] + "\n" +
                            stat[3][0] + "   " + stat[3][1] + "   " + stat[3][2] + "\n" +
                            stat[4][0] + "   " + stat[4][1] + "   " + stat[4][2] + "\n");
                    break;
            }
        }while (answer1 != 7);
    }

    public static void main (final String[] args ){

        runTest();

//        final Scanner scanner = new Scanner(System.in);
//        final Logger logger = Logger.getLogger(AppTest.class);
//
//        String name;
//        String lastSerial;
//        int age;
//        char interestScale;
//        int goalsScored;
//        int gamesPlayed;
//        float timeEveryDay;
//
//        AbstractHobby[] arr = new AbstractHobby[4];
//
//        System.out.print("Input name of your team: ");
//        name = scanner.nextLine();
//        System.out.print("Input age: ");
//        age = scanner.nextInt();
//        System.out.print("Input: how do you like from 0 to 9 ");
//        interestScale = scanner.next().trim().charAt(0);
//        System.out.print("How many goals you scored?: ");
//        goalsScored = scanner.nextInt();
//        System.out.print("How many games you played?: ");
//        gamesPlayed = scanner.nextInt();
//
//        arr[0] = new Football(name,age,interestScale,goalsScored,gamesPlayed);
//        arr[1] = new Football("School17Team",3,'8',36,52);
//
//        System.out.print("Input name of your favourite serial: ");
//        name = scanner.next();
//        System.out.print("Input age: ");
//        age = scanner.nextInt();
//        System.out.print("Input: how do you like from 0 to 9 ");
//        interestScale = scanner.next().trim().charAt(0);
//        System.out.print("What last serial you watched?: ");
//        lastSerial = scanner.next();
//        System.out.print("How many time you spend for serials every day?: ");
//        timeEveryDay = scanner.nextInt();
//
//        arr[2] = new Serials(name,age,interestScale,lastSerial,timeEveryDay);
//        arr[3] = new Serials("Supernatural",2,'9',"Shameless",1.7f);
//
//        for (final AbstractHobby num:arr) {
//            try {
//                num.tellAboutHobby();
//            } catch (HobbyExeption hobbyExeption) {
//                logger.error("Exeption here: ", hobbyExeption);
//            }
//
//        }
    }
}
