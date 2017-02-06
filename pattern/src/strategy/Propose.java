package strategy;

public class Propose {

    public static void main(String[] args) {

        MyLovelyGirlFriend propose = new MyLovelyGirlFriend(new MiddayStrategy());

        System.out.println("이상한 녀석이 찾아간다-------------------------------------");
        propose.나와결혼해주오("김아무개", 1000, 1000);
        System.out.println("");

        System.out.println("밤에 내가 찾아간다 ----------------------------------------");
        propose.전략을바꾼다(new NightStrategy());
        propose.나와결혼해주오("Yi Geon", 10, 10);
        propose.나와결혼해주오("Yi Geon", 10, 15);
        System.out.println("");

        System.out.println("작전을 바꾼다 낮에 찾아간다 -------------------------------");
        propose.전략을바꾼다(new MiddayStrategy());
        propose.나와결혼해주오("Yi Geon", 100, 5);
        propose.나와결혼해주오("Yi Geon", 200, 2);
        System.out.println("");

        System.out.println("다시 밤에 찾아간다 비싼거 한방에 승부보자 ------------------");
        propose.전략을바꾼다(new NightStrategy());
        propose.나와결혼해주오("Yi Geon", 10000, 1);
        System.out.println("");
    }
}
