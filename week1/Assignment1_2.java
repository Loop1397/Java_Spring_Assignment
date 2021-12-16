import java.util.Scanner;

// package assignment;

public class Assignment1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        while (true) {
            System.out.println("[메뉴 선택]");
            System.out.println("1. 회원 관리");
            System.out.println("2. 과목 관리");
            System.out.println("3. 수강 관리");
            System.out.println("4. 결제 관리");

            input = scanner.nextInt();

            if (input == 1)
                System.out.println("회원 관리 메뉴를 선택했습니다.");
            else if (input == 2)
                System.out.println("과목 관리 메뉴를 선택했습니다.");
            else if (input == 3)
                System.out.println("수강 관리 메뉴를 선택했습니다.");
            else if (input == 4)
                System.out.println("결제 관리 메뉴를 선택했습니다.");
            else if (input == 5) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
        }
    }
}
