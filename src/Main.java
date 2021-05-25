public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot();
        moveRobot(robot, 10,11);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX  ||  robot.getY() != toY) {
            int rX = robot.getX();
            int rY = robot.getY();
            Direction rD = robot.getDirection();
            if (toX > rX) {
                switch (rD) {
                    case UP: robot.turnRight(); break;
                    case DOWN:
                    case LEFT: robot.turnLeft(); break;
                    case RIGHT: while (robot.getX() != toX) robot.stepForward();
                }
            }
            else if (toX < rX) {
                switch (rD) {
                    case UP: robot.turnLeft(); break;
                    case DOWN:
                    case RIGHT: robot.turnRight(); break;
                    case LEFT: while (robot.getX() != toX) robot.stepForward();
                }
            }
            else if (toY > rY) {
                switch (rD) {
                    case LEFT: robot.turnRight(); break;
                    case RIGHT:
                    case DOWN: robot.turnLeft(); break;
                    case UP: while (robot.getY() != toY) robot.stepForward();
                }
            }
            else if (toY < rY) {
                switch (rD) {
                    case LEFT: robot.turnLeft(); break;
                    case RIGHT:
                    case UP: robot.turnRight(); break;
                    case DOWN: while (robot.getY() != toY) robot.stepForward();
                }
            }
        }
    }

}
