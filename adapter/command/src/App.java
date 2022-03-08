public class App {
    public static void main(String[] args) throws Exception {

        /*
         * 추상 클래스를 통해서 기본적인 값을 가지면서 추상 메소드만 다르게 설정
         * 전략 패턴과 다른게 상속을 받아 제한적이지만 여러가지가 가능 하다.
         */

        RobotKit robotKit = new RobotKit();

        robotKit.addCommand(new MoveForwardCommand(2));
        robotKit.addCommand(new TurnCommand(Robot.Direction.LEFT));
        robotKit.addCommand(new MoveForwardCommand(1));
        robotKit.addCommand(new TurnCommand(Robot.Direction.RIGHT));
        robotKit.addCommand(new PickupCommand());
        robotKit.addCommand(new CommandOrderAdapter(new MoveBackOrder(1)));

        robotKit.start();
    }
}
