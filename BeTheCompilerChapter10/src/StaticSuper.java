import static java.lang.System.out;

public class StaticSuper {

    static {
        out.println("super static block");
    }

    StaticSuper() {
        out.println("super constructor");
    }
}
