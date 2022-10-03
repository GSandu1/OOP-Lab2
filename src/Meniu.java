public class Meniu {
    private String food;
    private Double price;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(Double price) {
        this.price = price;
    }

    public Meniu(String food, Double price) {
        this.food = food;
        this.price = price;
    }
}
