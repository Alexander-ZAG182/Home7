public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача 1");
        int cash = 15000;
        int total = 0;
        int mounth = 0;
        while (total <= 2_459_000) {
            mounth = mounth + 1;
            total = total + cash;
            System.out.println("Месяц " + mounth + " , сумма накоплений равна " + total + " рублей.");
        }
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int b = 10; b >= 1; b--)
            System.out.print(b + " ");
        System.out.println();
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertilityPer1000 = 17;
        int mortalityPer1000 = 8;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++) {
            population += population * fertilityPer1000 / 1000 - population * mortalityPer1000 / 1000;
            System.out.println("Год" + year + " ,численность населения составляет " + population + ".");
        }
        System.out.println("Задача 4");
        int disiredSum = 12_000_000;
        int sum = 0;
        int amount = 15000;
        double percent = 7D / 100;
        int numberMonth = 0;
        sum = amount;
        while (sum < disiredSum) {
            sum = (int) (sum * (1 + percent));
            numberMonth++;
            System.out.println("Месяц " + numberMonth + " сумма накоплений " + sum + " рублей ");
        }
        System.out.println("Задача 5");
        sum = amount;
        numberMonth = 0;
        while (sum < disiredSum) {
            sum = (int) (sum * (1 + percent));
            numberMonth++;
            if (numberMonth % 6 == 0) {
                System.out.println("Месяц " + numberMonth + " сумма накоплений " + sum + " рублей ");
            }
        }
        System.out.println("Задача 6");
        sum = amount;
        numberMonth = 0;
        int numberMonths = 12 * 9;
        while (numberMonth < numberMonths) {
            sum = (int) (sum * (1 + percent));
            numberMonth++;
            if (numberMonth % 6 == 0) {
                System.out.println("Месяц " + numberMonth + " сумма накоплений " + sum + " рублей ");
            }
        }
        System.out.println("Задача 7");
        int firstFriday = 1;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница," + day + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("Задача 8");
        int date = 79;
        int startSeeing = 0;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = startSeeing; year < end; year += date) {
            if (year > start) {
                System.out.println(year);
            }
        }


    }
}












