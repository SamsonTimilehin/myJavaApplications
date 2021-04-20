package turtleGraphics;

public class SketchPad {
    private final int[][]floor;
    public SketchPad(int numberOfRows, int numberOfColumns) {
       floor = new int[numberOfRows][numberOfColumns];
    }

    public int[][] getFloor() {
        return floor;
    }
}
