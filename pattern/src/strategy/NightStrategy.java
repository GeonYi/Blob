package strategy;

/**
 * 밤에 프로프즈를 하다.
 * */
class NightStrategy implements ProposeStrategy {
    @Override
    public double getPresentValue(double price, int cnt) {
        return price * cnt;
    }
}