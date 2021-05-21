public class GoodDogTestDrive {
        public static void main(String[] args) {
            GoodDog one = new GoodDog();
            one.setSize(70);
            GoodDog two = new GoodDog();
            two.setSize(8);
            System.out.println("Dog one size: " + one.getSize());
            System.out.println("Dog two size: " + two.getSize());
            one.bark();
            two.bark();
        }
}
