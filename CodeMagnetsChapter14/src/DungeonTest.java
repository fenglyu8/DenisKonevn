import java.io.*;

public class DungeonTest {
    public static void main(String[] args) {
        DungeonGame d = new DungeonGame();
        //First output
        System.out.println(d.getX() + d.getY() + d.getZ());

        try {
            FileOutputStream fos = new FileOutputStream("dg.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("dg.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            d = (DungeonGame) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Second output
        System.out.println(d.getX() + d.getY() + d.getZ());
    }
}
