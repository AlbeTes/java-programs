package military;

public class Awarded extends MilitaryPersonnel{
    protected String awardName;
    protected String bonus;
    protected String bonusAmount;

    public Awarded(String surname, String company, String title, String dateOfBirth, String dateIntoService, String militaryUnit, String awardName, String bonus, String bonusAmount, int salatyAmount) {
        super(surname, company, title, dateOfBirth, dateIntoService, militaryUnit, salatyAmount);
        this.awardName = awardName;
        this.bonus = bonus;
        this.bonusAmount = bonusAmount;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(String bonusAmount) {
        this.bonusAmount = bonusAmount;
    }
    public String toString() {
        return "Награжденные: " +
                "Название награды: '" + awardName + '\'' +
                "; Премия: '" + bonus + '\'' +
                "; Сумма надбавки: '" + bonusAmount + " рублей"+ '\''
                + super.toString();
    }
}