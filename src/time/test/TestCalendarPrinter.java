package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        printCalendar(year, month);

    }

    private static void printCalendar(int year, int month) {
        String[] day = {"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"};

        LocalDate localDate = LocalDate.of(year, month, 1);

        DayOfWeek firstDayOfWeek = localDate.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek();
        int firstDay = 0;
        for (int i = 0; i < day.length; i++) {
            System.out.printf("%3s", day[i]);
            if (day[i].toUpperCase().equals(firstDayOfWeek.toString().substring(0, 2))) {
                firstDay = i;
            }
        }
        System.out.println();

        while (localDate.getMonthValue() == month) {
            int dayOfMonth = localDate.getDayOfMonth();
            if ((dayOfMonth + firstDay - 1) % 7 == 0) {
                System.out.println();
            }
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
