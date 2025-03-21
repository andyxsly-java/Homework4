
public class Main {
    public static void main(String[] args) {
        //Задание 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }
        //Задание 2
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        //Задание 3
        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придётся заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        //Задание 4
        int yearsOld = 33;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в детский сад");
        }
        if (yearsOld >= 7 && yearsOld <= 17) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу");
        }
        if (yearsOld >= 18 && yearsOld <= 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в университет");
        }
        if (yearsOld > 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить на работу");
        }
        //Задание 5
        int ageChild = 7;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        }
        if (ageChild > 5 || ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься без сопровождения взрослого");
        }
        //Задание 6
        int passengers = 33;
        if (passengers < 60) {
            System.out.println("Есть сидячие места");
        }
        else if (passengers >= 60 && passengers < 102) {
            System.out.println("Есть стоячие места");
        }
        else
            System.out.println("Мест нет");
        //Задание 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Первое число самое большое");
        } else if (two > one && two > three) {
            System.out.println("Второе число самое большое");
        } else {
            System.out.println("Третье число самое большое");
        }
    }
}