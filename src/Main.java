public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // tesk1
        int clientOS = 0;
        if (clientOS < 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // tesk2
        int clientOS1 = 1;
        int clientDeviceYear = 2018;
        if (clientOS1 < 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS1 < 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //tesk 3
        int year = 2022;
        if (year > 1584) {
            if (year % 4 == 0 && year % 100 != 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " год является високосным");
                }
            }else {
                    System.out.println(year + " год не является високосным");
                }
            }

        //tesk4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 !");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2 !");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3 !");
        } else {
            System.out.println("Доставки нет!");
        }
        //tesk5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц является зимним!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц является весенним!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц является летним!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц является осенним!");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }
    }
}