package menu.message;

public enum ErrorMsg {
    SELECT_CATEGORY_ERROR("존재하지 않는 카테고리입니다."),
    COACH_NAME_ERROR("코치 이름은 2 ~ 4글자여야 합니다."),
    FOOD_NAME_ERROR("메뉴에 존재하지 않는 음식입니다.");

    private final String message;

    ErrorMsg(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
