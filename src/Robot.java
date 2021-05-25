public class Robot {

    private int x = 10,
            y = 10;
    private Direction d = Direction.UP;


    // текущее направление взгляда
    public Direction getDirection() {
        return d;
    }

    // текущая координата X
    public int getX() {
        return x;
    }

    // текущая координата Y
    public int getY() {
        return y;
    }

    // повернуться на 90 градусов против часовой стрелки
    public void turnLeft() {
        switch (getDirection()) {
            case UP:
                d = Direction.LEFT; break;
            case LEFT:
                d = Direction.DOWN; break;
            case DOWN:
                d = Direction.RIGHT; break;
            case RIGHT:
                d = Direction.UP;
        }
    }

    // повернуться на 90 градусов по часовой стрелке
    public void turnRight() {
        switch (getDirection()) {
            case UP:
                d = Direction.RIGHT; break;
            case RIGHT:
                d = Direction.DOWN; break;
            case DOWN:
                d = Direction.LEFT; break;
            case LEFT:
                d = Direction.UP;
        }
    }

    // шаг в направлении взгляда
    // за один шаг робот изменяет одну свою координату на единицу
    public void stepForward() {
        switch (getDirection()) {
            case UP:
                y++; break;
            case DOWN:
                y--; break;
            case RIGHT:
                x++; break;
            case LEFT:
                x--;
        }
    }

}
