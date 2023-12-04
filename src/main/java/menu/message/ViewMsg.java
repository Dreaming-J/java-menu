package menu.message;

public enum ViewMsg {
    PRINT_SERVICE_START("점심 메뉴 추천을 시작합니다."),
    READ_TEAM("\n코치의 이름을 입력해 주세요. (, 로 구분)"),
    READ_HATE_FOOD("%n%s(이)가 못 먹는 메뉴를 입력해 주세요.%n"),
    PRINT_RECOMMEND_RESULT("""
                        
            메뉴 추천 결과입니다.
            [ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]
            %s
            %s
                        
            추천을 완료했습니다.
            """);

    private final String message;

    ViewMsg(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
