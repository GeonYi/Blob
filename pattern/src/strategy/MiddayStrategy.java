package strategy;

/**
 * 평일대낮에 프로프즈를 하다.
 *
 * 평일 낮에는 여자친구가 감수성이 다 올라오지 않아서
 * 0.3점이 감점된다
 * */
class MiddayStrategy implements ProposeStrategy {
    @Override
    public double getPresentValue(double price, int cnt) {
        return price * cnt * 0.7;
    }
}
