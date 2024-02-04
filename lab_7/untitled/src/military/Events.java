package military;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import interfaces.*;
public class Events implements FileWork {
    protected List<MilitaryPersonnel> events = new ArrayList<>();

    public void addEvent(MilitaryPersonnel event) {
        events.add(event);
    }

    public void showEvents() {
        for(int i = 0; events.size() > i; i++){
            System.out.print(i + ". ");
            System.out.println(events.get(i));
        }
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
    public void removeEvent(){
        System.out.println("Введите индекс:");
        Scanner in = new Scanner(System.in);
        int find = in.nextInt();
        try {
        if(events.contains(events.get(find))){

               events.remove(find);
               System.out.println("Объект удалён");
           }
        else{
            System.out.println("Объект отсутствует");
        }
        } catch (IndexOutOfBoundsException e){
               System.out.println("Вне диапазона");
           }
    }
    @Override
        public void deleteFile() {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите индекс: ");
            String find = "D:\\Military_number_" + in.nextInt() + ".txt";
            Path path = Paths.get(find);
            try {
                Files.delete(path);
                System.out.println("Файл успешно удален.");
            } catch (NoSuchFileException e) {
                System.out.println("Файл не найден: " + e.getMessage());
            } catch (DirectoryNotEmptyException e) {
                System.out.println("Указанный путь является директорией и не может быть удален: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Произошла ошибка ввода-вывода при удалении файла: " + e.getMessage());
            }
        }
    @Override
    public void writeToFile() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите индекс: ");
        int find = in.nextInt();
        String file = "D:\\Military_number_" + find + ".txt";
        // Реализация записи данных о военном в файл
        try (FileWriter writer = new FileWriter(file, false)) {
            // Запись данных в файл
            writer.write(events.get(find).toString());
        } catch (IOException e) {
            System.out.println("Ошибка записи");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Вне диапазона");
        }
    }

    @Override
    public void readFromFile() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите индекс: ");
        String find = "D:\\Military_number_" + in.nextInt() + ".txt";
        // Реализация чтения данных о военном из файла
        try (BufferedReader reader = new BufferedReader(new FileReader(find))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Файл не найден");
        }
    }

    public void sortEvents(Comparator<MilitaryPersonnel> comparator){
        events.sort(comparator);
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
        int salaryAmount = in.nextInt();
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
        System.out.print("Введите сумму заработной платы: ");
        int salaryAmount = in.nextInt();
        MilitaryAdministrationBody mt = new MilitaryAdministrationBody(surname, company, title, dateOfBirth, dateIntoService, militaryUnit, districtName, position, yearsOfService, bonusAmount, salaryAmount);
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
        System.out.print("Введите сумму заработной платы: ");
        int salaryAmount = in.nextInt();
        Awarded mr = new Awarded(surname, company, title, dateOfBirth, dateIntoService, militaryUnit,awardName, bonus, bonusAmount, salaryAmount);
        System.out.println(mr + "\n");
        return mr;
    }

}
