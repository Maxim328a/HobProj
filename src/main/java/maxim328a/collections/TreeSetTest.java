package maxim328a.collections;

import maxim328a.Serials;

import java.util.TreeSet;

public class TreeSetTest {
    public static long testTreeSet(int choice){

        TreeSet<Serials> testArr = new TreeSet();
        long start_time, end_time;
        Serials serial = new Serials("Serial",2,'8',"Shameless",2.5f);

        switch (choice) {
            case 1:
                start_time = System.currentTimeMillis();
                for (int i = 0; i < 10000; i++) {
                    testArr.add(serial);
                }
                end_time = System.currentTimeMillis();
                return end_time - start_time;
            case 2:
                for (int i = 0; i < 10000; i++) {
                    testArr.add(serial);
                }
                start_time = System.currentTimeMillis();
                for (int i = 0; i < 10000; i++) {
                    testArr.remove(serial);
                }
                end_time = System.currentTimeMillis();
                return end_time - start_time;
            case 3:
                for (int i = 0; i < 10000; i++) {
                    testArr.add(serial);
                }
                start_time = System.currentTimeMillis();
                for (int i = 0; i < 10000; i++) {
                    testArr.getClass();
                }
                end_time = System.currentTimeMillis();
                return end_time - start_time;
            default:
                return -1;
        }
    }
}
