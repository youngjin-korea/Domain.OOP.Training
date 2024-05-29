package kosa.phoneInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager m = new Manager(sc);
        String menu = "";
        while (!menu.equals("4")) {
            System.out.print("1.추가 2.전체출력 3.검색 4.종료:");
            menu = sc.nextLine();
            switch (menu) {
                case "1":
                    m.addPhoneInfo();
                    break;
                case "2":
                    m.listPhoneInfo();
                    break;
                case "3":
                    m.searchPheonInfo();
                    break;
                case "4":
                    System.out.println("프로그램을 종료합니다.");
                    break;

            }
        }
    }
}
