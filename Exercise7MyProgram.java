package Homework4;

import org.example.Car;

public class Exercise7MyProgram {
    public static void main(String[] args) {
        //Создаю объект класса Car
        Exercise7Car myCar = new Exercise7Car("Mersedes", "Benz007", 0);

        //Запрашиваю текущую скорость и вывожу
        int speed = myCar.getCurrentSpeed();
        System.out.println("Текущая скорость " + speed + " км/час");

        //с помощью метода speedUp увеличиваю скорость
        myCar.speedUp(25);

        //запрашиваю скорость и вывожу
        speed = myCar.getCurrentSpeed();
        System.out.println("Текущая скорость " + speed + " км/час");

        // с помощью метода break уменьюшаю на 10
        myCar.brake();

        //запрашиваю скорость и вывожу
        speed = myCar.getCurrentSpeed();
        System.out.println("Текущая скорость " + speed + " км/час");


        // с помощью метода break уменьюшаю еще раз на 10
        myCar.brake();

        //запрашиваю скорость и вывожу
        speed = myCar.getCurrentSpeed();
        System.out.println("Текущая скорость " + speed + " км/час");


    }
}
