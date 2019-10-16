package maxim328a;
import java.util.Scanner;

public class App {
    public static void main (String[] args ){
        Scanner in = new Scanner(System.in);

        String name;
        int age;
        long money;
        char interestScale;

        System.out.print("Input name of hobby: ");
        name = in.nextLine();
        System.out.print("Input age: ");
        age = in.nextInt();
        System.out.print("Input money that you spend for/get from hobby every mounth: ");
        money = in.nextLong();
        System.out.print("Input: how do you like from 0 to 9 ");
        interestScale = in.next().trim().charAt(0);

        Hobby hob1 = new Hobby(name,age,money,interestScale);
        Hobby hob2 = new Hobby();
        Hobby hob3 = new Hobby("Serials",(byte)7,(short)31,18,0,2.5f,'9',77.5d,true);

        Hobby[] hobbyArr;
        hobbyArr = new Hobby[3];
        hobbyArr[0] = hob1;
        hobbyArr[1] = hob2;
        hobbyArr[2] = hob3;

        for(int i = 0; i < 3; i++){
            hobbyArr[i].tellAboutHobby();
        }
    }
}
