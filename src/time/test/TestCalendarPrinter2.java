package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        printCalendar(year, month);

    }

    private static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;
        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        DayOfWeek firstDayOfWeek = localDate.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek();
        int firstDay = 0;

        while (localDate.getMonthValue() == month) {
            int dayOfMonth = localDate.getDayOfMonth();
            if ((dayOfMonth - 1) < firstDay) {
                localDate = localDate.plusDays(1);
                System.out.printf("%3s", " ");
                continue;
            }
            System.out.printf("%3d", dayOfMonth);
            localDate = localDate.plusDays(1);
        }
    }
}
