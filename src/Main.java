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
    }
}