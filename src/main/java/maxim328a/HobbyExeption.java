package maxim328a;

public class HobbyExeption extends Exception {

    public HobbyExeption() {
        super();
    }

    public HobbyExeption(String ex1) {
        super(ex1);
    }

    public HobbyExeption(Throwable ex2) {
        super(ex2);
    }

    public HobbyExeption(String ex1, Throwable ex2) {
        super(ex1, ex2);
    }
}
