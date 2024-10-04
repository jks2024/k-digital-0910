package 추상클래스;
// 추상클래스 : 인스턴스화가 안되는 클래스
// 부모가 만든 추상메서드는 자식이 반드시 구현 해야 함
// 단일 상속만 지원
// 명시적으로 abstract 키워드를 사용 해야 함
// 일반 메서드도 포함 할 수 있음
public class AbstractMain {
    public static void main(String[] args) {
        Phone phone = new Phone("tt") {
            @Override
            void call() {
                System.out.println("일회용 객체 생성");
            }
        };
        phone.setPower(true);
        phone.call();
    }
}
