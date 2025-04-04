class Robot {
    protected int x;
    protected int y;
    protected char direction;

    public Robot(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void displayInitialPosition() {
        System.out.println("Initial Position -> X: " + x + ", Y: " + y + ", Direction: " + direction);
    }
}

class MovingRobot extends Robot {

    public MovingRobot(int x, int y, char direction) {
        super(x, y, direction);
    }

    public void moveRobot(int steps) {
        switch (direction) {
            case 'N':
                y += steps;
                break;
            case 'S':
                y -= steps;
                break;
            case 'E':
                x += steps;
                break;
            case 'W':
                x -= steps;
                break;
            default:
                System.out.println("Invalid direction!");
        }
    }

    public void displayUpdatedPosition() {
        System.out.println("Updated Position -> X: " + x + ", Y: " + y);
    }
}

public class Question3 {
    public static void main(String[] args) {
        System.out.println("Ali - 24K-3103\n");

        MovingRobot robot = new MovingRobot(0, 2, 'N');
        robot.displayInitialPosition();

        robot.moveRobot(3);
        robot.displayUpdatedPosition();
    }
}
