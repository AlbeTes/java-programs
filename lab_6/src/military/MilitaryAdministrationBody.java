package military;

public class MilitaryAdministrationBody extends MilitaryPersonnel{
    protected String districtName;
    protected String position;
    protected String yearsOfService;
    protected String bonusAmount;

    public MilitaryAdministrationBody(String surname, String company, String title, String dateOfBirth, String dateIntoService, String militaryUnit, String districtName, String position, String yearsOfService, String bonusAmount) {
        super(surname, company, title, dateOfBirth, dateIntoService, militaryUnit);
        this.districtName = districtName;
        this.position = position;
        this.yearsOfService = yearsOfService;
        this.bonusAmount = bonusAmount;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(String yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public String getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(String bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    @Override
    public String toString() {
        return "Органы военного управления: " +
                "Название округа: '" + districtName + '\'' +
                "; Должность: '" + position + '\'' +
                "; Выслуга лет: '" + yearsOfService + '\'' +
                "; Сумма надбавки: '" + bonusAmount + " рублей"+ '\''
                + super.toString();
    }
}