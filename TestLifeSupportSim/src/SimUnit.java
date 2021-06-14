public class SimUnit {
    String botType;

    public SimUnit(String type) {
        botType = type;
    }

    int PowerUse() {
        if("Retention".equals(botType)) {
            return 2;
        } else {
            return 4;
        }
    }
}
