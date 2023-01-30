public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int year=2001;
        checkAndPrintYear(year);


    }

    public static void checkAndPrintYear(int year){
        int a=year%4;
        int b=year%100;
        int c=year%400;
        if(a==0&&b!=0||c==0){
            System.out.println(year+" год является високосным");
        } else {
            System.out.println(year+" год не является високосным");
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS=1;
        int clientDeviceYear=2012;
        changeVersion(clientOS,clientDeviceYear);

    }
    public static void changeVersion(int clientOS,int clientDeviceYear){
        if(clientOS==0&&clientDeviceYear>=2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if(clientDeviceYear<2015&&clientOS==0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if(clientOS==1&&clientDeviceYear>=2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if(clientDeviceYear<2015&&clientOS==1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }
    public static void task3 () {
        System.out.println("Задача 3");
        int deliveryDistance=99;
        int day=calculateDays(deliveryDistance);
        if(deliveryDistance>100) {
            System.out.println("Доставки нет");
        }else {
            System.out.println("Потребуется дней: " + day);
        }

    }
    public static int calculateDays(int deliveryDistance){
        int day=1;
        if(deliveryDistance>20){
            day=day+1;
        }
        if(deliveryDistance>=20&&deliveryDistance<60){
            day=2;
        }
        if(deliveryDistance>60){
            day=day+1;
        }
        return day;

    }
}


