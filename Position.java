package turtleGraphics;

public class Position {

    private int rowPosition;
    private int columnPosition;

    public Position(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;

    }

    @Override
    public String toString() {
        String toString = "Position\n";
        toString += "Current Row Position: " + rowPosition;
        toString += "\nCurrent Column Position: " + columnPosition;
        return toString;
    }

    @Override
    public boolean equals(Object anotherPosition) {
        if (anotherPosition.getClass() != this.getClass()){
        return false;
    }

    Position convertedPosition = (Position) anotherPosition;
    boolean columnsAreEqual = convertedPosition.columnPosition == this.columnPosition;
    boolean rowsAreEqual = convertedPosition.rowPosition == this.rowPosition;
    return columnsAreEqual && rowsAreEqual;
}

    public void increaseColumnPositionBy(int numberOfSteps) {
        columnPosition += numberOfSteps;
    }
    public void increaseRowPositionBy(int numberOfSteps) {
        rowPosition += numberOfSteps;
    }
    public void decreaseColumnPositionBy(int numberOfSteps) {
        columnPosition -= numberOfSteps;
    }
    public void decreaseRowPositionBy(int numberOfSteps) {
        rowPosition -= numberOfSteps;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }
}
