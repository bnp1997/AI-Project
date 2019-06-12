import processing.core.PApplet;

public class Main extends PApplet {

    public Program program;
    public Counters counters;

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public void settingScreenSize() {
        size(1920, 1080);
    }

    public void setup() {
        counters = new Counters(this);
        program = new Program(this, counters);
        program.setup();
        frameRate(999);
    }

    public void draw() {
        background(0);
        program.display();
    }
}
