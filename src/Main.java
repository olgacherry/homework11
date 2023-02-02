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

    public static void daysOfDelivery() {
        int deliveryDistance = 95;
        int time1 = 1;
        int time2 = time1 + 1;
        int time3 = time2 + 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + time1);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + time2);
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + time3);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }
        public static void main (String[]args){

            System.out.println("Задание 1");
            checkCurrentYear();
            System.out.println("Задание 2");
            checkClientOSAndClientDeviceYear();
            System.out.println("Задание 3");
            daysOfDelivery();
        }
    }








