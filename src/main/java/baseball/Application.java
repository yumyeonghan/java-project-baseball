package baseball;

import controller.Controller;

public class Application {
    public static void main(String[] args) {
        Controller controller = getController();
        play(controller);
    }

    private static Controller getController() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        Controller controller = new Controller();
        return controller;
    }

    private static void play(Controller controller) {
        boolean restart = true;
        while (restart) {
            restart = controller.run();
        }
    }
}
