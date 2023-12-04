package menu.message;

public enum ErrorMsg {
    SELECT_CATEGORY_ERROR("존재하지 않는 카테고리입니다.");

    private final String message;

    ErrorMsg(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
