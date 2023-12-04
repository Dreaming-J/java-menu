package menu.view;

import static menu.message.ViewMsg.PRINT_RECOMMEND_RESULT;
import static menu.message.ViewMsg.PRINT_SERVICE_START;

import menu.model.LunchLottery.RecommendedCategory;
import menu.model.Team;

public class OutputView {

    public static void printError(String error) {
        System.out.printf("[ERROR] %s%n", error);
    }

    public void printServiceStart() {
        System.out.println(PRINT_SERVICE_START);
    }

    public void printServiceEnd(RecommendedCategory recommendedCategory, Team team) {
        System.out.printf(PRINT_RECOMMEND_RESULT.toString(), recommendedCategory, team);
    }
}
