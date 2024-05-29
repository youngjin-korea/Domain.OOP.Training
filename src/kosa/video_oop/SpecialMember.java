package kosa.video_oop;

public class SpecialMember extends GeneralMember {

    private int point = 10;

    public SpecialMember() {
    }

    public SpecialMember(String id, String name, String address) {
        super(id, name, address);
    }

    public SpecialMember(String id, String name, String address, Video video) {
        super(id, name, address, video);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("회원의 보너스 포인터 적립 :" + point);
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
