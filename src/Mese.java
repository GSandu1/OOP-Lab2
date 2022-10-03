public class Mese {
    private int freeTables;
    private int fullTables;
    private int reservedTables;

    public int getFreeTables() {
        return this.freeTables;
    }

    public void setFreeTables(int freeTables) {
        this.freeTables = freeTables;
    }
    public int getFullTables() {
        return this.fullTables;
    }

    public void setFullTables(int freeTables) {
        this.fullTables = fullTables;
    }
    public int getReservedTables() {
        return this.reservedTables;
    }

    public void setReservedTablese(int reservedTables) {
        this.reservedTables = reservedTables;
    }

    public Mese(int freeTables,int fullTables,int reservedTables) {
        this.freeTables = freeTables;
        this.fullTables = fullTables;
        this.reservedTables =reservedTables;
    }


}
