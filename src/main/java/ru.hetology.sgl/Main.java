package ru.hetology.sgl;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        int actual = service.sguareBorders(5, 100);
        int expected = 1;
        System.out.println("Границы проверки от 5 до 100" + " ОР: " + actual + "  ФР: " + expected);

    }
}
