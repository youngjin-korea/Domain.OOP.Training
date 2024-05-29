package kosa.video_oop;

public class Main {
    public static void main(String[] args) {
        Video v1 = new Video(1, "helloJava", "king");
        GeneralMember sm = new SpecialMember("책보는냥이", "김희철", "남대문구", v1);
        GeneralMember gm = new GeneralMember("책보는냥이", "김희철", "남대문구", v1);

        sm.show();
        gm.show();
    }
}
