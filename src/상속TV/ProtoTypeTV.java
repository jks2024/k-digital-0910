package 상속TV;

import static 아이패드주문하기.Common.PROTOTYPE_CHANNEL_MAX;

public class ProtoTypeTV {
    boolean isPower;   // 전원에 대한 설정값
    int channel;
    int volume;
    public ProtoTypeTV() {
    }
    public ProtoTypeTV(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    public void setChannel(int cnl) {
        if (cnl > 0 && cnl < PROTOTYPE_CHANNEL_MAX) {
            channel = cnl;
        } else {
            System.out.println("채널 설정 범위가 아닙니다.");
        }
    }
}
