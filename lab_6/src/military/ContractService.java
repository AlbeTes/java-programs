package military;

public class ContractService extends MilitaryPersonnel {
    protected String contractPeriod;
    protected String contractDate;
    protected String contractNumber;
    protected String protocol;
    protected String salaryAmount;

    public ContractService(String surname, String company, String title, String dateOfBirth, String dateIntoService, String militaryUnit, String contractPeriod, String contractDate, String contractNumber, String protocol, String salaryAmount) {
        super(surname, company, title, dateOfBirth, dateIntoService, militaryUnit);
        this.contractPeriod = contractPeriod;
        this.contractDate = contractDate;
        this.contractNumber = contractNumber;
        this.protocol = protocol;
        this.salaryAmount = salaryAmount;
    }


    public String getContractPeriod() {
        return contractPeriod;
    }

    public void setContractPeriod(String contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(String salaryAmount) {
        this.salaryAmount = salaryAmount;
    }
    public String toString() {
        return "Военная служба по контракту: " +
                "Период договора: '" + contractPeriod + '\'' +
                "; Дата договора: '" + contractDate + '\'' +
                "; Номер договора: '" + contractNumber + '\'' +
                "; Протокол: '" + protocol + '\'' +
                "; Сумма зарплаты: '" + salaryAmount + " рублей"+ '\''
                + super.toString();
    }

}