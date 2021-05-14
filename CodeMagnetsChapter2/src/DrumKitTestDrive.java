public class DrumKitTestDrive {

    public static void main(String[] args) {
	DrumKit d = new DrumKit();

	d.snape = false;
	if (d.snape == true) {
	    d.playSnape();
    }

	d.playSnape();
    d.playtopHat();
    }
}
