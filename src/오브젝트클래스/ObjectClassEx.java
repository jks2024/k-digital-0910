package 오브젝트클래스;
// Object 클래스 : 모든 자바 클래스의 조상 클래스
// Object 클래스는 필드 없이 11개(?)의 메서드로 구성
public class ObjectClassEx {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1.getClass()); // 해당 객체의 클래스 타입을 반환

        // String인 경우는 문자열의 내용을 비교하는 동작
        // equal() 메서드는 해당 인스턴스와 매개변수로 전달받는 참조 변수와 비교하여 결과를 반환
        // 해시코드를 비교 함
        System.out.println(student1.equals(student2));
        student1 = student2;
        System.out.println(student1.equals(student2));
        // 메모리에 로딩된 객체의 주소를 해시함수에 키값으로 전달하고 해시함수로 생성된 해시코드를 비교
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        // toString() 대부분의 경우는 오버라이딩해서 객체 내부의 정보를 표시함
        // 오버라이딩을 하지 않는 경우는 해당 객체의 정보를 문자열로 출력
        // 패키지이름.클래스이름@해시코드에대한16진수표기
        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}

class Student {
    int id;
    String name;
}
