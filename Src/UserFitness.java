public class UserFitness {
    private String name;
    private int dateOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String eMail;
    private String phoneNum;
    private String surname;
    private int weightAnInt;
    private int pressure;
    private int numberOfSteps;
    private int age;
    static int finalYear;


    static {
        finalYear=2020;
    }
    public UserFitness(String name, int dateOfBirth, int monthOfBirth, int yearOfBirth, String eMail, String phoneNum,
                       String surname, int weightAnInt, int pressure, int numberOfSteps) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.eMail = eMail;
        this.phoneNum = phoneNum;
        this.surname = surname;
        this.weightAnInt = weightAnInt;
        this.pressure = pressure;
        this.numberOfSteps = numberOfSteps;
    }

    public String getName() {
        return name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }


    public int getAge() {
        if(finalYear<yearOfBirth){
            System.out.println("Введіть рік народження коректно");

        }else{
            age=finalYear-yearOfBirth;
        }
        return age;
    }

    public String getEmail() {
        return eMail;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWeightAnInt() {
        return weightAnInt;
    }

    public void setWeightAnInt(int weightAnInt) {
        this.weightAnInt = weightAnInt;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getNumberOfSteps() {
        return numberOfSteps;
    }

    public void setNumberOfSteps(int numberOfSteps) {
        this.numberOfSteps = numberOfSteps;
    }


    public void printAccountInfo() {
        System.out.println("Ім'я: " + getName() + " Прізвище: " + getSurname() + " Дата народження: " + getDateOfBirth() + "." +
                getMonthOfBirth() + "." + getYearOfBirth() + " Електрона пошта: " + getEmail() + " Номер телефону: " + getPhoneNum() +
                " Вага: " + getWeightAnInt() + " Тиск: " + getPressure() + " Кількість кроків: " + getNumberOfSteps()+" Вік: "+getAge());
    }

}
