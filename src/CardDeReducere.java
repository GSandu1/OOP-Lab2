public class CardDeReducere {

    private String name;
    private String surname;
    private int nrCard;
    private float discountAmount;

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

    public int getNrCard() {
        return nrCard;
    }

    public void setNrCard(int nrCard) {
        this.nrCard = nrCard;
    }

    public float getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(float discountAmount) {
        this.discountAmount = discountAmount;
    }

    public CardDeReducere(String name,String surname, int nrCard,float discountAmount) {
        this.name = name;
        this.surname = surname;
        this.nrCard = nrCard;
        this.discountAmount = discountAmount;
    }
}
