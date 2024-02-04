import military.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import java.util.Comparator;
import java.util.Scanner;
import interfaces.*;

public class Main{
    private static Events e = new Events();

    public static void main(String[] args) {
        e.addEvent(new MilitaryAdministrationBody(
                "Иванов", "10-я рота", "Сержант", "01.01.1990", "01.05.2010",
                "7-я мотострелковая дивизия",  "Западный военный округ",
                "Старший сержант", "10 лет", "5000 руб.", 10000
        ));
        e.addEvent(new ContractService(
                "Петров", "15-я рота", "Лейтенант", "05.07.1985", "01.02.2012",
                "3-й танковый полк",  "3 года", "10.05.2012", "CN12345",
                "Протокол №567", 7000
        ));
        e.addEvent(new Awarded(
                "Сидоров", "20-я рота", "Капитан", "15.03.1988", "01.09.2015",
                "5-я гвардейская дивизия",  "Орден Мужества", "Почетная грамота",
                "2000 руб.", 12000
        ));
        menu();
    }

    private static void menu() {
        Scanner in = new Scanner(System.in);
        mark:
        while (true) {
            System.out.println("1. Добавить информацию о военном");
            System.out.println("2. Показать список");
            System.out.println("3. Найти Фамилию");
            System.out.println("4. Найти Фамилию и изменить");
            System.out.println("5. Удалить военного");
            System.out.println("6. Записать TXT файл");
            System.out.println("7. Прочитать TXT файл");
            System.out.println("8. Удалить TXT файл");
            System.out.println("0. Выход");
            int result = in.nextInt();

            switch (result) {
                case 1:
                    System.out.println("1. Добавить в Органы военного управления");
                    System.out.println("2. Добавить в Военная служба по контракту");
                    System.out.println("3. Добавить в Награжденные");
                    int num = in.nextInt();
                    if (num == 1) {
                        e.addEvent(e.newEventMAB());
                    }
                    if (num == 2) {
                        e.addEvent(e.newEventCS());
                    }
                    if (num == 3) {
                        e.addEvent(e.newEventAW());
                    } else {
                        break;
                    }
                    break;
                case 2:
                    e.showEvents();
                    System.out.println("1. Сортировка по Фамилии");
                    System.out.println("2. Сортрировка по отделениям");
                    int n = in.nextInt();
                    if (n == 1) {
                        e.sortEvents(Comparator.comparing(MilitaryPersonnel::getSurname));
                        e.showEvents();
                    }
                    if (n == 2) {
                        e.sortEvents(Comparator.comparing(MilitaryPersonnel::getSalaryAmount));
                        e.showEvents();
                    }
                    break;
                case 3:
                    e.findSurname();
                    break;
                case 4:
                    e.replaceEvent(e.findSurname());
                    break;
                case 5:
                    e.removeEvent();
                    break;
                case 6:
                    e.writeToFile();
                    break;
                case 7:
                    e.readFromFile();
                    break;
                case 8:
                    e.deleteFile();
                    break;
                default:
                    break mark;
            }
        }
    }
}


