public class Robot {

    public enum Direction {
        LEFT, RIGHT
    }

    public void moveForward(int space) {
        System.out.println(space + " 칸 전진");
    }

    public void turn(Direction _Direction) {
        System.out.println(
                (_Direction == Direction.LEFT ? "왼쪽" : "오른쪽") + "으로 방향전환");
    }

    public void pickup() {
        System.out.println("앞의 물건 접어들기");
    }
}