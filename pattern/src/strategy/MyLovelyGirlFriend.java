package strategy;

class MyLovelyGirlFriend {

    private final String NAME_STR = "Shine Park";
    private final String BOY_FRIEND_NAME_STR = "Yi Geon";

    private double scoreCutLine = 10000;

    private ProposeStrategy proposeStrategy;

    public MyLovelyGirlFriend(ProposeStrategy proposeStrategy){
        this.proposeStrategy = proposeStrategy;
    }

    public void 전략을바꾼다(ProposeStrategy proposeStrategy) {
        this.proposeStrategy = proposeStrategy;
    }

    void 선물을받는다(double price, int cnt) {
        System.out.println("오빠님 너무 고마워용~~");
        System.out.println(proposeStrategy.getPresentValue(price, cnt) + "짜리 선물 이었어용~");
        scoreCutLine -= proposeStrategy.getPresentValue(price, cnt);
    }

    public boolean 나와결혼해주오(String name, double price, int cnt){
        if(!name.equals(BOY_FRIEND_NAME_STR)){
            System.out.println("죄송해용. 저는 남자 친구가 있어용!!");
            return false;
        } else {

            선물을받는다(price, cnt);

            if( scoreCutLine > 1 ){
                System.out.println("하지만 제 마음은 아직 열리지 않았어용~");
                return false;
            }

            System.out.println("전 이제 오빠꺼에용~");
            return true;
        }
    }
}
