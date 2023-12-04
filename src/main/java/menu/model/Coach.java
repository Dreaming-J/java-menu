package menu.model;

import static menu.message.ErrorMsg.COACH_NAME_ERROR;

public class Coach {

    private static final int MIN_INCLUSIVE = 2;
    private static final int MAX_INCLUSIVE = 4;
    private final String name;
    private HateFood hateFood;

    public Coach(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name.length() < MIN_INCLUSIVE || name.length() > MAX_INCLUSIVE) {
            throw new IllegalArgumentException(COACH_NAME_ERROR.toString());
        }
    }

    public void createHateFood(String hateFood) {
        this.hateFood = new HateFood(hateFood);
    }
}
