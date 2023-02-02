import java.sql.SQLOutput;

public class Main {
    public static void checkCurrentYear() {
        int currentYear = 2023;
        if (currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0) {
            System.out.println(currentYear + " високосный год");
        } else {
            System.out.println(currentYear + " не високосный год");
        }
    }

    public static void checkClientOSAndClientDeviceYear() {

        int clientOS = 1;
        int clientDeviceYear = 2018;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void checkDaysOfDelivery() {
        int deliveryDistance = 95;
        int daysOfDelivery = 1;

        if (deliveryDistance > 20 && deliveryDistance < 60) {
            daysOfDelivery++;
            System.out.println("Потребуется дней " + daysOfDelivery);
        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            daysOfDelivery++;
            System.out.println("Потребуется дней " + ++daysOfDelivery);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
    public static void main (String[]args){

            System.out.println("Задание 1");
            checkCurrentYear();
            System.out.println("Задание 2");
            checkClientOSAndClientDeviceYear();
            System.out.println("Задание 3");
            checkDaysOfDelivery();
        }
    }








