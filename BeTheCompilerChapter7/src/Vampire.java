public class Vampire extends Monster{
    @Override
    boolean frighten(int x) {
        System.out.println("a bite?");
        return false;
    }
}
