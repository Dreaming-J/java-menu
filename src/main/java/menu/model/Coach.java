package menu.model;

import static menu.message.ErrorMsg.COACH_NAME_ERROR;

public class Coach {

    private static final int MIN_INCLUSIVE = 2;
    private static final int MAX_INCLUSIVE = 4;
    private final String name;

    public Coach(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        if (name.length() < MIN_INCLUSIVE || name.length() > MAX_INCLUSIVE) {
            throw new IllegalArgumentException(COACH_NAME_ERROR.toString());
        }
    }

    public void setHateFood(String hateFood) {
        
    }
}
