package menu.controller;

import static menu.util.Repeat.repeat;

import menu.model.Category;
import menu.model.Coach;
import menu.model.HateFood;
import menu.model.LunchLottery;
import menu.model.Team;
import menu.view.InputView;
import menu.view.OutputView;

public class MainController {

    private static final int WEEKDAY = 5;
    private final InputView inputView;
    private final OutputView outputView;
    private final LunchLottery lunchLottery;
    private Team team;

    public MainController() {
        inputView = new InputView();
        outputView = new OutputView();
        lunchLottery = new LunchLottery();
    }

    public void start() {
        outputView.printServiceStart();
        createTeam();
        setHateFood();
        drawLunchForWeek();
        outputView.printServiceEnd(lunchLottery, team);
    }

    private void createTeam() {
        team = repeat(() -> {
            String coachesName = inputView.readTeam();
            return new Team(coachesName);
        });
    }

    private void setHateFood() {
        for (Coach coach : team.getCoaches()) {
            HateFood hateFood = repeat(() -> {
                String hateFoodName = inputView.readHateFood(coach);
                return new HateFood(hateFoodName);
            });
            coach.setHateFood(hateFood);
        }
    }

    private void drawLunchForWeek() {
        for (int i = 0; i < WEEKDAY; i++) {
            Category todayCategory = lunchLottery.drawCategory();
            drawLunchForDay(todayCategory);
        }
    }

    private void drawLunchForDay(Category todayCategory) {
        for (Coach coach : team.getCoaches()) {
            lunchLottery.drawFood(todayCategory, coach);
        }
    }
}
