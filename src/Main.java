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
        int clientDeviceYear = 2022;
        if (clientOS == 1){
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке.");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        }

        System.out.println("Task 3");//Задача 4
    }
}