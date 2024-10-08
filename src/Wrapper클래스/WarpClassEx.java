package Wrapper클래스;
// Wrapper 클래스란? 기본 타입의 데이터를 객체 타입으로 취급하도록 변환해줒는 클래스

public class WarpClassEx {
    public static void main(String[] args) {
//        IntegerEx integerEx = new IntegerEx(100);
//        System.out.println(integerEx.x);
        Integer x = 100;  // Auto Boxing
        int xx = x;   // Auto Unboxing
    }
}

//class IntegerEx {
//    int x;
//    IntegerEx(int x) {
//        this.x = x;
//    }
//}