package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

public class TurtleTest {
    Pen pen;
    Pen secondPen;
    Turtle ijapa;


    @BeforeEach
    void startAllTestsWithThis() {
        pen = new Pen();
        secondPen = new Pen();
        ijapa = new Turtle(pen);

    }

    @Test
    void turtleHasAPenTest() {

        assertNotNull(ijapa.getPen());
        assertEquals(pen, ijapa.getPen());
        assertNotEquals(secondPen, ijapa.getPen());
    }

    @Test
    void turtleCanMovePenUp() {
        ijapa.movePenUp();
        assertTrue(ijapa.isPenUp());
    }

    @Test
    void turtleCanMovePenDown() {
        assertTrue(ijapa.isPenUp());
        ijapa.movePenDown();
        assertFalse(ijapa.isPenUp());

    }

    @Test
    void turtleCanTurnRightWhileFacingEast() {
        assertSame(Direction.EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingSouth() {
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingWest() {
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingNorth() {
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(EAST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanMoveForwardFacingEast(){
      assertSame(EAST, ijapa.getCurrentDirection());
      ijapa.moveForwardBy(5);
      assertEquals(new Position(0,4), ijapa.getCurrentPosition());
    }

    @Test
    void turtleCanTurnLeftWhileFacingEast() {
        assertSame(Direction.EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingNorth() {
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingWest() {
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingSouth() {
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(EAST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanMoveForwardFacingSouth(){
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.moveForwardBy(5);
        assertEquals(new Position(0,4), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.moveForwardBy(5);
        assertEquals(new Position(4,4), ijapa.getCurrentPosition());
    }

    @Test
    void turtleCanMoveForwardFacingWest(){
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.moveForwardBy(5);
        assertEquals(new Position(0,4), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.moveForwardBy(5);
        assertEquals(new Position(4,4), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.moveForwardBy(5);
        assertEquals(new Position(4,0), ijapa.getCurrentPosition());
    }

    @Test
    void turtleCanMoveForwardFacingNorth(){
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.moveForwardBy(5);
        assertEquals(new Position(0,4), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.moveForwardBy(5);
        assertEquals(new Position(4,4), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.moveForwardBy(5);
        assertEquals(new Position(4,0), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.moveForwardBy(5);
        assertEquals(new Position(0,0), ijapa.getCurrentPosition());
    }

    @Test
    void turtleCanWriteWhileFacingEastTest(){
        ijapa.movePenDown();
        SketchPad sketchPad = new SketchPad(20,20);
        int numberOfSteps = 5;
        ijapa.writeOn(sketchPad, 5);

        int counter = 0;
        int[][]floor = sketchPad.getFloor();
        while (counter < numberOfSteps) {

            assertEquals(1, floor[0][counter]);
            counter++;
        }
        assertEquals(new Position(0,4), ijapa.getCurrentPosition());
    }

    @Test
    void turtleCanWriteWhileFacingSouthTest() {
        ijapa.movePenDown();
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());

        SketchPad sketchPad = new SketchPad(20, 20);
        int numberOfSteps = 5;
        ijapa.writeOn(sketchPad, 5);

        int counter = 0;
        int[][] floor = sketchPad.getFloor();
        while (counter < numberOfSteps) {

            assertEquals(1, floor[counter][0]);
            counter++;
        }
        assertEquals(new Position(4, 0), ijapa.getCurrentPosition());
    }
        @Test
        void turtleCanWriteWhileFacingWestTest() {
            ijapa.movePenDown();
            SketchPad sketchPad = new SketchPad(20, 20);
            int numberOfSteps = 5;
            ijapa.writeOn(sketchPad, 5);

            ijapa.turnRight();
            ijapa.turnRight();
            assertSame(WEST, ijapa.getCurrentDirection());

            int counter = 0;
            int[][] floor = sketchPad.getFloor();
            while (counter < numberOfSteps) {

                assertEquals(1, floor[0][counter]);
                counter++;
            }
                    assertEquals(new Position(0, 4), ijapa.getCurrentPosition());


        }

    @Test
    void turtleCanWriteWhileFacingNorthTest(){
        ijapa.movePenDown();
        ijapa.turnRight();
        SketchPad sketchPad = new SketchPad(20,20);
        int numberOfSteps = 5;
        ijapa.writeOn(sketchPad, 5);
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());


        int counter = 0;
        int[][]floor = sketchPad.getFloor();
        while (counter < numberOfSteps) {

            assertEquals(1, floor[counter][0]);
            counter++;
        }
        assertEquals(new Position(4,0), ijapa.getCurrentPosition());
    }
}