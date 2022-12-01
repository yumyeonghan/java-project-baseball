package view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Input {

    public List<Integer> inputNumber() {

        List<Integer> userNumber = Arrays.stream(Console.readLine().split(""))
                .map(v -> Integer.parseInt(v)).collect(Collectors.toList());
        return userNumber;
    }

    public int restart() {

        return Integer.parseInt(Console.readLine());
    }
}