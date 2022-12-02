package view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Input {

    public Input() {
    }

    public List<Integer> inputNumber() {

        System.out.print("숫자를 입력해주세요 : ");
        List<Integer> userNumber = Arrays.stream(Console.readLine().split(""))
                .map(v -> Integer.parseInt(v)).collect(Collectors.toList());
        return userNumber;
    }

    public int restart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return Integer.parseInt(Console.readLine());
    }
}
