package turtleGraphics;

public class Pen {
    private boolean isDown;
    public void setIsUp(boolean isUp) {
        isDown = !isUp;
    }

    public boolean isUp() {
        return !isDown;
    }
}
