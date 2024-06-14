package Homework4;

import java.util.Scanner;

public class Exercise6MyProgram {
    public static void main(String[] args) {
        //Создаю новую карту
        Exercise6Card newCard = new Exercise6Card("2202 3303 4404 5505 6607", "12/34", 244, 4321);

        //вызываю метод для печати номера с маскировкой
        System.out.println("Номер карты с маскировкой:");
        newCard.printMaskedNumber();

        //создаю объект класса Scanner, для чтение ввода пользователи
        Scanner scanner = new Scanner(System.in);

        //запрашиваю у пользователя пин код
        System.out.println("\nВведите пин-код;");
        int enteredPin = scanner.nextInt(); //проверяет ввод данных с клавиатуры

        //вызываю метод для печати номера по введенному пин-коду
        newCard.printNumberPinCode(enteredPin);

        //закрыл сканнер
        scanner.close();
    }

}
