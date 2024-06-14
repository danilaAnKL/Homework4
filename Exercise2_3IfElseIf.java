package Homework4;

public class Exercise2_3IfElseIf {
    public static void main(String[] args) {
        int twoCondition = 16;
        // я думал, что можно объеденить эти задания в одном...
        if (twoCondition % 2 == 0 && twoCondition % 4 == 0) {
            System.out.println("Четное число. Кратное четырем");
        } else if (twoCondition % 2 != 0 && twoCondition % 3 == 0) {
            System.out.println("Нечетное число. Кратно трем");
        } else if (twoCondition % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }

    }

}
