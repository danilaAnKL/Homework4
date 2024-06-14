package Homework4;

public class Exercise6Card {
    //поля для класса
    private String cardNumber;
    private String expiryDate;
    private int CVV;
    private int pinCode;

    //генерим конструктор
    public Exercise6Card(String cardNumber, String expiryDate, int CVV, int pinCode) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.CVV = CVV;
        this.pinCode = pinCode;

    }
    // Метод для печати номера карты с маскировкой
    public void printMaskedNumber(){
        String maskedNumber = "**** **** ****"+ cardNumber.substring(cardNumber.length() -4);
        System.out.println(maskedNumber);
    }

    // Пишу метод для печати номера карты по введенному пин-коду
    public void printNumberPinCode(int enteredPin){
        if (enteredPin == pinCode) {
            System.out.println("Номер карты:" + cardNumber);
        } else {
            System.out.println("Неверный пин код");
        }
    }
}
