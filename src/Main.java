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

    }
}