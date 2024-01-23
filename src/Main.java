public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int sum1 = 15000;
        int totalAmount = 0;
        int months = 0;
        while (totalAmount <= 2_459_000) {
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
        int mortality =8;
        int birthRate = 17;
        for(int year = 2023; year < 2034; year++){
            int birthRate1 = population * birthRate / 1000;
            int mortality1 = population * mortality / 1000;
            int growth = birthRate1 - mortality1;
            population = population + growth;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
        // Задача 4
        System.out.println("Задача 4");
        int sum2 = 15000;
        int months1 = 0;
        int totalAmount1 = 15000;
        int savingGoal = 12_000_000;
        while (totalAmount1 < savingGoal) {
            int percent = totalAmount1 * 7 / 100;
            months1++;
            totalAmount1 = totalAmount1 + percent;
            totalAmount1 = totalAmount1 + sum2;
            System.out.println("Месяц " + months1 + ", сумма накопленний равна " + totalAmount1 + " рублей");
        }
        // Задача 5
        System.out.println("Задача 5");
        int sum3 = 15000;
        int months2 = 0;
        int totalAmount3 = 15000;
        int savingGoal1 = 12_000_000;
        while (totalAmount3 < savingGoal1) {
            int percent = totalAmount1 * 7 / 100;
            months2++;
            totalAmount3 = totalAmount3 + percent;
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
        int year = 9;
        int yearInMonths = 9 * 12;
        while (months3 < yearInMonths) {
            months3++;
            int percent = totalAmount1 * 7 / 100;
            totalAmount4 = totalAmount4 + percent;
            totalAmount4 = totalAmount4 + sum4;
            if (months3 % 6 == 0){
            System.out.println("Месяц " + months3 + ", сумма накопленний равна " + totalAmount4 + " рублей");
        }
            }
        // Задача 7
        System.out.println("Задача 7");
        int numberOfDaysInAMonth = 31;
        int pyatnica = 7;
        for (int i = pyatnica ; i <= numberOfDaysInAMonth; i = i + 7){
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
        // Задача 8
        System.out.println("Задача 8");
        int currentYear = 2024;
        int twoHundredYearsBeforeTheCurrentYear = currentYear - 200;
        int oneHundredYearsBeforeTheCurrentYear = currentYear + 100;
        int cometArrival = 0;
        int cometArrival1 = 79;
        while (cometArrival < oneHundredYearsBeforeTheCurrentYear ){
            if(cometArrival > twoHundredYearsBeforeTheCurrentYear){
                System.out.println(cometArrival);
            }
            cometArrival =  cometArrival + cometArrival1;
        }
    }
}