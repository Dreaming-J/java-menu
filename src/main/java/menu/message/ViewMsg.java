package menu.message;

public enum ViewMsg {
    PRINT_SERVICE_START("점심 메뉴 추천을 시작합니다."),
    READ_TEAM("\n코치의 이름을 입력해 주세요. (, 로 구분)"),
    READ_HATE_FOOD("%n%s(이)가 못 먹는 메뉴를 입력해 주세요.%n");

    private final String message;

    ViewMsg(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
