package military;

public class MilitaryPersonnel {
    protected String surname;
    protected String company;
    protected String title;
    protected String dateOfBirth;
    protected String dateIntoService;
    protected String militaryUnit;
    protected int salaryAmount;

    public MilitaryPersonnel(String surname, String company, String title, String dateOfBirth, String dateIntoService, String militaryUnit, int salaryAmount) {
        this.surname = surname;
        this.company = company;
        this.title = title;
        this.dateOfBirth = dateOfBirth;
        this.dateIntoService = dateIntoService;
        this.militaryUnit = militaryUnit;
        this.salaryAmount = salaryAmount;
    }

    public int getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(int salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateIntoService() {
        return dateIntoService;
    }

    public void setDateIntoService(String dateIntoService) {
        this.dateIntoService = dateIntoService;
    }

    public String getMilitaryUnit() {
        return militaryUnit;
    }

    public void setMilitaryUnit(String militaryUnit) {
        this.militaryUnit = militaryUnit;
    }

    public String toString() {
        return "; Фамилия: '" + surname + '\'' +
                "; Компания: '" + company + '\'' +
                "; Звание: '" + title + '\'' +
                "; Дата рождения: '" + dateOfBirth + '\'' +
                "; Дата поступления на службу: '" + dateIntoService + '\'' +
                "; Часть: '" + militaryUnit + '\'' +
                "; Заработная плата: '" + salaryAmount + '\'';
    }
}