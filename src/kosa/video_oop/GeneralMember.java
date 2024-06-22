package kosa.video_oop;

public class GeneralMember {
    //    field 변수
    private String id;
    private String name;
    private String address;
    private Video video;

    //    constructor
    public GeneralMember() {
    }

    public GeneralMember(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public GeneralMember(String id, String name, String address, Video video) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.video = video;
    }

    //    method
    public void show() {
        System.out.println("회원의 아이디 :" + id);
        System.out.println("회원의 이름 :" + name);
        System.out.println("회원의 주소 :" + address);
        if (video == null) {
            System.out.println("회원이 대여한 비디오는 없습니다.");
            return;
        }
        System.out.println("회원이 대여한 비디오 번호 :" + video.getNum());
        System.out.println("회원이 대여한 비디오 제목 :" + video.getTitle());
        System.out.println("회원이 대여한 비디오 주인공 :" + video.getActor());
    }

    //    GETTER SETTER
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
