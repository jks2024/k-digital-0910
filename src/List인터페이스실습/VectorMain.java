package List인터페이스실습;
// Vector는 ArrayList와 동일한 내부 구조를 가짐
// 차이점은 동기화(Synchronized) 메서드로 구성되어 있어 멀티스레드 환경에서 안전

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorMain {
    public static void main(String[] args) {
        List<NameCard> list = new ArrayList<>();
        list.add(new NameCard("민지", "minji@gamil.com", "010-1234-5678", "뉴진스"));
        list.add(new NameCard("하니", "hani@gamil.com", "010-1234-5678", "뉴진스"));
        list.add(new NameCard("혜린", "혜린@gamil.com", "010-1234-5678", "뉴진스"));
        list.add(new NameCard("혜인", "혜인@gamil.com", "010-1234-5678", "뉴진스"));
        list.add(new NameCard("다니엘", "다니엘@gamil.com", "010-1234-5678", "뉴진스"));

        for(NameCard e : list) {
            System.out.println("이름 : " + e.name);
            System.out.println("메일 : " + e.email);
            System.out.println("전화 : " + e.phone);
            System.out.println("직업 : " + e.job);
        }
    }
}

class NameCard {
    String name;
    String email;
    String phone;
    String job;

    public NameCard(String name, String email, String phone, String job) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.job = job;
    }
}
