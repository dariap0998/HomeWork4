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
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temp = 5;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч - можно ездить спокойно.");
        }
    }

    public static void task4(){
        System.out.println("Задача 4");
        int age = 10;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else {
            if (age >= 7 && age <= 18) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
            } else {
                if (age > 18 && age <= 24) {
                    System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
                } else {
                    if (age >24) {
                        System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
                    }
                }

                }
            }
    }

    public static void task5() {
        System.out.println("Задача 5");

    }
}


