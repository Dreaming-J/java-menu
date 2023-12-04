package menu.view;

import static menu.message.ViewMsg.READ_TEAM;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String readTeam() {
        System.out.println(READ_TEAM);
        return Console.readLine();
    }
}
