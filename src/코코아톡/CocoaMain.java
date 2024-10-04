package 코코아톡;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        CocoaTok cocoaTok = new CocoaTok("민지");
        cocoaTok.writeMsg("오늘 날씨가 갑자가 쌀쌀해 졌어요. 건강한게 활동 잘 하세요~~");
        NetworkAdapter adapter = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("메시지를 전송할 네트워크 : [1]WiFI [2]5G [3]LTE : ");
        int sel = sc.nextInt();
        switch (sel) {
            case 1: adapter = new WiFI(); break;
            case 2: adapter = new FiveG();break;
            case 3: adapter = new Lte();  break;
            default: System.out.println("전송할 네트워크 선택이 잘 못 되었습니다.");
        }
        if(adapter != null) cocoaTok.send(adapter);
    }
}
