// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int operatingSystem = 0;
        if (operatingSystem == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int operatingSystem = 0;
        int clientDeviceYear = 2019;
        if (operatingSystem == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (operatingSystem == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (operatingSystem == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (operatingSystem == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2099;
        int leapYear = 4;
        int notLeepYear = 100;
        int leepYear400 = 400;
        if (year % leapYear == 0 && year % notLeepYear != 0 || year % leepYear400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 150;
        int estimatedDeliveryTime1 = 1;
        int estimatedDeliveryTime2 = 2;
        int estimatedDeliveryTime3 = 3;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней " + estimatedDeliveryTime1);
        } else if (deliveryDistance >20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней " + estimatedDeliveryTime2);
        } else if (deliveryDistance > 60 && deliveryDistance <100) {
            System.out.println("Потребуется дней " + estimatedDeliveryTime3);
        } else {
            System.out.println("Доставки нет");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 6;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }
    }


}