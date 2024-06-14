package Homework4;

public class Exercise7Car {
    //поля для класса
    private String model;
    private String Brand;
    private int currentSpeed;

    //конструктор для класса
    public Exercise7Car(String model, String brand, int currentSpeed) {
        this.model = model;
        Brand = brand;
        this.currentSpeed = currentSpeed;
    }

    //Метод для получения текущей скорости
    public int getCurrentSpeed(){
        return currentSpeed;
    }

    //Метод для увеличения скорости на заданное число. В данном случае increment выстапает параметром
    //как некое значение на которое нужно увеличить скорость
    public void speedUp (int incremet) {
        this.currentSpeed += incremet;
    }

    //Метод для уменьшения скорость
    public void brake() {
        if(this.currentSpeed <= 10){
            this.currentSpeed = 0;
        }else {
            this.currentSpeed -=10;
        }
    }
}
