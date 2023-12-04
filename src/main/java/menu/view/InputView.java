package menu.view;

import static menu.message.ViewMsg.READ_HATE_FOOD;
import static menu.message.ViewMsg.READ_TEAM;

import camp.nextstep.edu.missionutils.Console;
import menu.model.Coach;

public class InputView {

    public String readTeam() {
        System.out.println(READ_TEAM);
        return Console.readLine();
    }

    public String readHateFood(Coach coach) {
        System.out.printf(READ_HATE_FOOD.toString(), coach);
        return Console.readLine();
    }
}
