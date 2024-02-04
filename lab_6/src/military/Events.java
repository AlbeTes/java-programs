package military;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Events {
    protected List<MilitaryPersonnel> events = new ArrayList<>();

    public void addEvent(MilitaryPersonnel event) {
        events.add(event);
    }

    public void showEvents() {
        events.forEach(System.out::println);
        System.out.println();
    }
    public int findSurname() {
        Scanner in = new Scanner(System.in);
        String find;
        while (true) {
            System.out.print("Введите Фамилию: ");
            find = in.nextLine();
            for (int i = 0; i < events.size(); i++) {
                if (find.equals(events.get(i).getSurname())) {
                    System.out.println("Номер найденной Фамилии: " + (i + 1) + "\n");
                    return i;
                }
            }
            System.out.println("Совпадений не найдено!");
        }
    }


    public void replaceEvent(int index) {
        if(events.get(index) instanceof  ContractService) {
            events.remove(index);
            events.add(index, newEventCS());
        }
        else if(events.get(index) instanceof MilitaryAdministrationBody) {
            events.remove(index);
            events.add(index, newEventMAB());
        }
        else if (events.get(index) instanceof Awarded) {
            events.remove(index);
            events.add(index, newEventAW());
        }
    }

    public MilitaryPersonnel newEventCS() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        String surname = in.nextLine();
        System.out.print("Введите подразделение: ");
        String company = in.nextLine();
        System.out.print("Введите звание: ");
        String title = in.nextLine();
        System.out.print("Введите дату рождения: ");
        String dateOfBirth = in.nextLine();
        System.out.print("Введите дату поступления на службу: ");
        String dateIntoService = in.nextLine();
        System.out.print("Введите часть/подразделение военной службы: ");
        String militaryUnit = in.nextLine();
        System.out.print("Введите период контракта: ");
        String contractPeriod = in.nextLine();
        System.out.print("Введите дату заключения контракта: ");
        String contractDate = in.nextLine();
        System.out.print("Введите номер контракта: ");
        String contractNumber = in.nextLine();
        System.out.print("Введите протокол осмотра: ");
        String protocol = in.nextLine();
        System.out.print("Введите сумму заработной платы: ");
        String salaryAmount = in.nextLine();
        ContractService mc = new ContractService(surname, company, title, dateOfBirth, dateIntoService, militaryUnit, contractPeriod, contractDate, contractNumber, protocol, salaryAmount);
        System.out.println(mc + "\n");
        return mc;
    }

    public MilitaryPersonnel newEventMAB() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        String surname = in.nextLine();
        System.out.print("Введите подразделение: ");
        String company = in.nextLine();
        System.out.print("Введите звание: ");
        String title = in.nextLine();
        System.out.print("Введите дату рождения: ");
        String dateOfBirth = in.nextLine();
        System.out.print("Введите дату поступления на службу: ");
        String dateIntoService = in.nextLine();
        System.out.print("Введите часть/подразделение военной службы: ");
        String militaryUnit = in.nextLine();
        System.out.print("Введите название округа: ");
        String districtName = in.nextLine();
        System.out.print("Введите должность: ");
        String position = in.nextLine();
        System.out.print("Введите выслугу лет: ");
        String yearsOfService = in.nextLine();
        System.out.print("Введите сумму надбавки: ");
        String bonusAmount = in.nextLine();
        MilitaryAdministrationBody mt = new MilitaryAdministrationBody(surname, company, title, dateOfBirth, dateIntoService, militaryUnit, districtName, position, yearsOfService, bonusAmount);
        System.out.println(mt + "\n");
        return mt;
    }

    public MilitaryPersonnel newEventAW() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        String surname = in.nextLine();
        System.out.print("Введите подразделение: ");
        String company = in.nextLine();
        System.out.print("Введите звание: ");
        String title = in.nextLine();
        System.out.print("Введите дату рождения: ");
        String dateOfBirth = in.nextLine();
        System.out.print("Введите дату поступления на службу: ");
        String dateIntoService = in.nextLine();
        System.out.print("Введите часть/подразделение военной службы: ");
        String militaryUnit = in.nextLine();
        System.out.print("Введите название награды: ");
        String awardName = in.nextLine();
        System.out.print("Введите премию: ");
        String bonus = in.nextLine();
        System.out.print("Введите сумму надбавки: ");
        String bonusAmount = in.nextLine();
        Awarded mr = new Awarded(surname, company, title, dateOfBirth, dateIntoService, militaryUnit,awardName, bonus, bonusAmount);
        System.out.println(mr + "\n");
        return mr;
    }
}
