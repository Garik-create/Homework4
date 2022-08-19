import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //task 1
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        //task 2
        System.out.println("\n");
        int firstFridayInMonth = 7;
        int totalDaysInMonths = 31;
        while (firstFridayInMonth <= totalDaysInMonths) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", firstFridayInMonth);
            firstFridayInMonth += 7;

        }

        //task 3
        System.out.println("");
        int currentYear = LocalDate.now().getYear();
        int startYear = currentYear - 200;
        int finishYear = currentYear + 100;
        for (int year = 0; year <= finishYear; year += 79) {
            if (year >= startYear && year <= finishYear) {
                System.out.println(year);
            }
        }

        //task 4 18:28
        System.out.println("\n");

        for (int count = 1; count <= 30; count++) {
            if (count % 3 == 0 && count % 5 != 0) {
                System.out.println(count + ": ping");
            } else if (count % 5 == 0 && count % 3 != 0) {
                System.out.println(count + ": pong");
            } else if (count % 15 == 0) {
                System.out.println(count + ": ping pong");
            } else {
                System.out.println(count + ":");
            }
        }
//18:46 + 15 min

//task 5 19:07
        int firstDigit = 0;
        int secondDigit = 1;

//19:14
//19:23
        System.out.print("\n" + firstDigit + " " + secondDigit);

        for (; i < 8; i++) {
            int sum = firstDigit + secondDigit;
            System.out.print(" " + sum);
            firstDigit = secondDigit;
            secondDigit = sum;
        }
//19:34
//task 6 19:35

    }
}