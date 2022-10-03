import java.time.LocalDate;
public class Client {
    private String name;
    private int tableNr;
    private String orderedFood;
    private Double checkAmount;
    private LocalDate timeEnter;
    private LocalDate timeExit;





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTableNr() {
        return tableNr;
    }

    public void setTableNr(int tableNr) {
        this.tableNr = tableNr;
    }

    public String getOrderedFood() {
        return orderedFood;
    }

    public void setOrderedFood(String orderedFood) {
        this.orderedFood = orderedFood;
    }


    public Double getCheckAmount() {
        return this.checkAmount;
    }

    public void setCheckAmount(Double checkAmount) {
        this.checkAmount = checkAmount;
    }

    public LocalDate getTimeEnter() {
        return timeEnter;
    }

    public void setTimeEnter(LocalDate timeEnter) {
        this.timeEnter = timeEnter;
    }


    public LocalDate getTimeExit() {
        return timeExit;
    }

    public void setTimeExit(LocalDate timeExit) {
        this.timeExit = timeExit;
    }

    public Client(String name,int tableNr,String orderedFood, Double checkAmount,LocalDate timeEnter, LocalDate timeExit){
        this.name = name;
        this.tableNr = tableNr;
        this.orderedFood = orderedFood;
        this.checkAmount = checkAmount;
        this.timeEnter = timeEnter;
        this.timeExit = timeExit;
    }
}
