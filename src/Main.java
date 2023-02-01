public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

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
        int age = 13;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else {
            if (age >= 5 && age < 14) {
                System.out.println("Если возраст ребенка равен " + age + ", он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
            } else {
                if (age >= 14) {
                    System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
                }
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int trainLoad = 60;
        if (trainLoad < 60) {
            System.out.println("В настоящий момент в вагоне занято " + trainLoad + " мест, вы можете занять сидячие место.");
        } else {
            if (trainLoad >= 60 && trainLoad < 102) {
                System.out.println("В настоящий момент в вагоне занято " + trainLoad + " места, вы можете занять стоячее место.");
            } else {
                if (trainLoad >= 102) {
                    System.out.println("В настоящий момент вагон полностью забит.");
                }
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 2;
        int two = 2;
        int three = 1;
        if (one > two && one > three) {
            System.out.println("Число " + one + " бОльшее.");
        } else {
            if (two > one && two > three) {
                System.out.println("Число " + two + " бОльшее.");
            } else {
                if (three > one && three > two) {
                    System.out.println("Число " + three + " бОльшее.");
                } else {
                    if (one == two && one > three) {
                        System.out.println("Число " + one + " бОльшее. И, кстати, оно совпадает со вторым числом.");
                    } else {
                        if (one == three && one > two) {
                            System.out.println("Число " + one + " бОльшее. И, кстати, оно совпадает с третьим числом.");
                        } else {
                            if (two == three && three > one) {
                                System.out.println("Число " + three + " бОльшее. И, кстати, оно совпадает со вторым числом.");
                            } else {
                                if (one == two && one == three && three == two) {
                                    System.out.println("Нет бОльшего числа. Они все одинаковы!");
                                }
                            }
                        }

                }
            }
        }
    }
}

}



