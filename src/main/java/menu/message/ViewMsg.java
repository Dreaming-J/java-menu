package menu.message;

public enum ViewMsg {
    PRINT_SERVICE_START("점심 메뉴 추천을 시작합니다.");

    private final String message;

    ViewMsg(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
