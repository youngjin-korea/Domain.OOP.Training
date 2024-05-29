package kosa.phoneInfo;

import java.util.Scanner;

public class Manager {
    private Scanner sc;
    private PhoneInfo[] pi;
    private int count;

    public Manager() {
    }

    public Manager(Scanner sc) {
        this.pi = new PhoneInfo[10];
        this.count = 0;
        this.sc = sc;
    }

    public void addPhoneInfo() {
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.print("전화번호를 입력하세요: ");
        String phoneNo = sc.nextLine();
        System.out.print("생년월일을 입력하세요: ");
        String birth = sc.nextLine();
        System.out.println("전화번호가 등록 되었습니다.");
        pi[count++] = new PhoneInfo(name, phoneNo, birth);

    }

    public void listPhoneInfo() {
        for (int i = 0; i < count; i++) {
            pi[i].show();
        }
    }

    public void searchPheonInfo() {
        System.out.print("검색이름: ");
        String name = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (pi[i].getName().equals(name)) {
                pi[i].show();
            }
        }
    }
}
