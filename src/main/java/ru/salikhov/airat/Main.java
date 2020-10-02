package ru.salikhov.airat;

public class Main {

    public static void main(String[] args) throws Exception {

        Read r = new Read();
        Calculator calc = new Calculator();

        while (true) {
            System.out.println("Введите выражение: ");
            String s = r.handleString(r.read());
            if (Validator.isValid(s)) {
                System.out.println("Ответ: " + calc.getAnswer(calc.ReversePolishNotation(s)));
            }
        }
    }
}