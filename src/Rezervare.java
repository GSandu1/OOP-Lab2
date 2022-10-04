import java.time.LocalDate;
public class Rezervare {
    private String name;
    private String surname;
    private LocalDate time;
    private int peopleAmount;
    private int tableNr;

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

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public int getPeopleAmount() {
        return peopleAmount;
    }

    public void setPeopleAmount(int peopleAmount) {
        this.peopleAmount = peopleAmount;
    }

    public int getTableNr() {
        return tableNr;
    }

    public void setTableNr(int tableNr) {
        this.tableNr = tableNr;
    }

    public Rezervare(String name,String surname,LocalDate time,int peopleAmount,int tableNr) {
        this.name= name;
        this.surname = surname;
        this.time = time;
        this.peopleAmount = peopleAmount;
        this.tableNr = tableNr;
    }

}
