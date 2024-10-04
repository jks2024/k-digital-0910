package 인터페이스기본;

public interface NetworkAdapter {
    void connect();   // 인터페이스에 포함된 메서드는 자동으로 public abstract 가 추가됨
}

class WiFi implements NetworkAdapter {
    String company;
    WiFi(String company) {
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + " WiFI에 연결 되었습니다.");
    }
}

class FiveG implements NetworkAdapter {
    String company;
    FiveG(String company) {
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + " 5G에 연결 되었습니다.");
    }
}

class Lte implements NetworkAdapter {
    String company;
    Lte(String company) {
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + " LTE에 연결 되었습니다.");
    }
}

