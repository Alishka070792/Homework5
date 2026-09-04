//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Task 1");//Задача 1
        int clientOS = 1;
    if (clientOS == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке.");
    } else if (clientOS == 1) {
        System.out.println("Установите версию приложения для Android по ссылке.");
    } else {
        System.out.println("Операционная система не поддержвается.");
    }
        System.out.println("Task 2");//Задача 2
        int clientDeviceYear = 2013;
        if (clientOS == 1){
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке.");
            }
        } else if (clientOS == 0){
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        }

        System.out.println("Task 3");//Задача 3
        int year = 2022;
        if (year <= 1584) {
            System.out.println("Год должен быть больше, чем 1584.");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
         System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год является не високосным");
        }

        System.out.println("Task 4");//Задача 4
        int deliveryDistance = 95; // подумать
        int deliveryDays = 0;
        if (deliveryDistance > 100){
            System.out.println("Нет доставки");
        } else if (deliveryDistance > 60) {
          deliveryDays += 2;
          System.out.println("Потребуется " + deliveryDays + " дней.");
        } else if (deliveryDistance > 20) {
            deliveryDays += 1;
            System.out.println("Потребуется " + deliveryDays + " дней.");
        } else {
            System.out.println("Потребуется " + deliveryDays + " дней.");
        }

        System.out.println("Task 5");//Задача 5
        int monthNumber = 8;
        String season;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "autumn";
                break;
            default:
                System.out.println("Номер месяца должен быть от 1 до 12.");
                return;
        }
        System.out.println(monthNumber + " этот месяц принадлежит сезону  "+ season + ".");
    }
}