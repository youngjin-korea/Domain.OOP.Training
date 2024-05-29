package kosa.video_oop;

public class Video {
    //    번호, 제목, 배우
    private int num;
    private String title;
    private String actor;

    public Video() {
    }

    public Video(int num, String title, String actor) {
        this.num = num;
        this.title = title;
        this.actor = actor;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
