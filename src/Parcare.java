public class Parcare {
    private int freeSpots;
    private int fullSpots;
    private int reservedSpots;

    public int getFreeSpots() {
        return this.freeSpots;
    }

    public void setFreeSpots(int freeSpots) {
        this.freeSpots = freeSpots;
    }
    public int getFullSpots() {
        return this.fullSpots;
    }

    public void setFullSpots(int fullSpots) {
        this.fullSpots = fullSpots;
    }
    public int getReservedSpots() {
        return this.reservedSpots;
    }

    public void setReservedSpots(int reservedSpots) {
        this.reservedSpots = reservedSpots;
    }

    public Parcare(int freeSpots,int fullSpots,int reservedSpots) {
        this.freeSpots = freeSpots;
        this.fullSpots = fullSpots;
        this.reservedSpots =reservedSpots;
    }

}
