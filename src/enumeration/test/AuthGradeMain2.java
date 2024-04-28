package enumeration.test;

import enumeration.ref3.Grade;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String grade = scanner.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        printGradeMenu(authGrade);
    }

    private static void printGradeMenu(AuthGrade grade) {
        System.out.println("당신의 등급은 " + grade.getDescription() + "입니다.");
        System.out.println("==메뉴 목록==");
        System.out.println("- 메인 화면");
        if (grade.name().equals("GUEST")) {
            return;
        }
        System.out.println("- 이메일 관리 화면");
        if (grade.name().equals("LOGIN")) {
            return;
        }
        if (grade.name().equals("ADMIN")) {
            System.out.println("- 관리자 화면");
        }
    }
}
