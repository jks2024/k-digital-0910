package 학생성적정렬하기;
import java.util.*;

// 5명의 학생에 대해 이름과 국어, 영어, 수학 성적을 입력 받아서 정렬하기
// 첫번째 조건은 총점 기준
// 총점이 같으면 이름의 사전순 정렬
// 자료 구조는 TreeSet을 사용해도 되고 ArrayList 사용해도 됨
// TreeSet의 경우는 중복 제거가 되므로 유일한 키가 없는 경우 주의 해야 함
public class StudentSortEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> treeSet = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("이름 입력 : ");
            String name = sc.next();
            System.out.print("국어 성적 : ");
            int kor = sc.nextInt();
            System.out.print("영어 성적 : ");
            int eng = sc.nextInt();
            System.out.print("수학 성적 : ");
            int mat = sc.nextInt();
            treeSet.add(new Student(name, kor, eng, mat));
        }
        Collections.sort(treeSet);

        System.out.println("======성적 결과 출력 ======");
        for(Student e : treeSet) {
            System.out.println(e);
        }

    }
}


