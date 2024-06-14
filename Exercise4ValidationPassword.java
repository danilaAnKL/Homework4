package Homework4;

import java.util.Scanner;

public class Exercise4ValidationPassword {
    public static void main(String[] args) {
        Scanner psw = new Scanner(System.in);

        System.out.println("Введите пароль");
        String password = psw.nextLine();
        if (password.length() < 8) {
            System.out.println("Пароль не менее 8 символов");
        } else if (!containsDigit(password)) {
            System.out.println("Пароль должен содержать минимум одну цифру.");
        } else if (!containsSpecialSymbol(password)) {
            System.out.println("Пароль должен содержать как минимум один спец.символ");
        }else {
            System.out.println("Пароль принят");
        }
    }

    public static boolean containsDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsSpecialSymbol(String str) {
        String SpecialSymbol = "!@#$%^&*№";
        for (char c : str.toCharArray()) {
            if (SpecialSymbol.contains(Character.toString(c))) {
                return true;
            }
        }
        return false;
    }

}
