import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticTests extends StaticSuper {
    static int rand;

    static {
        rand = (int)(random() * 6);
        out.println("static block " + rand);
    }

    StaticTests() {
        out.println("constructor");
    }

    public static void main(String[] args) {
        out.println("in main");
        StaticTests st = new StaticTests();
    }
}
