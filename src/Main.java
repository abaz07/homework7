public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int sum1 = 15000;
        int totalAmount = 0;
        int months = 0;
        while (totalAmount < 2_459_000) {
            months++;
            totalAmount = totalAmount + totalAmount/100;
            totalAmount = totalAmount + sum1;
            System.out.println("Месяц " + months + ", сумма накопленний равна " + totalAmount + " рублей");
        }
        // Задача 2
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10){
            number++;
            System.out.print( number );
        }
        System.out.println();
        for(int number1 = 10; number1 > 0; number1--){
            System.out.print(number1);
        }
        // Задача 3
        System.out.println("Задача 3");
        int population = 12_000_000;
        int growthInOneYear = population/1000 * (17-8);
        for(int year = 2023; year < 2034; year++){
            population = population + growthInOneYear;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
        // Задача 4
        System.out.println("Задача 4");
        int sum2 = 15000;
        int months1 = 0;
        int totalAmount1 = 15000;
        while (totalAmount1 < 12_000_000) {
            months1++;
            totalAmount1 = totalAmount1 + (totalAmount1 * 7 / 100);
            totalAmount1 = totalAmount1 + sum2;
            System.out.println("Месяц " + months1 + ", сумма накопленний равна " + totalAmount1 + " рублей");
        }
        // Задача 5
        System.out.println("Задача 5");
        int sum3 = 15000;
        int months2 = 0;
        int totalAmount3 = 15000;
        while (totalAmount3 < 12_000_000) {
            months2++;
            totalAmount3 = totalAmount3 + (totalAmount3 * 7 / 100);
            totalAmount3 = totalAmount3 + sum3;
            if (months2 % 6 == 0) {
                System.out.println("Месяц " + months2 + ", сумма накопленний равна " + totalAmount3 + " рублей");
            }
        }
        // Задача 6
        System.out.println("Задача 6");
        int sum4 = 15000;
        int months3 = 0;
        int totalAmount4 = 15000;
        while (months3 < 108) {
            months3++;
            totalAmount4 = totalAmount4 + (totalAmount4 * 7 / 100);
            totalAmount4 = totalAmount4 + sum4;
            if (months3 % 6 == 0){
            System.out.println("Месяц " + months3 + ", сумма накопленний равна " + totalAmount4 + " рублей");
        }
            }
        // Задача 7
        System.out.println("Задача 7");
        int numberOfDaysInAMonth = 30;
        for (int pyatnica = 7; pyatnica <= numberOfDaysInAMonth; pyatnica = pyatnica + 7){
            System.out.println("Сегодня пятница, " + pyatnica + "-е число. Необходимо подготовить отчет");
        }
        // Задача 8
        System.out.println("Задача 8");

    }
}