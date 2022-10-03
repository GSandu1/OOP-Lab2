public class PersonalDeservire {
    private String name;
    private String surname;
    private int age;
    private double salary;
    private String position;
    private int accesCode;
    private String gender;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getaccesCode() {
        return accesCode;
    }

    public void setAccesCode(int accesCode) {
        this.accesCode = accesCode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public PersonalDeservire(String name, String surname,int age,Double salary,String position,int accesCode,String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.position = position;
        this.accesCode = accesCode;
        this.gender = gender;
    }


}
